package template.car;

/**
 * Created by kazim on 2016-10-11.
 */
public class CarRacinglineInstalments extends Car {
    private int basePrice;
    private int instalmentsTax = 10; // measured in %
    private int power = 199; // measured in kW
    private int torque = 330; // measured in Nm
    private int linePrice;

    public CarRacinglineInstalments(String model, int basePrice) {
        super(model, basePrice);
        this.basePrice = basePrice;
        this.linePrice = getBasePrice() / 2;
    }

    protected String getPowerBrochure() {
        return "Racingline is made by Peugeot Racing engineers. " +
                "These are the same people who made a car for Dakar 2015. ";
    }

    protected String getPriceBrochure() {
        return "You may pick the best instalments plan for you. Paying by instalments is just 10%.";
    }

    @Override
    protected String getPriceBreakdown() {
        return "Base price: " + this.basePrice + "; Line price: " + this.linePrice + "; Instalments tax: " + instalmentsTax + "%.";

    }

    @Override
    protected int getPower() {
        return this.power;
    }

    @Override
    protected int getTorque() {
        return this.torque;
    }

    @Override
    protected int getLinePrice() {
        return this.linePrice;
    }

    @Override
    protected int getTotalPrice() {
        return (int) ((this.basePrice + this.linePrice) * ((instalmentsTax/100.0) + 1));
    }
}