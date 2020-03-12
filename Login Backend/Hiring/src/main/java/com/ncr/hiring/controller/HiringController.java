package com.ncr.hiring.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ncr.hiring.Bean.InterviewerLoginBean;
import com.ncr.hiring.ValueObject.RegisterInterviewer;
import com.ncr.hiring.model.HiringDao;
import com.ncr.hiring.service.HiringService;

import io.swagger.annotations.ApiOperation;

@RestController
@ControllerAdvice
@CrossOrigin(origins= "http://localhost:4200")
public class HiringController {

	@Autowired
	HiringService hiringService;
	
	
	@ApiOperation(value="Get Dat",notes="Get data from database")
	@GetMapping(value="/api/login/test")
	public Iterable<HiringDao> getUser(){
		System.out.println("Success");
	return hiringService.getUser();
	}
	
	
	@ApiOperation(value="login",notes="loginoperation")
	@PostMapping(value="/api/login")
	
	//BOOLEAN TRY
//	public boolean validateUser(@RequestParam String email,@RequestParam String password) {
//		return hiringService.validateUser(email,password);
//		
//	}
//----------------------------------------------------------------------------------------------------
	//LOGICBEAN TRY
//	public LoginBean validateUser(@RequestBody String email,@RequestBody String password) {
//	return hiringService.validateUser(email,password);
//	
//}
	public InterviewerLoginBean validateUser(@RequestBody InterviewerLoginBean loginBean) {
	return hiringService.validateUser(loginBean);
	
}
	//------------------------------------------------------------------------------------------------
	//VOID TRY
//	public void validateUser(@RequestParam String email,@RequestParam String password) {
//		 hiringService.validateUser(email,password);
//		
//	}
	
//	@ApiOperation(value="Ddisplay",notes="dashboard display")
//	@GetMapping(value="/api/ddisplay/")
//	@ResponseBody
//	public HiringDao dashBoard(@RequestParam String email) {
//		return hiringService.dashBoard(email);
//	}
	
	@ApiOperation(value="Inserting Form Data",notes="")
	@PostMapping(value="/api/insert/createuser")
	
//	public boolean addFormData(@RequestBody FormVo formVo)
//	{
//		return hiringService.addFormData(formVo);
//		//return "success";
//	}
	
	public HiringDao registerInterviewer(@RequestBody RegisterInterviewer registerInterviewer) throws NoSuchAlgorithmException
	{
		return hiringService.registerInterviewer(registerInterviewer);
		//return "success";
	}
	
//	@ApiOperation(value="",notes="")
//	@GetMapping(value="/api/getData")
//	public Iterable<ToDoList> getData() {
//		return toDoService.getData();
//	}
//	
//	@ApiOperation(value="To insert new task",notes="")
//	@PostMapping(value="/api/todo")
//	public Iterable<ToDoList> setData(String task)
//	{
//		toDoService.setData(task);
//		return getData();
//	}
//	
//	
//	@ApiOperation(value="To delete  task",notes="")
//	@DeleteMapping(value="/api/todo/{id}")
//	public Iterable<ToDoList> deleteData(@PathVariable long id) {
//		 toDoService.deleteData(id);
//		 return getData();
//	}
//	
//	@ApiOperation(value="To Update  task",notes="")
//	@PutMapping(value="/api/todo/{task}")
//	public Iterable<ToDoList> updateData(@PathVariable String task)
//	{
//		toDoService.setData(task);
//		return getData();
//	}
//	
//	
//	@ApiOperation(value="To Delete All  task",notes="")
//	@DeleteMapping(value="api/todo")
//	public Iterable<ToDoList> deleteAllData() {
//		 toDoService.deleteAllData();
//		 return getData();
//	}
//	

	
}