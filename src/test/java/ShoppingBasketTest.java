import org.junit.Assert;
import org.junit.Test;

public class ShoppingBasketTest {
    @Test
    public void itShouldHaveZeroGoodsInitially() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Assert.assertEquals(0,shoppingBasket.getGoods().size());
    }
}
