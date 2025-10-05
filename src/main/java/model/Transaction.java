package model;
import jakarta.persistence.*;
import java.time.LocalDate;

//@Entity
public class Transaction {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private Double amount;

    private LocalDate transactionDate;

    //@ManyToOne
    //@JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // Getters and Setters
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
