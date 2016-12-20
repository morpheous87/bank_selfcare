package yourbank.entity;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mario on 15.12.2016 г..
 */

@Entity
@Table(name = "user")
public class User {

    private Integer id;
    private  String fullName;
    private String email;
    private String userName;
    private String password;
    private Integer role_id;
    private Boolean disabled;
    private String address;
    private Double balance;
    private Double salary;

    public User() {
    System.out.println(" KOOOOOOOORRRRR");
    }

    public User(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.roles = new HashSet<>();
     //   this.transactions = new HashSet<>();
    }

    public User(String address, String fullName, String email, String userName, String password, Double balance, Double salary, Boolean disabled) {
        this.fullName = fullName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.disabled = disabled;
        this.address = address;
        this.balance = balance;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "full_name", nullable = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "user_name", unique = true, nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password", length = 50, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Not sure with full annotation
    @Column(name = "role_id", nullable = false)
    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    // Not sure with full annotation
    @Column(name = "disabled", nullable = false)
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    // Not sure with full annotation
    @Column(name = "address",nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Not sure with full annotation
    @Column(name = "balance",length = 50, precision = 2, nullable = false)
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Not sure with full annotation
    @Column(name = "salary", length = 50, precision = 2, nullable = false)
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private Set<Role> roles;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles") // not sure if "users_roles" is the property name for the connection
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role){
        this.roles.add(role);
    }
    ///////////////////////
/*
    private Set<Transaction> transactions;

    @OneToMany(mappedBy = "user_id") //Really not sure what i doing :D
    public Set<Transaction> getTransactions() {return transactions;}

    public void setTransactions(Set<Transaction> transactions) {this.transactions = transactions;}  */
}
