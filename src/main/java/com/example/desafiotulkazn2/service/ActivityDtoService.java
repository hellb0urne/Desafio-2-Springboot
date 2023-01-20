package com.example.desafiotulkazn2.service;

import com.example.desafiotulkazn2.dto.ActivityDto;

import java.util.List;

/**
 * ActivityDtoService.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

public interface ActivityDtoService {

    /**
     * Metodo que toma una lista de Activity
     * y genera una instancia de ActivityDto
     *
     * @return {@link List < ActivityDto >}
     */
    List<ActivityDto> getActivityDto();
}
