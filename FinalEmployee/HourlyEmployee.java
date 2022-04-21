//Hourly Employee class
class HourlyEmployee{

    //defining the data fields
    private String name;
    private double wage;
    private double hours;


    public HourlyEmployee(String name, double wage, double hours) {
        this.name = name;
        this.wage = wage;
        this.hours = hours;
    }

    //Calculate pay method using wage and hours
    public double calculatePay(double wage, double hours){

        return wage * hours;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return this.hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", wage='" + getWage() + "'" +
            ", hours='" + getHours() + "'" +
            "}";
    }


}