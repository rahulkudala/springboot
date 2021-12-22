import java.util.List;
public class Product {

    private String name;
    private Integer pid;
    private List<Skus> sku;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<Skus> getSku() {
        return sku;
    }

    public void setSku(List<Skus> sku) {
        this.sku = sku;
    }
}
