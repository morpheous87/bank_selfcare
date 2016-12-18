package yourbank.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mario on 15.12.2016 г..
 */
@Entity
@Table(name = "roles")
public class Role {

    private Integer id;
    private String role_name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "role_name", nullable = false)
    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    private Set<User> users;

    public Role() {
        this.users = new HashSet<>();
    }

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }


}
