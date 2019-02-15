package cn.ecomb.cloud_k8s_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouzhigang on 2017/6/21.
 */
@RestController
public class DataController {

//    ----- 使用 ribbon
//    @Autowired
//    private RestTemplate restTemplate;

//    @GetMapping("/user/{id}")
//    public User find(@PathVariable("id") Long id) {
//
//        return this.restTemplate.getForObject("http://microservice-simple-provider-user/user/" + id, User.class);
//    }
//
//
//    @GetMapping("/user/s")
//    public String finds() {
//
//        return this.restTemplate.getForObject("http://MICROSERVICE-SIMPLE-PROVIDER-USER/user/s", String.class);
//    }


/*    ----- 使用 feign */

//    @Autowired
//    private UserFeignClient userFeignClient;
//
//    @GetMapping("/user/{id}")
//    public User findById(@PathVariable("id") Long id) {
//        return this.userFeignClient.findById(id);
//    }


    private final Logger logger = LoggerFactory.getLogger(DataController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/provide")
    public String getData() throws InterruptedException {

//        Thread.sleep(5000L);
        logger.info("trance--: /provide");
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/jar")
    public String getTestJar() {

        return "以jar形式启动！！！";
    }

}
