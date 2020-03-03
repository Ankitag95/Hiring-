package com.ncr.hiring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncr.hiring.Bean.InterviewerLoginBean;
import com.ncr.hiring.ValueObject.*;
import com.ncr.hiring.model.HiringDao;
import com.ncr.hiring.repository.HiringRepository;

@Service
public class HiringService {
	
	@Autowired
	HiringRepository hiringRepository;
	
	
	public Iterable<HiringDao> getAllInterviewer()
	{
		return hiringRepository.getAllInterviewer();	
	}
	public HiringDao getInterviewerById(Long id)
	{
		return hiringRepository.getInterviewerById(id);
	}	
//	public boolean validateUser(String email,String password) {
//		return hiringRepository.validateUser(email,password);
//		
//	}
	//--------------------------------------------------------------------------------------------
//	public void validateUser(String email,String password) {
//		 hiringRepository.validateUser(email,password);
//		
//	}
	//------------------------------------------------------------------------------------------
//	public LoginBean validateUser(String email,String password) {
//		 return hiringRepository.validateUser(email,password);
//		
//	}
	public InterviewerLoginBean validateUser(InterviewerLoginBean interviewerLoginBean) {
		 return hiringRepository.validateUser(interviewerLoginBean);
		
	}
	
	
//	public HiringDao dashBoard(String email) {
//		return hiringRepository.dashBoard(email);
//	}
	
//	public boolean addFormData(FormVo formVo)
//	{
//		return hiringRepository.addFormData(formVo);
//		//return "sucess";
//	}
	
	public HiringDao registerInterviewer(RegisterInterviewer registerInterviewer)
	{
		return hiringRepository.registerInterviewer(registerInterviewer);
		//return "sucess";
	}
	
//	public Iterable<ToDoList> getData() {
//		return toDoRepository.getData();
//	}

//	public void setData(String task) {
//		toDoRepository.setData(task);
//		
//	}
//	
//	public void deleteData(long id) {
//		 toDoRepository.deleteData(id);
//		
//	}
//	
//	public void updateData( String task) {
//		toDoRepository.updateData(task);
//		
//	}
//	
//	
//
//	public void deleteAllData() {
//		 toDoRepository.deleteAllData();
//	}
//	
//	
	
	

}