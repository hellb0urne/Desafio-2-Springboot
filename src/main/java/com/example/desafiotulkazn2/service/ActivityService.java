package com.example.desafiotulkazn2.service;

import com.example.desafiotulkazn2.dto.ActivityDto;
import com.example.desafiotulkazn2.dto.ActivityReturnDto;
import com.example.desafiotulkazn2.entity.Activity;

import java.util.List;


/**
 * ActivityService.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

public interface ActivityService {

    /**
     * Metodo que realiza un llamado feign tipo get
     * y genera una orquesta que guarda activity por type
     * y retorna una lista de activity
     * @return {@link List<Activity>}
     */


    List<Activity> saveActivityType();



}
