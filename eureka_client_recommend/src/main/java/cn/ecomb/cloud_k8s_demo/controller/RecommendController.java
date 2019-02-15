package cn.ecomb.cloud_k8s_demo.controller;

import cn.ecomb.cloud_k8s_demo.provide.DataProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/recommend")
public class RecommendController {

    @Autowired
    DataProvider provider;

    private final Logger logger = LoggerFactory.getLogger(RecommendController.class);

    @GetMapping
    public String getConsumer() {
        logger.info("trance--- /recommend -----------");
        return provider.provide();
    }
}
