package DATA_DO;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DATA_VO.VO;


public class DAO {

	public void insert(VO dv){
		try
		{
			SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session =sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(dv);
			
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public List search() {
		// TODO Auto-generated method stub
		
		List ls = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Query q = session.createQuery("from VO");
			ls = q.list();
			System.out.println("List = "+ls.size());
			return ls;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return null;
	}

	public List edit(VO dv) {
		// TODO Auto-generated method stub
		List ls=null;
		try {
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			
			Query w=session.createQuery("from VO where data_Id='"+dv.getData_Id()+"'");
			
			ls=w.list();
			
			
			
			
			} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			}
	
		
		return ls;
	}

	public void update(VO dv) {
		// TODO Auto-generated method stub
		
		
		try
		{
			SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session =sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.update(dv);
			
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	public void delete(VO dv) {
		// TODO Auto-generated method stub
		
		try
		{
			SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session =sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.delete(dv);
			
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}


}


