package ru.kata.spring.boot_security.demo.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String firstName;
    @Column
    private String secondName;
    @Column
    private Integer age;

    public User() {}

    public User(Integer id, String firstName, String secondName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public User(String firstName, String secondName, Integer age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(age, user.age) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(secondName, user.secondName) &&
                Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + firstName +
                "', secondName='" + secondName +
                "', age=" + age + '}';
    }
}
