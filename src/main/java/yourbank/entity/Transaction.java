package yourbank.entity;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by Mario on 19.12.2016 г..
 */

@Entity
@Table(name = "transaction")
public class Transaction {

    private Integer id;

//    private Integer user_id;

    private Date timestamp;

    private Integer type_id;

    private Double amount;

    private String receiver;

    private String sender;

    private Double tax;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}
/*
    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false) //Not sure in this annotation
    public Integer getUser_id() {return user_id;}

    public void setUser_id(Integer user_id) {this.user_id = user_id;}
*/
    @Column(nullable = false)  //Not sure in this annotation, may be need to be added property Date params in brackets
    public Date getTimestamp() {return timestamp;  }

    public void setTimestamp(Date timestamp) {this.timestamp = timestamp;  }

    @Column(name = "type_id" , nullable = false)    //Not sure in this annotation
    public Integer getType_id() {return type_id;}

    public void setType_id(Integer type_id) {this.type_id = type_id;}

    @Column(name = "amount", length = 50, precision = 2, nullable = false)  // Not sure with full annotation
    public Double getAmount() {return amount;}

    public void setAmount(Double amount) {this.amount = amount;}

    @Column(name = "receiver", nullable = false)    // Not sure with full annotation
    public String getReceiver() {return receiver;}

    public void setReceiver(String receiver) {this.receiver = receiver;}

    @Column(name = "sender", nullable = false)   // Not sure with full annotation
    public String getSender() {return sender;}

    public void setSender(String sender) {this.sender = sender;}

    @Column(name = "tax", length = 50, precision = 2, nullable = false) // Not sure with full annotation
    public Double getTax() {return tax;}

    public void setTax(Double tax) {this.tax = tax;}

    public Transaction(Integer id, Date timestamp, Integer type_id,
                       Double amount, String receiver, String sender, Double tax) {
        this.id = id;
      //  this.user_id = user_id;
        this.timestamp = timestamp;
        this.type_id = type_id;
        this.amount = amount;
        this.receiver = receiver;
        this.sender = sender;
        this.tax = tax;
    }

    public Transaction() { }

}

