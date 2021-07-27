package com.exercicioextraconsultorio.exercicioextraconsultorio.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patient")
@Data
@NoArgsConstructor
public class Patient {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String gerder;

    public Patient(String firstName, String lastName, Integer age, String gerder) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gerder = gerder;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGerder() {
        return gerder;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder;
    }
}
