public class Exempted implements Taxable {
    @Override
    public double applyTax() {
        return 0;
    }
}
