package com.eCommerceWeb.ecommerce.services.auth;

import com.eCommerceWeb.ecommerce.dto.SignupRequest;
import com.eCommerceWeb.ecommerce.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest);
    Boolean hasUserWithEmail(String email);
}
