import java.util.*;
public class Test {
    public  static  void main(String args[]){

        Cars car1 = new Cars();
        car1.setName("V1");
        car1.setQuantity(20);
        car1.setPrice(150000);

        Cars car2 = new Cars();
        car2.setName("City");
        car2.setQuantity(10);
        car2.setPrice(120000);

        Cars car3 = new Cars();
        car3.setName("Civic");
        car3.setQuantity(30);
        car3.setPrice(151000);

        DealerDetails dealerDetails1 = new DealerDetails();
        dealerDetails1.setName("Honda Gachibowli");
        dealerDetails1.setAddress("Gachibowli");
        dealerDetails1.setPhoneNo(9121341);
        dealerDetails1.setCars(Arrays.asList(car1, car2));

        DealerDetails dealerDetails2 = new DealerDetails();
        dealerDetails2.setName("Sundaram Honda");
        dealerDetails2.setAddress("Vijayawada");
        dealerDetails2.setPhoneNo(88888);
        dealerDetails2.setCars(Arrays.asList(car3));

        List<DealerDetails> dealers = new ArrayList<>();
        dealers.add(dealerDetails1);
        dealers.add(dealerDetails2);

        for (DealerDetails dealer: dealers) {
            System.out.println("Dealer name: " + dealer.getName() +
                    " address: " + dealer.getAddress() +
                    " phoneNo:" + dealer.getPhoneNo());
            for (Cars car: dealer.getCars()) {
                System.out.println("Car name: " + car.getName() +
                        " quantity:" + car.getQuantity() +
                        " price:" + car.getPrice());
            }
            System.out.println();
        }
    }
}
