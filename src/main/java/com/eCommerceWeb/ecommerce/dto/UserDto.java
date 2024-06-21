package com.eCommerceWeb.ecommerce.dto;

import com.eCommerceWeb.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;

}
