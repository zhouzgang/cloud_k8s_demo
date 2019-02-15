package cn.ecomb.cloud_k8s_demo.controller;

import cn.ecomb.cloud_k8s_demo.provide.DataProvider;
import cn.ecomb.cloud_k8s_demo.provide.RecommendProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/location")
public class LocationController {

    @Autowired
    DataProvider dataProvider;

    @Autowired
    RecommendProvider recommendProvider;

    private final Logger logger = LoggerFactory.getLogger(LocationController.class);

    @GetMapping
    public String getConsumer() {
        logger.info("trance--- /location -----------");
        return dataProvider.provide();
    }

    @GetMapping("recommend")
    public String getConsumerRecommend() {
        logger.info("trance--- /location Recommend-----------");
        return recommendProvider.recommend();
    }
}
