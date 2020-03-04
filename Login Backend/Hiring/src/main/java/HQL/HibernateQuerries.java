package HQL;


import java.math.BigInteger;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.ncr.hiring.Bean.InterviewerLoginBean;
//import com.ncr.hiring.Bean.loginBean;
import com.ncr.hiring.Helper.CommonUtils;
import com.ncr.hiring.ValueObject.RegisterInterviewer;
import com.ncr.hiring.model.HiringDao;

class bean{
	public String email;
	public String first_name;
	public String last_name;
}
@Transactional
public class HibernateQuerries {
 
private EntityManager em;
public HibernateQuerries(EntityManager em) {
	super();
	this.em = em;
	}



//public boolean addFormData(FormVo formVo)
//{
//	//int result= em.createNativeQuery("insert into user_list(id,) values(:f, First_Name=:a,Last_Name=:b,DOB=:c,Gender=:d,Email=:x,Password=:y,Number=:e )").setParameter("a", formVo.getfName()).setParameter("b",formVo.getlName()).setParameter("c",formVo.getDob()).setParameter("d",formVo.getGender()).setParameter("x",formVo.getEmail()).setParameter("y", formVo.getPassword()).setParameter("e", formVo.getNumber()).setParameter("f", formVo.getId()).executeUpdate();
//	Query q=em.createQuery("Insert into HiringDao(ID,Email,Password,CPassword,DOB,First_Name,Gender,Last_Name,Number) Values (formVo.getId(),formVo.getEmail(),formVo.getPassword(),formVo.getCPassword(),formVo.getDob(),formVo.getfName(),formVo.getGender(),formVo.getlName(),formVo.getNumber()");
//	int result=q.executeUpdate();
//	
//	if(result==1) {
//		System.out.println("sucess");
//		return true;
//	}
//	else return false;
//	
//	
//}


public HiringDao dashBoard(String email) {
	HiringDao beanObj = new HiringDao();
	System.out.println("dashboard success");
	Query q=em.createQuery("From HiringDao where email=:email").setParameter("email",email);
	beanObj = (HiringDao) q.getSingleResult();
	
	return beanObj;
}
//------------------------------------------------------------------------------------------------------------------

//public LoginBean validateUser(String email,String password) {
//	LoginBean loginBean=new LoginBean();
//	System.out.println("Hibernate func");
//	BigInteger b=(BigInteger)em.createNativeQuery("select count(*) from user_list where Email=:x  and Password=:y").setParameter("x", email).setParameter("y", password).getSingleResult();
//	HiringDao hiringDao = new HiringDao();
//	
//	
//	if(b.intValue()==1) {
//		hiringDao = (HiringDao) em.createQuery("From HiringDao where email=:x").setParameter("x", email).getSingleResult();
//		loginBean.setiD(hiringDao.getID());
//		loginBean.setfName(hiringDao.getfName());
//		loginBean.setlName(hiringDao.getlName());
//		loginBean.setEmail(hiringDao.getEmail());
//		loginBean.setiD(hiringDao.getID());
//		loginBean.setValid(true);
//		return loginBean;}
//	else
//	{
//		loginBean.setValid(false);
//		return loginBean;
//	}	
//}
public InterviewerLoginBean validateUser(InterviewerLoginBean loginBean) {
	//LoginBean loginBean=new LoginBean();
	System.out.println("Hibernate func");
	BigInteger b=(BigInteger)em.createNativeQuery("select count(*) from user_list where Email=:x  and Password=:y").setParameter("x", loginBean.getEmail()).setParameter("y", loginBean.getPassword()).getSingleResult();
	HiringDao hiringDao = new HiringDao();
	
	if(b.intValue()==1) 
	{
		hiringDao = (HiringDao) em.createQuery("From HiringDao where email=:x").setParameter("x", loginBean.getEmail()).getSingleResult();
		loginBean.setiD(hiringDao.getID());
		loginBean.setfName(hiringDao.getfName());
		loginBean.setlName(hiringDao.getlName());
		loginBean.setEmail(hiringDao.getEmail());
		loginBean.setiD(hiringDao.getID());
		loginBean.setValid(true);
		return loginBean;
	}
	else
	{
		loginBean.setValid(false);
		return loginBean;
	}	
}
//----------------------------------------------------------------------------------------------------------------------

//public boolean validateUser(String email,String password) {
//	System.out.println("Hibernate func");
//	BigInteger b=(BigInteger)em.createNativeQuery("select count(*) from user_list where Email=:x  and Password=:y").setParameter("x", email).setParameter("y", password).getSingleResult();
//	
//	if(b.intValue()==1)
//		return true;
//	else
//		return false;
//}

//------------------------------------------------------------------------------------------------------------------------

//public void validateUser(String email,String password) {
//	System.out.println("Hibernate func");
//	BigInteger b=(BigInteger)em.createNativeQuery("select * from user_list where Email=:x  and Password=:y").setParameter("x", email).setParameter("y", password).getSingleResult();
//	
////	if(b.intValue()==1)
////		return true;
////	else
////		return false;
////	System.out.println(b);
//}


}
