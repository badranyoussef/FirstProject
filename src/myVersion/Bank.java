package myVersion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bank {
    public int customerLimit = 3;
    private ArrayList<Customer> customers = new ArrayList<>();

    //Constructor
    public Bank(int customerLimit) {
        this.customerLimit = customerLimit;
    }

    public Customer registerCustomer(String name) {
        Customer c = new Customer(name);
        customers.add(c);
        return c;
    }

    public static int getTotalBanks() {
        return 1;
    }

    public void printCustomers() {
        System.out.println("Names of customers:");
        for (Customer c : customers) {
            System.out.println(c);
        }

    }

    public void saveCustomers() {
        File file = new File("costumers.txt");
        try {
            FileWriter writer = new FileWriter(file);
            for (Customer a : customers) {
                writer.write("Name: " + a.getName() + " - ID: " + a.getId() + " - Balance: " + a.getAccount().getBalance() + "\n");
            }
            writer.close();
        } catch (IOException e) {

        }
    }
}

