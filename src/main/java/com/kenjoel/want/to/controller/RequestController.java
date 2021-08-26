package com.kenjoel.want.to.controller;

import com.kenjoel.want.to.dto.RequestReceiver;
import com.kenjoel.want.to.models.Credentials;
import com.kenjoel.want.to.models.Packet;
import com.kenjoel.want.to.models.Payload;
import com.kenjoel.want.to.repository.PacketRespo;
import com.kenjoel.want.to.repository.PayloadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RequestController {
    @Autowired
    private PayloadRepo mPayload;

    @Autowired
    private PayloadRepo credentials;


    @PostMapping("/add")
    public Payload create_payload_object(@RequestBody RequestReceiver receiver){
        return mPayload.save(receiver.getPayload());
    }

    @GetMapping("/get'em")
    public List<Payload> getPayload(){
        return mPayload.findAll();
    }



}
