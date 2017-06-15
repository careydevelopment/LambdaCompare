package com.careydevelopment.lambdacompare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.careydevelopment.tacklestore.entity.Customer;

public class Sorter {

    //comparator for classic sorting by last name
    private class LastNameClassicComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer c1, Customer c2) {
            return c1.getLastName().compareTo(c2.getLastName());
        }        
    }

    //comparator for classic sorting by age
    private class AgeClassicComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer c1, Customer c2) {
            return c1.getAge().compareTo(c2.getAge());
        }        
    }
    
    //comparator for lambda sorting by last name
    private Comparator<Customer> lastNameLambdaComparator =
            (c1, c2)->c1.getLastName().compareTo(c2.getLastName());
            
    //comparator for lambda sorting by age
    private Comparator<Customer> ageLambdaComparator =
            (c1, c2)->c1.getAge().compareTo(c2.getAge());
            
            
    public void sortByLastNameClassic(List<Customer> customers) {
        Collections.sort(customers, new LastNameClassicComparator());
    }

    
    public void sortByLastNameLambda(List<Customer> customers) {
        customers.sort(lastNameLambdaComparator);
    }
    
    
    public void sortByAgeClassic(List<Customer> customers) {
        Collections.sort(customers, new AgeClassicComparator());
    }

    
    public void sortByAgeLambda(List<Customer> customers) {
        customers.sort(ageLambdaComparator);
    }

}
