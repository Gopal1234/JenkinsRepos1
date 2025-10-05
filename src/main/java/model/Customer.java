package model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

//@Entity
public class Customer {
//
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String custId;

    private String custName;

    private LocalDate dob;

    //@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions;

    //@ManyToMany(cascade = CascadeType.ALL)
    /*@JoinTable(
        name = "customer_phone",
        joinColumns = @JoinColumn(name = "customer_id"),
        inverseJoinColumns = @JoinColumn(name = "phone_id")
    )*/
    private Set<Phone> phones;

   // @OneToMany(cascade = CascadeType.ALL)
   // @MapKey(name = "id")
    private Map<Long, Account> account;

    // Getters and Setters
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Map<Long, Account> getAccount() {
        return account;
    }

    public void setAccount(Map<Long, Account> account) {
        this.account = account;
    }
}
