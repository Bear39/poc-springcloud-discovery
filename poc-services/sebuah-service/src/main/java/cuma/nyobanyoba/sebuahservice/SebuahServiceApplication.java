package cuma.nyobanyoba.sebuahservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class SebuahServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SebuahServiceApplication.class, args);
	}

}
