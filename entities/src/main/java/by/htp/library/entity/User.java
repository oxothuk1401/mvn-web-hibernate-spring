package by.htp.library.entity;



import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idusers")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id = 0;
    @Column(name = "login")
    @Size(min = 6, message = "{name.size.error}")
    private String login = null;
    @Column(name = "password")
    @Size(min = 5, max = 10, message = "{password.size.error}")
    private String password = null;
    @Column(name = "role")
    private String role = null;
    @Column(name = "blacklist")
    private String blacklist = null;


    public String getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(String blacklist) {
        this.blacklist = blacklist;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id = " + id + "\n" +
                "Login = " + login + "\n" +
                "Role = " + role + "\n" +
                "Blacklist = " + blacklist;
    }
}
