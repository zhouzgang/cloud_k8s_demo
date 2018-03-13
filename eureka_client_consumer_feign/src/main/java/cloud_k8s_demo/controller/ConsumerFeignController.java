package cloud_k8s_demo.controller;

import cloud_k8s_demo.provide.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
