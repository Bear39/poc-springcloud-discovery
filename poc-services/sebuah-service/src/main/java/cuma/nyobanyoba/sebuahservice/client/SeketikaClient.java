package cuma.nyobanyoba.sebuahservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "seketika")
public interface SeketikaClient {
    
    @GetMapping("/comot/{nama}")
    public String comotBarang(@PathVariable("nama") String nama);

}
