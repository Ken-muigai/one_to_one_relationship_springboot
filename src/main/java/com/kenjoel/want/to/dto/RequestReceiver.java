package com.kenjoel.want.to.dto;


import com.kenjoel.want.to.models.Payload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestReceiver {
    private Payload payload;
}
