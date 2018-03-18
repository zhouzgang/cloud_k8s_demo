package cn.ecomb.cloud_k8s_demo.provide;

import org.springframework.stereotype.Component;

/**
 * @author zhouzhigang
 * @date 2018/3/16.
 */
@Component
public class ProviderHystrix implements Provider {
    @Override
    public String provide() {
        return "熔断";
    }
}
