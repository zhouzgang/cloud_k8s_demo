package cn.ecomb.cloud_k8s_demo.provide;

import org.springframework.stereotype.Component;

/**
 * @author zhouzg
 * @date 2019/2/15
 */
@Component
public class RecommendProviderHystrix implements RecommendProvider {
    @Override
    public String recommend() {
        return "服务推荐熔断";
    }
}
