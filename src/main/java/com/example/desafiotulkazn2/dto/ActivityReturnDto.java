package com.example.desafiotulkazn2.dto;

import lombok.Data;

import java.util.List;

/**
 * ActivityReturnDto.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@Data
public class ActivityReturnDto {

    private int totalActividades;
    private int totalParticipantes;
    private List<String>resumenActividades;


}
