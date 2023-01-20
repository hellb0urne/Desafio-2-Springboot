package com.example.desafiotulkazn2.repository;

import com.example.desafiotulkazn2.entity.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * DaoActivity.
 *
 * @author hellb0urne.
 * @version 1.0.0, 01-01-2023
 */

@Repository
public interface DaoActivity extends CrudRepository<Activity, Long> {


}
