package com.example.desafiotulkazn2.service.impl;

import com.example.desafiotulkazn2.dto.ActivityReturnDto;
import com.example.desafiotulkazn2.entity.Activity;
import com.example.desafiotulkazn2.repository.DaoActivity;
import com.example.desafiotulkazn2.service.ActivityReturnDtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


/**
 * ActivityReturnDtoServiceImpl.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@Service
@RequiredArgsConstructor
public class ActivityReturnDtoServiceImpl implements ActivityReturnDtoService {

    private final DaoActivity daoActivity;

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public ActivityReturnDto activityReturnDtoList(List<Long> id) {
        List<Activity> activityList = (List<Activity>) this.daoActivity.findAllById(id);
        List<String> stringList = new ArrayList<>();
        ActivityReturnDto activityReturnDto = new ActivityReturnDto();
        int sumActivity = 0;
        for (Activity a : activityList) {
            sumActivity++;
            activityReturnDto.setTotalActividades(sumActivity);
            activityReturnDto.setTotalParticipantes(a.getParticipants() + activityReturnDto.getTotalParticipantes());
            stringList.add(a.getActivity());
            activityReturnDto.setResumenActividades(stringList);
        }
        return activityReturnDto;
    }

}
