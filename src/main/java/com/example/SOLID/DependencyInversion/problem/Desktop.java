package com.example.SOLID.DependencyInversion.problem;

public class Desktop {
    private Monitor monitor;
    private QwertyKeyBoard qwertyKeyBoard;
    //This is titelycuppeld with each other when insilized the object that create new oject
    public Desktop(){
        this.monitor=new Monitor();
        this.qwertyKeyBoard=new QwertyKeyBoard();
    }

    //Solution
    public Desktop(QwertyKeyBoard keyBoard , Monitor monitor){
        this.monitor=monitor;
        this.qwertyKeyBoard=keyBoard;
    }

}
