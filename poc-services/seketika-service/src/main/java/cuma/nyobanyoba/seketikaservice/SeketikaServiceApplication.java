package cuma.nyobanyoba.seketikaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SeketikaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeketikaServiceApplication.class, args);
	}

}
