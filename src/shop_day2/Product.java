package shop_day2;

public class Product {
    private String code;
    private Double price;
    private int quantity;

    public Product(String code, Double price, int quantity) {
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public Double calculateDiscountPrice(double percentage) {
        return price - (price * percentage/100);
    }

    public String getCode() {
        return code;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
