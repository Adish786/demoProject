package com.example.SOLID.LiskovSubstitution.Solution;

import com.example.SOLID.LiskovSubstitution.problem.Bycle;
import com.example.SOLID.LiskovSubstitution.problem.Car;
import com.example.SOLID.LiskovSubstitution.problem.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleMonitor {
    public void startVehicles(){
        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle car = new Car();
        Vehicle cycle = new Bycle();
        vehicleList.add(car);
        vehicleList.add(cycle);
        vehicleList.forEach(vehicle->vehicle.startEngine());
    }
}
