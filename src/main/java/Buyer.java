public class Buyer {
    ShoppingBasket shoppingBasket;

    public Buyer(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public ShoppingBasket getShoppingBasket() {
        return shoppingBasket;
    }

    public void addGoodsToBasket(Good good) {
        shoppingBasket.addGoods(good);
    }
}
