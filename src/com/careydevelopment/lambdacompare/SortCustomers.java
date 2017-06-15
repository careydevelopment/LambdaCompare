package com.careydevelopment.lambdacompare;

import java.util.ArrayList;
import java.util.List;

import com.careydevelopment.tacklestore.entity.Customer;

public class SortCustomers {

    public static void main(String[] args) {
        //instantiate the sorter object
        Sorter sorter = new Sorter();
        
        //get our out-of-order customers
        List<Customer> customers = getCustomers();
        
        System.out.println("Order before sorting");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("\n");
        
        //use the sort method you want
        sorter.sortByAgeClassic(customers);
        //sorter.sortByAgeLambda(customers);
        //sorter.sortByLastNameClassic(customers);
        //sorter.sortByLastNameLambda(customers);
        
        System.out.println("Order after sorting");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("\n\n\n");
    }
    
    
    private static List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        
        customers.add(new Customer(1000l,"John","Smith",25));
        customers.add(new Customer(1001l,"Jane","Doe",36));
        customers.add(new Customer(1002l,"Jerry","Tyne",20));
        customers.add(new Customer(1003l,"Glenn","First",29));
        customers.add(new Customer(1004l,"Beth","Abbey",35));

        return customers;
    }
}
