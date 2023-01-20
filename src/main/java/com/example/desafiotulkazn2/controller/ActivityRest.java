package com.example.desafiotulkazn2.controller;

import com.example.desafiotulkazn2.dto.ActivityDto;
import com.example.desafiotulkazn2.dto.ActivityReturnDto;
import com.example.desafiotulkazn2.entity.Activity;
import com.example.desafiotulkazn2.service.ActivityDtoService;
import com.example.desafiotulkazn2.service.ActivityReturnDtoService;
import com.example.desafiotulkazn2.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ActivityRest.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ActivityRest {

    private final ActivityService activityService;
    private final ActivityDtoService activityDtoService;
    private ActivityReturnDtoService activityReturnDtoList;


    /**
     * controller que retorna una lista de Activity
     *
     * @return {@link List<Activity>}
     */
    @PostMapping("/saveActivityType/")
    public List<Activity> saveActivityType() {
        return activityService.saveActivityType();
    }


    /**
     * controller que retorna una lista de ActivityDto
     *
     * @return {@link List<ActivityDto>}
     */
    @GetMapping("/getActivityDto")
    public List<ActivityDto> getActivityDto() {
        return activityDtoService.getActivityDto();
    }

    /**
     * controller que recibe una lista de Long ids y retorna el servicio que
     * devuelve una instancia de ActivityReturnDto
     *
     * @param id {@link Long}
     * @return {@link ActivityReturnDto}
     */
    @PostMapping("/activityReturnDtoList")
    public ActivityReturnDto activityReturnDtoList(@RequestBody List<Long> id) {
        return activityReturnDtoList.activityReturnDtoList(id);
    }


}
