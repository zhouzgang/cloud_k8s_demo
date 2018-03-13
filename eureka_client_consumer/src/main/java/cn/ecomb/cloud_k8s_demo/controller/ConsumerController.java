package cn.ecomb.cloud_k8s_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/consumer")
public class ConsumerController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String getConsumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client-provide");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/provide";
        System.out.println("url---->" + url);
        return restTemplate.getForObject(url, String.class);
    }
}
