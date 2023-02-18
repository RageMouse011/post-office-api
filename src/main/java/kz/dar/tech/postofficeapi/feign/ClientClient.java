package kz.dar.tech.postofficeapi.feign;

import kz.dar.tech.postofficeapi.dto.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("client-core-api")
public interface ClientClient {

    @GetMapping("/clients/all")
    List<ClientResponse> getAllClients();

    @GetMapping("/clients/{clientEmail}")
    ClientResponse getClient(
            @PathVariable(name = "clientEmail") String email
    );
}

