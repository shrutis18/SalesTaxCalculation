import org.junit.Assert;
import org.junit.Test;

public class ProductWithNoTaxTest {

    @Test

    public void itShouldHaveAPrice() {
        String name = "Book";
        ProductWithNoTax productWithNoTax = new ProductWithNoTax(name,200,new Exempted());
        Assert.assertEquals(200,productWithNoTax.getPrice());

    }

    @Test
    public void itShouldReturnFinalPriceWithTax() {
        String name = "Book";
        ProductWithNoTax productWithNoTax = new ProductWithNoTax(name,100,new Exempted());
        double expectedPrice = 100.0;
        Assert.assertEquals(expectedPrice,productWithNoTax.finalPrice(),0);

    }

}
