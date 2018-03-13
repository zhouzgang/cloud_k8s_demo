package cloud_k8s_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
public class EuerkaConsumerRibbonApplication {


	public static void main(String[] args) {
		SpringApplication.run(EuerkaConsumerRibbonApplication.class, args);
		System.out.printf("----> start consumer");
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


}
