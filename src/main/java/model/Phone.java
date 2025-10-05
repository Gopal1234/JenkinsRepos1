package model;
import jakarta.persistence.*;
import java.util.Set;

//@Entity
public class Phone {

   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phoneId;

    private String phoneNumber;

    private String phoneType;

   // @ManyToMany(mappedBy = "phones")
    private Set<Customer> customers;

    // Getters and Setters
    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
