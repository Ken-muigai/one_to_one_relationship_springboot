package com.kenjoel.want.to.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Credentials {
    @Id
    private String username;
    private String password;
}
