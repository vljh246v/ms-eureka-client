package md.demo.mseurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEurekaClientApplication.class, args);
    }

}
