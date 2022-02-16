import java.math.BigDecimal;

public class Order {
    
    private final String code;
    private final int totalvalue;

    public Order (String code, int totalvalue) {
        this.code = code;
        this.totalvalue = totalvalue;
    
    }

    public double calculateFee() {
        switch(totalvalue) {
            case 100;
                return totalvalue * 0.99;
            case 200;
                return totalvalue * 1.99
            default:
            return totalvalue;
        }
    }
}
// teste