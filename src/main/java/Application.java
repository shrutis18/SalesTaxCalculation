public class Application {
    private final Buyer buyer;

    public Application(Buyer buyer) {
        this.buyer = buyer;
    }

    public void printReceipt() {
        buyer.getShoppingBasket().getGoods().forEach(good -> {
            System.out.print("Name: "+ good.getName());
            System.out.print("   Price: " + good.getPrice());
            System.out.print("   Final Price with Tax: "+ good.finalPrice());
            System.out.println();
            });
        System.out.println("Total Cost " + buyer.getShoppingBasket().getGoods().stream().mapToDouble(good -> good.finalPrice()).sum());
        System.out.println("Total Tax Paid " + buyer.getShoppingBasket().getGoods().stream().mapToDouble(good -> good.finalPrice()-good.getPrice()).sum());
    }
}
