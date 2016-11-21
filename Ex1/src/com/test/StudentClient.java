package com.test;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.StudentBean;
import com.util.SessionUtil;

// insertion of a record into student table


	public class StudentClient	{ 
		
		public static void main(String[] args) {
			
			Session session = SessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			
			Scanner scanner = new Scanner(System.in);
			
			try {
				
				StudentBean studentBean = new StudentBean();
				
				System.out.println("Enter Student Number:");
				studentBean.setSid(scanner.nextInt());
				
				System.out.println("Enter Student Name:");
				studentBean.setSname(scanner.next());
				
				System.out.println("Enter Student Age:");
				studentBean.setSage(scanner.nextInt());
				
				System.out.println("Enter Student Address:");
				studentBean.setSaddr(scanner.next());
				
					session.save(studentBean);
					
					System.out.println("Record Created..");
					
					transaction.commit();
					SessionUtil.closeConnection(session);
					
			} catch (HibernateException e) {
				System.err.println("HibernateException .."+"----"+e.getMessage());
				e.printStackTrace();
				transaction.rollback();
			}
		}
		
	}
