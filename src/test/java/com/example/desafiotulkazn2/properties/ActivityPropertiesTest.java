package com.example.desafiotulkazn2.properties;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class ActivityPropertiesTest {

    @Test
    void testGetterAndSetterTypeList() {
        ActivityProperties activityProperties = new ActivityProperties();
        List<String> stringList = new ArrayList<>();
        stringList.add("roberto");
        activityProperties.setTypeList(stringList);
        Assertions.assertNotNull(activityProperties.getTypeList());

    }

}