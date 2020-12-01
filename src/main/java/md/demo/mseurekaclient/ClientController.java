package md.demo.mseurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ClientController {

    private final DiscoveryClient discoveryClient;

    public ClientController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/ping")
    public List<ServiceInstance> ping(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLIENT-SERVICE");

        log.info("INSTANCES : count={}", instances.size());
        instances.stream().forEach(it -> log.info("INSTANCES id={}, port={}", it.getServiceId(), it.getPort()));

        return instances;
    }
}
