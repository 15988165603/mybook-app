package com.mybook.app.feign;

import com.mybook.app.dto.amapLbsDto.AmapLbsApiResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0 createTime: 2017/7/18 13:45
 * @see
 * @since 1.0
 * 获取高德地图经纬度
 */
@FeignClient(url = "${web.amapLbsApiUrl}", name = "amapLbsApiUrl")
public interface AmapLbsFeign {
    @RequestMapping("/v3/geocode/geo")
    AmapLbsApiResponse selectLbs(@RequestParam("key") String key, @RequestParam("address") String address);
}
