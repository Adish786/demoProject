package com.example.behavioralPattern.chainResponsibility;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class PhoneCall {
    private int callId;
    private String callerNumber;
    private PhoneCallResponse call;


}
