package cuma.nyobanyoba.sebuahservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// import com.netflix.appinfo.InstanceInfo;
// import com.netflix.discovery.EurekaClient;
// import com.netflix.discovery.shared.Application;

import cuma.nyobanyoba.sebuahservice.client.SeketikaClient;

@RestController
public class SebuahController {

    @Autowired
    SeketikaClient seketikaClient;
    
    @Autowired
    private DiscoveryClient discoveryClient;

    // @Autowired
    // private EurekaClient eurekaClient;

    @GetMapping("/")
    public String test(){
        return "hehe";
    }

    @GetMapping("/version")
    public String getVersion(){
        return "kube-all 0.0.15";
    }

    @GetMapping("/ambil/{nama}")
    public String ambilBarang(@PathVariable("nama") String nama) {
        return seketikaClient.comotBarang(nama);
    }

    @GetMapping("/testDiscovery")
    public String testDiscovery(){
        List<ServiceInstance> listInstInfo = discoveryClient.getInstances("seketika");
        for (ServiceInstance instInfo : listInstInfo){
            System.out.println("IP:PORT: " + instInfo.getHost()+":"+instInfo.getPort());
            System.out.println("URI: " + instInfo.getUri());
            System.out.println("Service ID: " + instInfo.getServiceId());
        }
        return "Berhasil! Berhasil!? HOREEE!!";     
    }
    
    // @GetMapping("/testEureka")
    // public String testEureka(){
    //     Application app = eurekaClient.getApplication("seketika");
    //     List<InstanceInfo> listInstInfo = app.getInstances();
    //     for (InstanceInfo instInfo : listInstInfo){
    //         System.out.println("IP:PORT: " + instInfo.getIPAddr()+":"+instInfo.getPort());
    //         System.out.println("Hostname: " + instInfo.getHostName());
    //         System.out.println("Homepage: " + instInfo.getHomePageUrl());
    //         System.out.println("Instance ID: " + instInfo.getInstanceId());
    //     }
    //     return "berhasil juga eureka";
    // }


}
