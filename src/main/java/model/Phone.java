package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "phone")
public class Phone {
    private Integer id;
    private String number;
    private Boolean activated;

    public Phone(Integer id, String number, Boolean activated) {
        this.id = id;
        this.number = number;
        this.activated = activated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }
}
