package com.ncr.hiring.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ncr.hiring.Bean.InterviewerLoginBean;

import com.ncr.hiring.ValueObject.*;
import com.ncr.hiring.model.HiringDao;

import HQL.HibernateQuerries;

@Repository
@Transactional
public class HiringRepository {
	
@Autowired
HiringCrudRepository hiringCrudRepository;

@PersistenceContext
EntityManager em;


public Iterable<HiringDao> getAllInterviewer() {
	return hiringCrudRepository.findAll();
	}

//BOOLEAN TRY
//public boolean validateUser(String email,String password) {
//	HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
//	return hibernateQuerries.validateUser(email, password);
//}
//----------------------------------------------------------------------------------
//VOID TRY
//public void validateUser(String email,String password) {
//	HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
//	 hibernateQuerries.validateUser(email, password);
//}
//---------------------------------------------------------------------------------
//LOGINBEAN TRY
//public LoginBean validateUser(String email,String password) {
//HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
//return hibernateQuerries.validateUser(email, password);
//}
public InterviewerLoginBean validateUser(InterviewerLoginBean interviewerLoginBean) 
{
	HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
	System.out.println(hibernateQuerries.validateUser(interviewerLoginBean));
	return hibernateQuerries.validateUser(interviewerLoginBean);
	
}
//public HiringDao dashBoard(String email) {
//	HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
//	
//	return hibernateQuerries.dashBoard(email);
//}

//public boolean addFormData(FormVo formVo)
//{	
//	HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
//	HiringDao hiringDao= new HiringDao();
//	hiringDao.setID(formVo.getId());
//	hiringDao.setfName(formVo.getfName());
//	hiringDao.setlName(formVo.getlName());
//	hiringDao.setDob(formVo.getDob());
//	hiringDao.setGender(formVo.getGender());
//	hiringDao.setEmail(formVo.getEmail());
//	hiringDao.setPassword(formVo.getPassword());
//	hiringDao.setNumber(formVo.getNumber());
//    return hibernateQuerries.addFormData(formVo);
//	
//}

public HiringDao registerInterviewer(RegisterInterviewer registerInterviewer)
{	
	HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
	HiringDao hiringDao= new HiringDao();
	hiringDao.setID(registerInterviewer.getId());
	hiringDao.setfName(registerInterviewer.getfName());
	hiringDao.setlName(registerInterviewer.getlName());
	
	if(registerInterviewer.getSkills() != null)
		hiringDao.setSkills(registerInterviewer.getSkills());
	if(registerInterviewer.getSkills2() != null)
		hiringDao.setSkills2(registerInterviewer.getSkills2());
	if(registerInterviewer.getSkills3() != null)
		hiringDao.setSkills3(registerInterviewer.getSkills3());
	if(registerInterviewer.getSkills4() != null)
		hiringDao.setSkills4(registerInterviewer.getSkills4());
	if(registerInterviewer.getSkills5() != null)	
		hiringDao.setSkills5(registerInterviewer.getSkills5());    
	
	hiringDao.setEmail(registerInterviewer.getEmail());
	hiringDao.setPassword(registerInterviewer.getPassword());
	hiringDao.setCpassword(registerInterviewer.getCpassword());
	hiringDao.setNumber(registerInterviewer.getNumber());
		
    return hiringCrudRepository.save(hiringDao);
    
}

//public Iterable<HiringDao> getData() {
//	HibernateQuerries hibernateQuerries=new HibernateQuerries(em);
//	return hibernateQuerries.getData();
//	}


//   public void setData( String task) 
//   {
//	  ToDoList obj=new ToDoList();
//	  obj.setTask(task);
//	  toDoCrudRepository.save(obj);
//	
//   }
   
//   public void deleteData(long id) {
//		 toDoCrudRepository.deleteById(id);
//		
//	}
   
   
//   public void updateData(String task) {
//		// TODO Auto-generated method stub
//		ToDoList obj1=new ToDoList();
//		obj1.setTask(task);
//		toDoCrudRepository.save(obj1);
//	}
   
//   public void deleteAllData() {
//		// TODO Auto-generated method stub
//		toDoCrudRepository.deleteAll();
//	}


}