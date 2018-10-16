package dao;

import model.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDAO {

    private static final Map<Integer, Phone> phoneMap = new HashMap<>();

    public static Phone getPhone(Integer id){
        return phoneMap.get(id);
    }

    public static Phone addPhone(Phone phone){
        phoneMap.put(phone.getId(), phone);
        return phone;
    }

    public static Phone updatePhone(Phone phone){
        phoneMap.put(phone.getId(), phone);
        return phone;
    }

    public static Phone activatePhone(Integer id){
        Phone phone = phoneMap.get(id);
        phone.setActivated(true);
        phoneMap.put(id,phone);
        return phone;
    }

    public static List<Phone> getAllPhones(){
        return new ArrayList<Phone>(phoneMap.values());
    }
}
