package DATA_DO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DATA_VO.CLASS_VO;


public class CLASS_DAO {
	
	public void insert(CLASS_VO dv){
		try
		{
			SessionFactory  sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session =sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(dv);
			
			tr.commit();
			
			session.close();
		}
		catch(Exception ex)
		{
			System.out.println("Error In ClassDAO Insert");
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
			Query q = session.createQuery("from CLASS_VO");
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

	public List edit(CLASS_VO dv) {
		// TODO Auto-generated method stub
		List ls=null;
		try {
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			
			Query w=session.createQuery("from CLASS_VO where data_Id='"+dv.getData_Id()+"'");
			
			ls=w.list();
			
			
			
			
			} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			}
	
		
		return ls;
	}

	public void update(CLASS_VO dv) {
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

	public void delete(CLASS_VO dv) {
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





