package com.example.desafiotulkazn2.service.impl;

import com.example.desafiotulkazn2.activityget.ActivityGet;
import com.example.desafiotulkazn2.entity.Activity;
import com.example.desafiotulkazn2.feign.UserFeignClient;
import com.example.desafiotulkazn2.properties.ActivityProperties;
import com.example.desafiotulkazn2.repository.DaoActivity;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

/**
 * ActivityServiceImplTest.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@ExtendWith(MockitoExtension.class)
class ActivityServiceImplTest {

    @Mock
    private DaoActivity daoActivity;

    @Mock
    private UserFeignClient userFeignClient;

    @Mock
    private ActivityProperties activityProperties;

    @InjectMocks
    private ActivityServiceImpl activityService;

    @Test
    void saveActivityType() {

        List<String> stringList = ActivityGet.stringList();
        Mockito.when(this.activityProperties.getTypeList()).thenReturn(stringList);
        Activity activity = ActivityGet.activityGet();
        Mockito.when(this.userFeignClient.saveActivityType("education")).thenReturn(activity);
        Mockito.when(this.daoActivity.save(ArgumentMatchers.any(Activity.class))).thenReturn(activity);
        List<Activity> activityList = new ArrayList<>();
        activityList.add(activity);
        this.activityService.saveActivityType();
        Assert.assertEquals("education", activity.getType());




    }



}