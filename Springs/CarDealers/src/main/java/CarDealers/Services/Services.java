package CarDealers.Services;


import CarDealers.Cars;
import CarDealers.Dealers;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class Services {

    private Map<String,Cars> cars = new HashMap<>();

    Dealers d = new Dealers();
    Cars c1 = new Cars();
    private List<Dealers> dl= new ArrayList<Dealers>();
    private List<Cars> cl = new ArrayList<Cars>();

    public void addDealer(Dealers deal){
        dl.add(deal);
        cars.put(deal.getName(),c1);

    }

    public List<Dealers> getAll(){
        return dl;
    }

 /*   public List<Dealers> getDealer(String name){

         return cl;
    }*/

}
