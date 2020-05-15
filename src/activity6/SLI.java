package activity6;

public class SLI {

    private ProductDescription desc;
    private int quantity;

    public SLI(ProductDescription desc, int quantity) {
        this.desc = desc;
        this.quantity = quantity;
    }

    public int subTotal() {
        return this.desc.getPrice() * this. quantity;
    }

    public ProductDescription getDesc() {
        return desc;
    }

    public int getQuantity() {
        return quantity;
    }
}
