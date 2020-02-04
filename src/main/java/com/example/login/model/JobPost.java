package com.example.login.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "jobpost")
@Getter
@Setter
@ToString
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_id")
    private int jobid;

    @Column(name = "job_title ")
    private String jobtitle ;

    @Column(name = "description")
    private String description;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "location ")
    private String location ;

    @Column(name = "job_nature")
    private String jobnature ;

    @Column(name = "vacancy")
    private String vacancy ;

    @Column(name = "salary")
    private String salary;

}