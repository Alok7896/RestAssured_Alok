package Rest_Assured.Serialization;

import java.util.List;

public class CompanyDetails {

    private String CompanyName;
    private String Street;
    private String City;
    private String State;
    private int Pin;

    private List<EmloyeeDetails> emp;

    public List<EmloyeeDetails> getEmp() {
        return emp;
    }

    public void setEmp(List<EmloyeeDetails> emp) {
        this.emp = emp;
    }



    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }



}
