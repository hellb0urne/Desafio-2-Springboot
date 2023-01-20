package com.example.desafiotulkazn2.service.impl;

import com.example.desafiotulkazn2.dto.ActivityDto;
import com.example.desafiotulkazn2.entity.Activity;
import com.example.desafiotulkazn2.repository.DaoActivity;
import com.example.desafiotulkazn2.service.ActivityDtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityDtoServiceImpl.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */


@Service
@RequiredArgsConstructor
public class ActivityDtoServiceImpl implements ActivityDtoService {

    private final DaoActivity daoActivity;

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public List<ActivityDto> getActivityDto() {
        List<Activity> activities = (List<Activity>) daoActivity.findAll();
        List<ActivityDto> activityDtoList = new ArrayList<>();
        for (Activity a : activities) {
            ActivityDto activityDto = new ActivityDto();
            activityDto.setIdActividad(a.getId());
            activityDto.setDescripcionActividad(a.getActivity());
            activityDto.setTipoActividad(a.getType());
            activityDtoList.add(activityDto);

        }
        return activityDtoList;
    }

}
