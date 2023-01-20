package com.example.desafiotulkazn2.service.impl;

import com.example.desafiotulkazn2.dto.ActivityDto;
import com.example.desafiotulkazn2.dto.ActivityReturnDto;
import com.example.desafiotulkazn2.entity.Activity;
import com.example.desafiotulkazn2.feign.UserFeignClient;
import com.example.desafiotulkazn2.properties.ActivityProperties;
import com.example.desafiotulkazn2.repository.DaoActivity;
import com.example.desafiotulkazn2.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.*;

/**
 * ActivityServiceImpl.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@Service
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    private final DaoActivity daoActivity;
    private final UserFeignClient userFeignClient;
    private final ActivityProperties activityProperties;

    /**
     * {@inheritDoc}
     */


    @Override
    @Transactional
    public List<Activity> saveActivityType() {
        List<String> typeList = activityProperties.getTypeList();
        List<Activity> activityList = new ArrayList<>();
        for (String a : typeList) {
            Activity activity = userFeignClient.saveActivityType(a);
            daoActivity.save(activity);
            activityList.add(activity);
        }
        return activityList;
    }


}
