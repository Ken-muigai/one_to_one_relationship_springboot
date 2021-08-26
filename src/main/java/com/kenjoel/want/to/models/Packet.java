package com.kenjoel.want.to.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Packet {

    @Id
    public String beepTransactionID;
    public String statusCode;
    public String statusDescription;
    public String payerTransactionID;
    public String receiptNumber;
    public String receiverNarration;
    public String function;
    public String msisdn;
    public String serviceCode;
    public String paymentDate;
    public String clientCode;
    public String extraData;
}
