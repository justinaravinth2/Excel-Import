package com.excelupload.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelupload.sample.entity.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {

}
