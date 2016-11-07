package by.htp.library.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idusers")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id = 0;
    @Column(name = "login")
    @Size(min = 4, message = "{name.size.error}")
    private String login = null;
    @Column(name = "password")
    @Size(min = 4, max = 10, message = "{password.size.error}")
    private String password = null;
    @Column(name = "role")
    private String role = null;
    @Column(name = "blacklist")
    private String blacklist = null;


    public User() {
    }

    public User(String login, String password, String role, String blacklist) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.blacklist = blacklist;
    }



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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() { return password; }

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
