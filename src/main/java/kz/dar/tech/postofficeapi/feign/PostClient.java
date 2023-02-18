package kz.dar.tech.postofficeapi.feign;

import kz.dar.tech.postofficeapi.dto.PostResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("post-core-api")
public interface PostClient {

    @GetMapping("/post/check")
    String check();

    @GetMapping("/post/all")
    List<PostResponse> getAllPost();

    @GetMapping("/post/{postId}")
    PostResponse getPostById(
            @PathVariable(name = "postId") Long postId
    );

}
