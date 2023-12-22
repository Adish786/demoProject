package com.example.behavioralPattern.chainResponsibility;

public abstract  class CallHandlerBase {
    protected CallHandlerBase redirectedTo;
    protected Status status = Status.ONDESK;

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status)
    {
        this.status=status;
    }
    public void setRedirectedTo(CallHandlerBase r)
    {
        redirectedTo=r;
    }
    public abstract PhoneCallResponse response(PhoneCall call );
}
