package dao;

import model.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDAO {
    private static final Map<Integer, Customer> customerMap = new HashMap<>();

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

    public static List<Customer> getAllCustomers(){
        return new ArrayList<Customer>(customerMap.values());
    }
}
