package com.example.desafiotulkazn2.activityget;

import com.example.desafiotulkazn2.dto.ActivityDto;
import com.example.desafiotulkazn2.dto.ActivityReturnDto;
import com.example.desafiotulkazn2.entity.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityGet {

    public static Activity activityGet() {

        Activity activity = new Activity();
        activity.setId(1L);
        activity.setActivity("education");
        activity.setType("education");
        activity.setParticipants(1);
        activity.setPrice(1.2);
        activity.setLink("das");
        activity.setKey("sad");
        activity.setAccessibility(1.3);
        return activity;
    }

    public static List<Activity> activityGetList() {

        Activity activity = new Activity();
        activity.setId(1L);
        activity.setActivity("dasd");
        activity.setType("da");
        activity.setParticipants(1);
        activity.setPrice(1.2);
        activity.setLink("dsad");
        activity.setKey("sad");
        activity.setAccessibility(1.3);

        Activity activity1 = new Activity();
        activity1.setId(2L);
        activity1.setActivity("dasd");
        activity1.setType("da");
        activity1.setParticipants(1);
        activity1.setPrice(1.2);
        activity1.setLink("dsad");
        activity1.setKey("sad");
        activity1.setAccessibility(1.3);


        List<Activity> activities = new ArrayList<>();
        activities.add(activity);
        activities.add(activity1);

        return activities;
    }

    public static List<ActivityDto> activityDtoGet() {

        List<ActivityDto> activityDtoList = new ArrayList<>();
        ActivityDto activityDto = new ActivityDto();
        activityDto.setIdActividad(1L);
        activityDto.setDescripcionActividad("bailabaila");
        activityDto.setTipoActividad("playdota");
        activityDtoList.add(activityDto);
        return activityDtoList;

    }

    public static ActivityReturnDto activityReturnDtoGet() {

        ActivityReturnDto activityReturnDto = new ActivityReturnDto();
        activityReturnDto.setTotalActividades(2);
        activityReturnDto.setTotalParticipantes(2);
        List<String> stringList = new ArrayList<>();
        stringList.add("play dota");
        stringList.add("play programing");
        return activityReturnDto;

    }

    public static List<Long> longListGet() {

        List<Long> activitiesLong = new ArrayList<>();
        activitiesLong.add(1L);
        activitiesLong.add(2L);
        return activitiesLong;
    }

    public static List<String> stringList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("education");
        stringList.add("recreational");
        stringList.add("social");
        stringList.add("diy");
        stringList.add("charity");
        stringList.add("cooking");
        stringList.add("relaxation");
        stringList.add("music");
        stringList.add("busywork");
        return stringList;
    }

}
