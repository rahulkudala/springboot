package CarDealers;

import java.util.List;

public class Dealers {

    private String name;
    private String location;
    private int number;
    private List<Cars> car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Cars> getCar() {
        return car;
    }

    public void setCar(List<Cars> car) {
        this.car = car;
    }
}
