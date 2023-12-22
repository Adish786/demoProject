package com.example.creationalDesignPattern.AbstractFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory){
        button=factory.createButton();
        checkBox=factory.createCheckBox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }

    public static void main(String[] args) {
        Application application = new Application(new WinUIFactory());
        application.paint();
    }

}
