package toyBank;

import java.util.ArrayList;

public class Bank {
    public int customerLimit ;
    private ArrayList<Customer> customers = new ArrayList<>();
    public Bank(int customerLimit){
        this.customerLimit = customerLimit;
    }

    public static int getTotalBanks(){
        return 1;
    }
    public Customer registerCustomer(String name){
        Customer c = new Customer(name);
        customers.add(c);
            return c;
    }

    public void displayCustomers(){
        for (Customer c:customers  ) {
            System.out.println(c);
        }
    }

    public Customer getCustomer(int i) {
        return customers.get(i);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
