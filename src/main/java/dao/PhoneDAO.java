package dao;

import model.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDAO {

    private static final Map<Integer, Phone> phoneMap = new HashMap<>();

    static {
        initPhones();
    }

    private static void initPhones() {
        Phone phone1 = new Phone(1, "+44252856987", false);
        Phone phone2 = new Phone(2, "+44252435455", true);
        Phone phone3 = new Phone(3, "+44132345435", false);

        phoneMap.put(1, phone1);
        phoneMap.put(2, phone2);
        phoneMap.put(3, phone3);
    }

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
