package com.ms.brand_influencer.model.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NonNull
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetails {

    public Integer id;
    public String firstName;
    public String lastName;
    public String username;
    public Role role;
    public String gender;
    public String email;
    public String mobile;

}
