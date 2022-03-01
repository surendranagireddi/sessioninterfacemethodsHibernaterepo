package com.suren.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suren.pojo.Account1;
import com.suren.utility.HibernateUtility;

public class AccountDaoImpl implements Account1Dao {

	@Override
	public int createAccount(Account1 acc) {

		int id =0;
		Session session = HibernateUtility.getSession();
		
		if(session != null) {
			Transaction tx = session.beginTransaction();
			id = (int) session.save(acc);
			tx.commit();
			session.close();
		}
		return id;
	}

	@Override
	public void updateAccountHolderName(int accNum, String newName) {

		Session session = HibernateUtility.getSession();
		if(session != null) {
			Account1 acc = (Account1)session.get(Account1.class, accNum);
			
			if(acc != null) {
				acc.setName(newName);
				
				session.update(acc);
				
				session.beginTransaction().commit();
				System.out.println(accNum+"Records fetched successfully");
				session.close();
			}else {
				System.out.println("account not found");
			}
			
		}
	}

	@Override
	public void deleteAccount(int accNum) {

		Session session = HibernateUtility.getSession();
		
		if(session != null) {
			
			Account1 acc = session.get(Account1.class, accNum);
		    if(acc != null) {
		    	//delete the record
		    	session.delete(acc);
		    	
		    	session.beginTransaction().commit();
		    	System.out.println(accNum + "Records deletes successful !");
		    	
		    	session.close();
		    }else {
		    	System.out.println("records not found !");
		    }
		}
	}

	@Override
	public Account1 searchAccount(int accNum) {
      
	Account1 acc = null;
	
	Session session = HibernateUtility.getSession();
	
	if(session != null) {
		acc = (Account1)session.get(Account1.class, accNum );
		
	}
	return acc;
		
	
	}

}
