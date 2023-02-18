package kz.dar.tech.postofficeapi.controller;

import jakarta.ws.rs.Path;
import kz.dar.tech.postofficeapi.dto.ClientResponse;
import kz.dar.tech.postofficeapi.dto.PostResponse;
import kz.dar.tech.postofficeapi.feign.ClientClient;
import kz.dar.tech.postofficeapi.feign.PostClient;
import kz.dar.tech.postofficeapi.service.OfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;


@RestController
@RequiredArgsConstructor
@RequestMapping("/office")
public class OfficeController {

    private final OfficeService officeService;

    @GetMapping("/post/all")
    public List<PostResponse> getAllPost() {
        return officeService.getAllPost();
    }

    @GetMapping("/post/{postId}")
    public PostResponse getPostById(
            @PathVariable(name = "postId") Long postId
    ) {
        return officeService.getPostById(postId);
    }

    @GetMapping("/clients/all")
    public List<ClientResponse> getAllClients() {
        return officeService.getAllClients();
    }

    @GetMapping("/clients/{clientEmail}")
    public ClientResponse getClientByEmail(
            @PathVariable(name = "clientEmail") String email
    ) {
        return officeService.getClientByEmail(email);
    }

    @GetMapping("/post/details/{postId}")
    public PostResponse getPostDetails(
            @PathVariable(name = "postId") Long postId
    ) {
        return officeService.getPostDetails(postId);
    }

}
