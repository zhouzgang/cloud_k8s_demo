package cn.ecomb.cloud_k8s_demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/hystrix")
public class ConsumerRibbonHystrixController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping
    public String getConsumer() {
        return consumerService.consumer();
    }

    @Service
    class ConsumerService {

        @Autowired
        RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer() {
            return restTemplate.getForObject("http://eureka-client-provide/provide", String.class);
        }

        public String fallback() {
            return "请求超时，熔断处理";
        }

    }
}
