package 명함전송서버1;

import java.io.Serializable;

public class NameCard1 implements Serializable {
    private String name;
    private  int number;
    private  String email;
    private String address;
    private String company;

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NameCard1(String name, int number, String email, String address, String Company) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
        this.company = Company;
    }
}
