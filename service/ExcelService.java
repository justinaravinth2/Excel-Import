package com.excelupload.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.excelupload.sample.entity.Tutorial;
import com.excelupload.sample.helper.ExcelHelper;
import com.excelupload.sample.repository.TutorialRepository;

@Service
public class ExcelService {
	
	@Autowired
	TutorialRepository repository;
	
	public void save(MultipartFile file) {
		try {
			List<Tutorial>tutorial=ExcelHelper.excelTutorials(file.getInputStream());
			repository.saveAll(tutorial);
			
		}catch (Exception e) {
			throw new RuntimeException("Fail to Store Excel data:"+e.getMessage());
		}
	}
	
	public List<Tutorial> getAlltutorials(){
		return repository.findAll();
	}

}
