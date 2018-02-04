import org.junit.Test;

public class ApplicationTest {
    @Test
    public void itShouldBeAbleToPrintReceipt() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        ProductWithNoTax productWithNoTax = new ProductWithNoTax("book",10,new Exempted());
        ProductWithImportedTax productWithImportedTax = new ProductWithImportedTax("Alcohol",100,new ImportedTax());
        ProductWithStandardTax productWithStandardTax = new ProductWithStandardTax("Cd",200,new StandardTax());
        Buyer buyer = new Buyer(shoppingBasket);
        buyer.addGoodsToBasket(productWithNoTax);
        buyer.addGoodsToBasket(productWithImportedTax);
        buyer.addGoodsToBasket(productWithStandardTax);
        Application application = new Application(buyer);
        //
        application.printReceipt();
    }
}
