package com.kenjoel.want.to.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
//Not sure, but if you remove the line above, you should be able to see all the extra data
public class Payload {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne(targetEntity = Credentials.class, cascade = CascadeType.ALL)
    private Credentials credentials;

    @OneToOne(targetEntity = Packet.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "annihilate", referencedColumnName = "id")
    private Packet packet;

}
