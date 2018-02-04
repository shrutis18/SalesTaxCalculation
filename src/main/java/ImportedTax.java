public class ImportedTax implements  Taxable {
    @Override
    public double applyTax() {
       return 10 + 5;
    }
}
