public class Skus {

    private Integer sid;
    private String size;
    private double price;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {

        double rate = 100.0;
        if(size.equals("small"))
            price = rate;
        else if(size.equals("medium"))
            price = rate*2;
        else if(size.equals("large"))
            price=rate*3;

        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }
}
