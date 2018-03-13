package cn.ecomb.cloud_k8s_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EuerkaProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuerkaProvideApplication.class, args);
		System.out.printf("start provider user");
	}
}
