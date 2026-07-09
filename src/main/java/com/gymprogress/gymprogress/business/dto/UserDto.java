package com.gymprogress.gymprogress.business.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.gymprogress.gymprogress.persistance.entity.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int userId;
    private String userEmail;
    private String userPassword;
    private String resetToken;
    private LocalDateTime resetTokenExpiry;
    private Gender userGender;
    private int userAge;
    private BigDecimal userWeight;
    private int userHeight;
    private String userName;
    private String userFirstname;
    private String userPseudo;
    private String userImage;
    
}
