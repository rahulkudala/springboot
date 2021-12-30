package CarDealers;


import java.util.List;

public class Cars {

    private String name;
   // private int quantity;
    //private double price;

    private List<CarModel> cm;

    public List<CarModel> getCm() {
        return cm;
    }

    public void setCm(List<CarModel> cm) {
        this.cm = cm;
    }

    /*public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }*/

}
