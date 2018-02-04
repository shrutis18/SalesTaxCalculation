import org.junit.Assert;
import org.junit.Test;

public class BuyerTest {
    @Test
    public void itShouldHaveAnEmptyShoppingBasket () {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Buyer buyer = new Buyer(shoppingBasket);
        Assert.assertEquals(0, buyer.getShoppingBasket().getGoods().size());
    }

    @Test
    public void itShouldBeAbleToAddGoodsToHisShoppingBasket() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Buyer buyer = new Buyer(shoppingBasket);
        //when
        ProductWithStandardTax aProductWithStandardTax = new ProductWithStandardTax("Music CD",10,new StandardTax());
        buyer.addGoodsToBasket(aProductWithStandardTax);
        Assert.assertEquals(1,buyer.getShoppingBasket().getGoods().size());
    }
}
