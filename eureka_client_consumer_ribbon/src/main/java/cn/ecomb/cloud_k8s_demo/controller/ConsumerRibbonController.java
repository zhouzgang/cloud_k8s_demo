package cn.ecomb.cloud_k8s_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/ribbon")
public class ConsumerRibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String getConsumer() {
//        因为Spring Cloud Ribbon有一个拦截器，它能够在这里进行实际调用的时候，
//        自动的去选取服务实例，并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用。

//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka_client_provide");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/provide";

        return restTemplate.getForObject("http://eureka-client-provide/provide", String.class);
    }
}
