package com.example.behavioralPattern.chainResponsibility;

public class Manaerhandler extends CallHandlerBase{
    @Override
    public PhoneCallResponse response(PhoneCall call) {
        if(status==Status.ONDESK)
        {
            System.out.println("Call:"+call.toString()+"received by the office Manager");
            return PhoneCallResponse.ACCEPTED;
        }
        if(redirectedTo!=null)
        {
            return redirectedTo.response(call);
        }
        return PhoneCallResponse.REJECTED;
    }
}
