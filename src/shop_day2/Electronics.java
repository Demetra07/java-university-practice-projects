package shop_day2;

public class Electronics extends Product{

    private int warrantyMonths;

    public Electronics(String code, Double price, int quantity, int warrantyMonths) {
        super(code, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    @Override
    public Double calculateDiscountPrice(double percentage){
        double standardDiscountPrice = super.calculateDiscountPrice(percentage);
        return standardDiscountPrice- 5.0 ; // Επιπλέον προσφορά στα ηλεκτρονικά είδη κατά 5$
    }
}
