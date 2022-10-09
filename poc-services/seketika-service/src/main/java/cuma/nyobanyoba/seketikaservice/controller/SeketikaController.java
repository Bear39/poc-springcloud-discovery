package cuma.nyobanyoba.seketikaservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeketikaController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String test(){
        return "hooh";
    }

    @GetMapping("/testEur")
    public String testEureka() {
        List<ServiceInstance> listInstInfo = discoveryClient.getInstances("seketika");
        for (ServiceInstance instInfo : listInstInfo){
            System.out.println("URI :" + instInfo.getUri());
            System.out.println("HOST : "+ instInfo.getHost());
            System.out.println("PORT : "+ instInfo.getPort());
            System.out.println("Service ID : "+ instInfo.getServiceId());
            System.out.println("String : "+ instInfo.toString());
        }
        return "berhasil wow!";
    }

    @GetMapping("/comot/{nama}")
    public String comotBarang(@PathVariable("nama") String nama) {
        return "kecolong deh barangnya " + nama;
    }
    
}
