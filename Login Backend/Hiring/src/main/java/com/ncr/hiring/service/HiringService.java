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

	public InterviewerLoginBean validateUser(InterviewerLoginBean interviewerLoginBean) {
		 return hiringRepository.validateUser(interviewerLoginBean);
		
	}
	
	
	
	public HiringDao registerInterviewer(RegisterInterviewer registerInterviewer)
	{
		return hiringRepository.registerInterviewer(registerInterviewer);
		//return "sucess";
	}
	public void deleteInterviewerById(Long id) {
		hiringRepository.deleteInterviewerById(id);
	}


}