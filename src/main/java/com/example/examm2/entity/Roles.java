package com.example.examm2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Roles {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Member member;
    private String role;

}
