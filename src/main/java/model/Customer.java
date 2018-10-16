package model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customer")
public class Customer {
    private Integer id;
    private String name;
    private String lastName;
    private List<Phone> phoneList;

    public Customer(Integer id, String name, String lastName, List<Phone> phoneList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneList = phoneList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
}
