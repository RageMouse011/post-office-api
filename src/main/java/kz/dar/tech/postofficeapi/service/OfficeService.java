package kz.dar.tech.postofficeapi.service;


import kz.dar.tech.postofficeapi.dto.ClientResponse;
import kz.dar.tech.postofficeapi.dto.PostResponse;
import kz.dar.tech.postofficeapi.feign.ClientClient;
import kz.dar.tech.postofficeapi.feign.PostClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OfficeService {

    private final ClientClient clientClient;
    private final PostClient postClient;
    public List<PostResponse> getAllPost() {
        return postClient.getAllPost();
    }

    public PostResponse getPostById(
            Long postId
    ) {
        return postClient.getPostById(postId);
    }

    public List<ClientResponse> getAllClients() {
        return clientClient.getAllClients();
    }

    public ClientResponse getClientByEmail(
            String email
    ) {
        return clientClient.getClient(email);
    }

    public PostResponse getPostDetails(
            Long postId
    ) {
        PostResponse postDTO = postClient.getPostById(postId);


        PostResponse postResponse = PostResponse.builder()
                .postId(postDTO.getPostId())
                .client(postDTO.getClient())
                .receiver(postDTO.getReceiver())
                .postItem(postDTO.getPostItem())
                .status(postDTO.getStatus())
                .build();

        return postResponse;
    }
}
