package com.example.behavioralPattern.commandHandler;

public class ShootCommand extends CommandBase{

    public ShootCommand(Soldier soldier) {
        super(soldier);
    }

    @Override
    public void action() {
        soldier.shoot();

    }
}
