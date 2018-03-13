package cloud_k8s_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EuerkaConsumerFeignApplication {


	public static void main(String[] args) {
		SpringApplication.run(EuerkaConsumerFeignApplication.class, args);
		System.out.printf("----> start consumer");
	}

}
