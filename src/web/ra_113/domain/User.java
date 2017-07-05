package web.ra_113.domain;

import org.joda.time.DateTime;

import java.io.Serializable;

public class User implements Serializable {

    private String username;

    private String password;

    private String name;

    private String surname;

    private UserRole role;

    private String telephoneNumber;

    private DateTime registeredAt;

    // TODO List of starred forums, saved themes and saved comments

    public User() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public DateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(DateTime registeredAt) {
        this.registeredAt = registeredAt;
    }
}
