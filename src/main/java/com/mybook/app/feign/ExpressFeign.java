package com.mybook.app.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0 createTime: 2017/7/18 13:45
 * @see
 * @since 1.0
 * 快递100
 */

@FeignClient(url = "${web.express100Url}", name = "express100Url")
public interface ExpressFeign {
    @Transactional(propagation = Propagation.NEVER)
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String expressData(@RequestParam Map<String, Object> map);

    /**
     * 查看快递流程
     *
     * @param key 快递100的授权key，如果已有快递100的key，可以直接使用已有的；如果还没有申请，请点击 快递查询API进行申请。
     * @param com 快递公司编码
     * @param nu  快递单号
     * @return
     */
    @Transactional(propagation = Propagation.NEVER)
    @RequestMapping(value = "/applyurl", method = RequestMethod.GET)
    public String queryExpressData(@RequestParam("key") String key, @RequestParam("com") String com, @RequestParam("nu") String nu);
}
