package com.ms.brand_influencer.model.bean;

import lombok.*;

@With
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
    private String message;

}
