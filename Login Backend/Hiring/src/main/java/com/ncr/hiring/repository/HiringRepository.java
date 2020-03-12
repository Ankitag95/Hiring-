package com.ncr.hiring.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ncr.hiring.Bean.InterviewerLoginBean;
import com.ncr.hiring.ValueObject.RegisterInterviewer;
import com.ncr.hiring.model.HiringDao;

import HQL.HibernateQuerries;

@Repository
@Transactional
public class HiringRepository {
	
@Autowired
HiringCrudRepository hiringCrudRepository;

@PersistenceContext
EntityManager em;


public Iterable<HiringDao> findAllInterviewers() 
{
	
	HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
	return hibernateQuerries.findAllInterviewers();

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

	public HiringDao registerInterviewer(RegisterInterviewer registerInterviewer) throws NoSuchAlgorithmException
	{	
		//HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
		HiringDao hiringDao= new HiringDao();
		hiringDao.setID(registerInterviewer.getId());
		hiringDao.setfName(registerInterviewer.getfName());
		hiringDao.setlName(registerInterviewer.getlName());
		hiringDao.setQlid(registerInterviewer.getQlid());
		
		if(registerInterviewer.getSkill1() != null)
			hiringDao.setInterviewer_skill1(registerInterviewer.getSkill1());
		if(registerInterviewer.getSkill2() != null)
			hiringDao.setInterviewer_skill2(registerInterviewer.getSkill2());
		if(registerInterviewer.getSkill3() != null)
			hiringDao.setInterviewer_skill3(registerInterviewer.getSkill3());
		if(registerInterviewer.getSkill4() != null)
			hiringDao.setInterviewer_skill4(registerInterviewer.getSkill4());
		if(registerInterviewer.getSkill5() != null)	
			hiringDao.setInterviewer_skill5(registerInterviewer.getSkill5());    
	

		//Encrypting Password/////////////////////////////////////
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] byteSalt = createSalt();
		md.reset();
		md.update(byteSalt);
		StringBuffer hashCode = new StringBuffer();
		byte[] hashBytes = md.digest(registerInterviewer.getPassword().getBytes());
		for (byte b : hashBytes) {
			hashCode.append(String.format("%02x", b));
		}
		
		
		hiringDao.setEmail(registerInterviewer.getEmail());
	//hiringDao.setPassword(registerInterviewer.getPassword());
	//hiringDao.setCpassword(registerInterviewer.getCpassword());
	hiringDao.setNumber(registerInterviewer.getNumber());
	hiringDao.setMonth(registerInterviewer.getMonth());
	hiringDao.setYear(registerInterviewer.getYear());
	hiringDao.setRole();
	
	hiringDao.setPassword(hashCode.toString());
	hiringDao.setCpassword(hashCode.toString());
	hiringDao.setSalt(byteSalt);
	
	
	
	return hiringCrudRepository.save(hiringDao);
    
}



private byte[] createSalt() {

	byte[] b = new byte[25];
	
	SecureRandom random = new SecureRandom();
	random.nextBytes(b);
	for(byte bb: b) {
		System.out.println(bb);
	}
	return b;
}





	public void deleteInterviewerById(Long id) {
		// TODO Auto-generated method stub
		 hiringCrudRepository.deleteById(id);
	}
	
}