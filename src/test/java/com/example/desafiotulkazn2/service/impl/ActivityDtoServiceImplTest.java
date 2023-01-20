package com.example.desafiotulkazn2.service.impl;

import com.example.desafiotulkazn2.activityget.ActivityGet;
import com.example.desafiotulkazn2.entity.Activity;
import com.example.desafiotulkazn2.repository.DaoActivity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


/**
 * ActivityDtoServiceImplTest.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@ExtendWith(MockitoExtension.class)
class ActivityDtoServiceImplTest {


    @Mock
    private DaoActivity daoActivity;

    @InjectMocks
    private ActivityDtoServiceImpl activityService;


    @Test
    public void getActivityDto() {
        List<Activity> activityList = ActivityGet.activityGetList();
        Mockito.when(daoActivity.findAll()).thenReturn(activityList);
        Assertions.assertNotNull(this.activityService.getActivityDto());

    }
}