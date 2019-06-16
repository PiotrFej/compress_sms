import java.math.BigDecimal;

public class Calculator {

    BigDecimal totalPrice = BigDecimal.ZERO;
    //BigDecimal price = BigDecimal.valueOf(0.5);
    //double price = 0.5;

    BigDecimal calculate (int smsSize, double price){
        totalPrice = BigDecimal.valueOf(price * smsSize);

        return totalPrice;

    }
}
