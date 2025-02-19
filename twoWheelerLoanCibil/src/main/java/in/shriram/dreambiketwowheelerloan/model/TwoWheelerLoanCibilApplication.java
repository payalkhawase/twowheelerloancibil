package in.shriram.dreambiketwowheelerloan.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@EnableDiscoveryClient
@SpringBootApplication
public class TwoWheelerLoanCibilApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanCibilApplication.class, args);
	}

	
	
}
