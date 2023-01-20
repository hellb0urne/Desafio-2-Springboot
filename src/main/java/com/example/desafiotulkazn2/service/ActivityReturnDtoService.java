package com.example.desafiotulkazn2.service;

import com.example.desafiotulkazn2.dto.ActivityReturnDto;

import java.util.List;

/**
 * ActivityReturnDtoService.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

public interface ActivityReturnDtoService {

    /**
     * Metodo que consulta una lista de long ids, devulve una lista
     * de activity con los ids consultados y genera una instancia de
     * ActivityReturnDto
     *
     * @param id {@link List <Long>}
     * @return {@link ActivityReturnDto}
     */
    ActivityReturnDto activityReturnDtoList(List<Long> id);
}
