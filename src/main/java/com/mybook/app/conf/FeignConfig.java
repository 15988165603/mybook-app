package com.mybook.app.conf;


import com.mybook.app.exception.FeignError;
import feign.*;
import feign.codec.ErrorDecoder;
import feign.okhttp.OkHttpClient;
import okhttp3.ConnectionPool;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * feign 配置信息
 * Created by web on 2017/6/9.
 */
@Configuration
public class FeignConfig {


    /**
     * 打印日志
     *
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 设置连接时间和读取时间
     *
     * @return
     */
    @Bean
    public Request.Options options() {
        Request.Options options = new Request.Options(10 * 1000, 10 * 1000);
        return options;
    }

    /**
     * 重试次数
     *
     * @return
     */
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }

    /**
     * 默认校验规则
     *
     * @return
     */
    @Bean
    public Contract contract() {
        return new SpringMvcContract();
    }


    /**
     * 设置连接客户端
     *
     * @return
     */
    @Bean
    public Client okHttpClient() {
        return new OkHttpClient(new okhttp3.OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .connectionPool(new ConnectionPool(5, 5, TimeUnit.MINUTES))
                .build());
    }

    @Bean
    public ErrorDecoder defaultErrorDecoder() {
        return new ErrorDecoder() {
            @Override
            public Exception decode(String methodKey, Response response) {
                String responseBody = "";
                if (response.status() >= HttpStatus.BAD_REQUEST.value()) {

                    try {
                        if (null != response.body()) {
                            responseBody = Util.toString(response.body().asReader());
                        }

                    } catch (IOException ioException) {

                    }
                    throw new FeignError(responseBody);
                }

                return new Default().decode(methodKey, response);
            }
        };
    }

}
