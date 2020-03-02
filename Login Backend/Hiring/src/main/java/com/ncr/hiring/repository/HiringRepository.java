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
public LoginBean validateUser(LoginBean loginBean) {
HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
return hibernateQuerries.validateUser(loginBean);
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

public HiringDao addFormData(FormVo formVo)
{	
	//HibernateQuerries hibernateQuerries = new HibernateQuerries(em);
	HiringDao hiringDao= new HiringDao();
	hiringDao.setID(formVo.getId());
	hiringDao.setfName(formVo.getfName());
	hiringDao.setlName(formVo.getlName());
    hiringDao.setSkills(formVo.getSkills());
    hiringDao.setSkills2(formVo.getSkills2());
    hiringDao.setSkills3(formVo.getSkills3());
    hiringDao.setSkills4(formVo.getSkills4());
    hiringDao.setSkills5(formVo.getSkills5());    
	hiringDao.setEmail(formVo.getEmail());
	hiringDao.setPassword(formVo.getPassword());
	hiringDao.setCpassword(formVo.getCpassword());
	hiringDao.setNumber(formVo.getNumber());
		
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