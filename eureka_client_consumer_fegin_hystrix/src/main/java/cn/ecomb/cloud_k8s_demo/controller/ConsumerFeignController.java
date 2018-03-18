package cn.ecomb.cloud_k8s_demo.controller;

import cn.ecomb.cloud_k8s_demo.provide.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/feign")
public class ConsumerFeignController {

    @Autowired
    Provider provider;

    @GetMapping
    public String getConsumer() {
        return provider.provide();
    }
}
