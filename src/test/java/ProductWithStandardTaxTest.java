import org.junit.Assert;
import org.junit.Test;


public class ProductWithStandardTaxTest {
    @Test
    public void itShouldHaveAPrice() {
        String name = "Music CD";
        ProductWithStandardTax productWithStandardTax = new ProductWithStandardTax(name,100, new StandardTax());
        Assert.assertEquals(100, productWithStandardTax.getPrice());

    }

    @Test

    public void itShouldReturnFinalPrice() {
        String name = "Music CD";
        ProductWithStandardTax productWithStandardTax = new ProductWithStandardTax(name,100, new StandardTax());
        Assert.assertEquals(110, productWithStandardTax.finalPrice(),0);
    }
 }