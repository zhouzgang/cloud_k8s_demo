package cn.ecomb.cloud_k8s_demo.provide;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhouzg
 * @date 2019/2/15
 */
@FeignClient(name = "eureka-client-recommend", fallback= RecommendProviderHystrix.class)
public interface RecommendProvider {

    /**
     * 提供方接口
     * @return 接口返回
     */
    @GetMapping("/recommend")
    String recommend();
}
