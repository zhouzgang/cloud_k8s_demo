package cn.ecomb.cloud_k8s_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzhigang
 * @date 2018/3/11.
 */
@RestController
public class ConfigClientController {

    // git配置文件里的key
    @Value("${test}")
    String test;

    @GetMapping(value = "/test")
    public String hi(){
        return test;
    }
}
