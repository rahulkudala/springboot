import java.util.*;
public class Test2 {
       public static void main(String[] args){

           Skus s1 = new Skus();
           s1.setSid(100);
           s1.setSize("small");
           //s1.setPrice(1);

           Skus s2 = new Skus();
           s2.setSid(101);
           s2.setSize("medium");
      //     s2.setPrice(1);

           Skus s3 = new Skus();
           s3.setSid(102);
           s3.setSize("large");
     //      s3.setPrice(1);

           Skus s4 = new Skus();
           s4.setSid(105);
           s4.setSize("medium");
     //      s4.setPrice(1);

           Product p1 = new Product();
           p1.setName("Jack");
           p1.setPid(999);

           Product p2 = new Product();
           p2.setName("Xyz");
           p2.setPid(888);

           Product p3 = new Product();
           p3.setName("Mirna");
           p3.setPid(345);

           p1.setSku(Arrays.asList(s1, s2));
           p2.setSku(Arrays.asList(s3, s4));
           p3.setSku(Arrays.asList(s1, s4, s3));

           List<Product> pr = new ArrayList<>();
           pr.add(p1);
           pr.add(p2);
           pr.add(p3);

           for (Product pro : pr) {
               System.out.println("Product Name : " + pro.getName() + "\t Product ID : " + pro.getPid());
               for (Skus s : pro.getSku()) {
                   System.out.println("Sku ID : " + s.getSid() + "\t Sku Size : " + s.getSize() + "\t Sku Price : " + s.getPrice());
               }
               System.out.println();
           }
    }
}

