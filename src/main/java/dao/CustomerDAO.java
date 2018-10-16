package dao;

import model.Customer;
import model.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDAO {
    private static final Map<Integer, Customer> customerMap = new HashMap<>();

    static {
        initCustomers();
    }

    private static void initCustomers() {
        Phone phone1 = new Phone(1, "+44252856987", false);
        Phone phone2 = new Phone(2, "+44252435455", true);
        Phone phone3 = new Phone(3, "+44132345435", false);

        List<Phone> customerPhones = new ArrayList<>();

        customerPhones.add(phone1);
        customerPhones.add(phone2);
        customerPhones.add(phone3);

        Customer customer1 = new Customer(1, "Mike", "Novak", customerPhones);

        customerMap.put(1, customer1);
    }

    public static Customer getCustomer(Integer id){
        return customerMap.get(id);
    }

    public static Customer addCustomer(Customer phone){
        customerMap.put(phone.getId(), phone);
        return phone;
    }

    public static Customer updateCustomer(Customer phone){
        customerMap.put(phone.getId(), phone);
        return phone;
    }

    public static List<Phone> getCustomerPhones(Integer id){
        Customer customer = customerMap.get(id);
        return customer.getPhoneList();
    }

    public static List<Customer> getAllCustomers(){
        return new ArrayList<Customer>(customerMap.values());
    }
}
