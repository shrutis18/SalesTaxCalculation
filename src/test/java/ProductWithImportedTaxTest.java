import org.junit.Assert;
import org.junit.Test;

public class ProductWithImportedTaxTest {
    @Test

    public void itShouldHaveAPrice() {
        String name = "Mansion House";
        ProductWithImportedTax productWithImportedTax = new ProductWithImportedTax(name,200,new ImportedTax());
        Assert.assertEquals(200,productWithImportedTax.getPrice());

    }

    @Test
    public void itShouldReturnFinalPriceWithTax() {
        String name = "Mansion House";
        ProductWithImportedTax productWithImportedTax = new ProductWithImportedTax(name,100,new ImportedTax());
        double expectedPrice = 115.0;
        Assert.assertEquals(expectedPrice,productWithImportedTax.finalPrice(),0);

    }

}