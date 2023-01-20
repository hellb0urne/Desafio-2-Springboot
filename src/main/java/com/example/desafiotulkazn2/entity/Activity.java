package com.example.desafiotulkazn2.entity;

import lombok.*;

import javax.persistence.*;
/**
 * Activity.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String activity;
    private String type;
    private int participants;
    private double price;
    private String link;
    private String key;
    private double accessibility;


}
