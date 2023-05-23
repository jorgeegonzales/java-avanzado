package patterns.design.patterns.creational.factory;

import java.util.Objects;

public class PlanLogistics {
    public Vehiculo planLogistics (String logistics){
        if(Objects.equals(logistics, "Road")){
            Road road = new Road();
            road.planDelivery();
            RoadLogistics roadLogistics = new RoadLogistics();
           return roadLogistics.createTransport();
        }else if (Objects.equals(logistics,"Sea")){
            Sea sea = new Sea();
            sea.planDelivery();
            SeaLogistics seaLogistics = new SeaLogistics();
           return seaLogistics.createTransport();
        } else{
            System.out.println("No existe logistica");
            return null ;
        }
    }
}
