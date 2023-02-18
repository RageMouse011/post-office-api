package kz.dar.tech.postofficeapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private Long postId;
    private String clientEmail;
    private String postRecipientId;
    private String postItem;
    private String status;
}
