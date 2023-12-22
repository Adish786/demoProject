package com.example.behavioralPattern.chainResponsibility;

public class Test {
    public static void main(String[] args) {
        CallHandlerBase reception = new ReceptionHandler();
        CallHandlerBase admin = new AdministrativeOfficeHandler();
        CallHandlerBase manager = new Manaerhandler();
        CallHandlerBase auto= new AutomatedSpeakerHandler();

        reception.setRedirectedTo(admin);
        admin.setRedirectedTo(manager);
        manager.setRedirectedTo(auto);

        PhoneCall call1 = new PhoneCall(1,"9717438377",PhoneCallResponse.ACCEPTED);
        PhoneCall call2 = new PhoneCall(2,"9712232343",PhoneCallResponse.ACCEPTED);
      reception.setStatus(Status.ONDESK);
      reception.response(call1);
      reception.setStatus(Status.OFFDESK);
      admin.setStatus(Status.OFFDESK);
      manager.setStatus(Status.OFFDESK);
      reception.response(call2);
    }
}
