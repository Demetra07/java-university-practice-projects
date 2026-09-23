package shop_day2;

public class Clothing extends Product  {

    private String size;
    private String fabric;

    public Clothing(String code, Double price, int quantity,String size, String fabric) {
        super(code, price, quantity);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public Double calculateDiscountPrice(double percentage){
        double standardDiscountPrice = super.calculateDiscountPrice(percentage);
        return standardDiscountPrice - (0.10 * standardDiscountPrice); // Επιπλέον έκπτωση στον ρουχισμό κατα 10% στην αρχική έκπτωση.
    }
}
