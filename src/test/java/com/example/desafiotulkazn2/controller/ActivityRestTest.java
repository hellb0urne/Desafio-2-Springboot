package com.example.desafiotulkazn2.controller;

import com.example.desafiotulkazn2.activityget.ActivityGet;
import com.example.desafiotulkazn2.dto.ActivityDto;
import com.example.desafiotulkazn2.dto.ActivityReturnDto;
import com.example.desafiotulkazn2.entity.Activity;
import com.example.desafiotulkazn2.service.ActivityService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class ActivityRestTest {

    @Mock
    private ActivityService activityService;

    @InjectMocks
    private ActivityRest activityRest;

    @Test
    void saveActivityType() {
        List<Activity> activityList = ActivityGet.activityGetList();
        Mockito.when(this.activityService.saveActivityType()).thenReturn(activityList);
        Assertions.assertNotNull(this.activityRest.saveActivityType());

    }

    @Test
    void activityReturnDtoList() {
        ActivityReturnDto activityReturnDto = ActivityGet.activityReturnDtoGet();
        Mockito.when(this.activityRest.activityReturnDtoList(ActivityGet.longListGet())).thenReturn(activityReturnDto);
        this.activityRest.activityReturnDtoList(ActivityGet.longListGet());
        Assertions.assertEquals(2, activityReturnDto.getTotalActividades());
    }
}