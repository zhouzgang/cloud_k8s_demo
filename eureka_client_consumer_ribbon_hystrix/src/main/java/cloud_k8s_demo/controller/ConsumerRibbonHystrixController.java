package cloud_k8s_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouzhigang
 * @date 2018/3/8.
 */
@RestController("/ribbon")
public class ConsumerRibbonHystrixController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String getConsumer() {
        return restTemplate.getForObject("http://eureka-client-provide/provide", String.class);
    }
}
