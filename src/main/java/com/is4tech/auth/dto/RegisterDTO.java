package com.is4tech.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDTO {

    private String email;
    private String password;
    private String fullName;
}
