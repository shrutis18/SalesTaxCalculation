import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    public List<Good> goods;

    public ShoppingBasket() {
       goods = new ArrayList<>(0);
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void addGoods(Good aGood) {
        goods.add(aGood);
    }
}
