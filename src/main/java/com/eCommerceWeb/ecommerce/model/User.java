package com.eCommerceWeb.ecommerce.model;

import com.eCommerceWeb.ecommerce.enums.UserRole;
import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    private UserRole role;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;

}
