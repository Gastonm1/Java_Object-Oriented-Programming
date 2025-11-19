// EXAMPLE OF TIGHTLY COUPLED CODE.

public class TaxCalculator {
    private double taxableIncome;

    // if a parameter changes on taxCalculator, then TaxReport will break.
    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        // If we update the taxabaleIncome to be * 0.4 or something,
        // then we will need to recompile the code because TaxReport is dependent on this variable.
        // This is why interfaces are important so we can decouple these components.
        return taxableIncome * 0.3;
    }
}
