public class HourlyCommission extends HourlyEmployee {

    private double commission;

    public HourlyCommission(String name, double wage, double hours, double commission) {
        super(name, wage, hours);
        this.commission = commission;
        
    }

    //Overriding the calculatePay method from the superclass
    @Override
    public double calculatePay(double wage, double hours){

        //Adding commision to the overall pay
        return (wage * hours) + commission;

    }


    public double getCommission() {
        return this.commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }


    @Override
    public String toString() {
        return super.toString() + "{" +
            " commission='" + getCommission() + "'" +
            "}";
    }

    
}
