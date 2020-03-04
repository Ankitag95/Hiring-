package com.ncr.hiring.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ncr.hiring.Bean.LoginBean;
import com.ncr.hiring.ValueObject.FormVo;
import com.ncr.hiring.model.HiringDao;

import HQL.HibernateQuerries;

@Repository
@Transactional
public class HiringRepository {
	
@Autowired
HiringCrudRepository hiringCrudRepository;

@PersistenceContext
EntityManager em;


public Iterable<HiringDao> getUser() {
	return hiringCrudRepository.findAll();
	}


	public InterviewerLoginBean validateUser(InterviewerLoginBean interviewerLoginBean) 
	{
		HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
		System.out.println(hibernateQuerries.validateUser(interviewerLoginBean));
		return hibernateQuerries.validateUser(interviewerLoginBean);
	
	}

	public HiringDao getInterviewerById(Long id)
	{
		return hiringCrudRepository.findById(id).orElse(null);
	}

	public HiringDao registerInterviewer(RegisterInterviewer registerInterviewer)
	{	
		//HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
		HiringDao hiringDao= new HiringDao();
		hiringDao.setID(registerInterviewer.getId());
		hiringDao.setfName(registerInterviewer.getfName());
		hiringDao.setlName(registerInterviewer.getlName());
		hiringDao.setQlid(registerInterviewer.getQlid());
		
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
	hiringDao.setMonth(registerInterviewer.getMonth());
	hiringDao.setYear(registerInterviewer.getYear());
		
		return hiringCrudRepository.save(hiringDao);
    
	}

	public void deleteInterviewerById(Long id) {
		// TODO Auto-generated method stub
		 hiringCrudRepository.deleteById(id);
	}
	
}