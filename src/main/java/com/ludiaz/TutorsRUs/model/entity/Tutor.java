package com.ludiaz.TutorsRUs.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Tutor {

    @Id
    @GeneratedValue
    private long id;
    private static String first_name;
    private static String last_name;
    private static String email;
    private static String phone;
    private static boolean remote;
    private static float rating;
    private static String subject;

    public Tutor(String first_name, String last_name, String email, String phone, String subject, boolean remote) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.remote = remote;
    }
    public Tutor(String first_name, String last_name, String email, String phone, String subject) {
        super();
        Tutor(first_name, last_name, email, phone, subject, null);

    }
}
