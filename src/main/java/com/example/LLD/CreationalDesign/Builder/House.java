package com.example.LLD.CreationalDesign.Builder;

public class House {
    //mandatory
    private String wall;
    private String kitchen;
    private String room;
    //optional
    private String parking;
    private String swammingpool;
private House(Housebuilder housebuilder){
    this.wall=housebuilder.wall;
    this.kitchen=housebuilder.kitchen;
    this.room=housebuilder.room;
    this.parking=housebuilder.parking;
    this.swammingpool=housebuilder.swammingpool;
}

    @Override
    public String toString() {
        return "House{" +
                "wall='" + wall + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", room='" + room + '\'' +
                ", parking='" + parking + '\'' +
                ", swammingpool='" + swammingpool + '\'' +
                '}';
    }

    public String getWall() {
        return wall;
    }

    public String getKitchen() {
        return kitchen;
    }

    public String getRoom() {
        return room;
    }

    public String getParking() {
        return parking;
    }

    public String getSwammingpool() {
        return swammingpool;
    }

    public static class  Housebuilder{
        //mandatory
        private String wall;
        private String kitchen;
        private String room;
        //optional
        private String parking;
        private String swammingpool;

        public Housebuilder(String wall,String kitchen,String room){
            this.wall=wall;
            this.kitchen=kitchen;
            this.room=room;
        }
        public Housebuilder setSwammingpool(String swammingpool){
            this.swammingpool=swammingpool;
            return this;
        }
        public Housebuilder setParking(String parking){
            this.parking=parking;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}
