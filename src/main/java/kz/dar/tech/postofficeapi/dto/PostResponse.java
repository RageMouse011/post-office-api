package kz.dar.tech.postofficeapi.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostResponse {
    private Long postId;
    private ClientResponse client;
    private ClientResponse receiver;
    private String postItem;
    private String status;
}
