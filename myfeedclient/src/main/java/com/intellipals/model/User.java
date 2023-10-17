package com.intellipals.model;

import javax.xml.stream.Location;
import java.util.Objects;
import lombok.Data;

public class User {
    private String username;
    private String email;
    private String password;
    private Location location;
    private String contact;
    private String role;

    public User(){

    }

    public User(String username, String email, String password, Location location,String contact, String role)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.location = location;
        this.contact = contact;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(location, user.location) && Objects.equals(contact, user.contact) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password, location, contact, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", location=" + location +
                ", contact='" + contact + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
