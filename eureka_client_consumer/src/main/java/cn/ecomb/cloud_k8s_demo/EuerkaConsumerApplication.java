package cn.ecomb.cloud_k8s_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication
public class EuerkaConsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(EuerkaConsumerApplication.class, args);
		System.out.printf("----> start consumer");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


}
