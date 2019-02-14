package cn.ecomb.cloud_k8s_demo.controller;

import cn.ecomb.cloud_k8s_demo.provide.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/feign")
public class ConsumerFeignAController {

    @Autowired
    Provider provider;

    private final Logger logger = LoggerFactory.getLogger(ConsumerFeignAController.class);

    @GetMapping
    public String getConsumer() {
        logger.info("trance--- /feign");
        return provider.provide();
    }
}
