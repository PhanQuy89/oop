public class Invoice {
    private int id;
    private Customer customer;
    private double amout;
    public Invoice(int id, Customer customer, double amout) {
        this.id = id;
        this.customer = customer;
        this.amout = amout;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getAmout() {
        return amout;
    }
    public void setAmout(double amout) {
        this.amout = amout;
    }
    public int getCustomerId(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        return amout;
    }
    public String toString(){
        return id + " " + customer.getName() + " " + customer.getDiscount() + " " + amout;
    }
}
