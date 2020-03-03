package com.ncr.hiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ncr.hiring.Bean.InterviewerLoginBean;
import com.ncr.hiring.ValueObject.*;
import com.ncr.hiring.model.HiringDao;
import com.ncr.hiring.service.HiringService;
import io.swagger.annotations.ApiOperation;

@RestController
@ControllerAdvice
@CrossOrigin(origins= "http://localhost:4200")
public class HiringController {

	@Autowired
	HiringService hiringService;
	
	
	@ApiOperation(value="Get Data",notes="Get data from database")
	@GetMapping(value="/api/get/all")
	public Iterable<HiringDao> getAllInterviewer()
	{
		System.out.println("Success");
		return hiringService.getAllInterviewer();
	}
		
	
	@ApiOperation(value="Get Data",notes="Get data from database")
	@GetMapping(value="/api/get/ById")
	public HiringDao getInterviewerById(Long id)
	{
		System.out.println("Success");
		return hiringService.getInterviewerById(id);
	}
	
	
	@ApiOperation(value="login",notes="loginoperation")
	@PostMapping(value="/api/login")
	public InterviewerLoginBean validateUser(@RequestBody InterviewerLoginBean interviewerLoginBean) 
	{	
		return hiringService.validateUser(interviewerLoginBean);
	}
	
	@ApiOperation(value="Inserting Form Data",notes="")
	@PostMapping(value="/api/insert/createuser")
	public HiringDao registerInterviewer(@RequestBody RegisterInterviewer registerInterviewer)
	{
		return hiringService.registerInterviewer(registerInterviewer);
	}
}