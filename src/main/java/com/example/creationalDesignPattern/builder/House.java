package com.example.creationalDesignPattern.builder;

public class House {

    //mandatory fields
    private String walls;
    private  String rooms;
    private  String kitechn;
    //optional fields
    private String swammingPool;
    private String parking;
    private House (HouseBuilder houseBuilder){
        this.walls=houseBuilder.walls;
        this.kitechn=houseBuilder.kitechn;
        this.rooms=houseBuilder.rooms;
        this.swammingPool=houseBuilder.swammingPool;
        this.parking=houseBuilder.parking;

    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", rooms='" + rooms + '\'' +
                ", kitechn='" + kitechn + '\'' +
                ", swammingPool='" + swammingPool + '\'' +
                ", parking='" + parking + '\'' +
                '}';
    }

    public String getWalls() {
        return walls;
    }

    public String getRooms() {
        return rooms;
    }

    public String getKitechn() {
        return kitechn;
    }

    public String getSwammingPool() {
        return swammingPool;
    }

    public String getParking() {
        return parking;
    }

    public static class HouseBuilder{
        //mandatory fields
        private String walls;
        private  String rooms;
        private  String kitechn;
        //optional fields
        private String swammingPool;
        private String parking;

        public HouseBuilder(String walls, String rooms, String kitechn) {
            this.walls = walls;
            this.rooms = rooms;
            this.kitechn = kitechn;
        }

        public HouseBuilder setSwammingPool(String swammingPool) {
            this.swammingPool = swammingPool;
            return this;
        }

        public HouseBuilder setParking(String parking) {
            this.parking = parking;
            return this;
        }
        //build method that  return object
        public House build(){
            return new House(this);
        }
    }
}
