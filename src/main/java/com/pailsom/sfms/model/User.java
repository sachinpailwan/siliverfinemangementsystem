package com.pailsom.sfms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "T_SFMS_USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String userId;

    private String username;

    private String password;

    private String email;

    private LocalDateTime createdOn;

    private LocalDateTime lastLogin;

    private int outLetId;
}
