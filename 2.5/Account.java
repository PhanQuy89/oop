public class Account {
    private int id;
    private Customer Customer;
    private double balance;
    public Account(int id, Customer Customer, double balance) {
        this.id = id;
        this.Customer = Customer;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return Customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return "ID: " + id + "\nCustomer: " + Customer.toString() + "\nBalance: " + balance;
    }
    public String getCustomerName(){
        return Customer.getName();
    }
    public Account depoisit(double amount){
        amount = amount + balance;
        return null;
    }
    public Account withdraw(double amount){
        amount = amount - balance;
        return null;
    }

}
