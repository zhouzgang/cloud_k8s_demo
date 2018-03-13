package cloud_k8s_demo.provide;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhouzhigang
 * @date 2018/3/11.
 */
@FeignClient("eureka-client-provide")
public interface Provider {

    /**
     * 提供方接口
     * @return 接口返回
     */
    @GetMapping("/provide")
    String provide();
}
