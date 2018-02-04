public  class Good {
    private final int price;
    private final String name;
    Taxable taxable;

    public Good(String name,int price, Taxable taxable) {
        this.name = name;
        this.price = price;
        this.taxable = taxable;
    }

    public int getPrice() {
        return price;
    }

    public double finalPrice(){
        return (price + price*(taxable.applyTax()/100));
    }

    public String getName() {
        return name;
    }
}
