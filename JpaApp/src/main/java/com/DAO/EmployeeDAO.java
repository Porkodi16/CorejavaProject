package com.DAO;


import java.util.List;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.entity.Employee;


public class EmployeeDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePU");
	EntityManager em = emf.createEntityManager();
	Scanner scanner = new Scanner(System.in);

	
   public void insert() {

	     System.out.println("Enter employee Id");
	     int id = scanner.nextInt();
	     System.out.println("Enter first Name");
         String fName = scanner.next();
	     System.out.println("Enter last Name");
         String lName = scanner.next();
	     System.out.println("Enter salary");
         double salary = scanner.nextDouble();
         
         em.getTransaction().begin();
         em.persist(new Employee(id,fName,lName,salary));
	     em.getTransaction().commit();
   }
   
   public void update() {
	   System.out.println("Enter employee Id");
	     int id = scanner.nextInt();
	     System.out.println("Enter first Name");
       String fName = scanner.next();
	     System.out.println("Enter last Name");
       String lName = scanner.next();
	     System.out.println("Enter salary");
       double salary = scanner.nextDouble();
       
       Employee emp = null;
       emp = em.find(Employee.class, id);
       
       if(emp == null) {
    	   System.out.println("No record with this given Employee Id");
       }
       else {
    	     em.merge(new Employee(id, fName, lName, salary));
       }
       
   }
   
   
   public void delete() {
	   System.out.println("Enter employee Id");
	     int id = scanner.nextInt();
	     Employee emp = null;
	      emp = em.find(Employee.class, id);
	      if(emp == null) {
	    	   System.out.println("No record with this given Employee Id");
	       }
	       else {
	    	   
	           em.getTransaction().begin();
	    	     em.remove(emp);
	  	     em.getTransaction().commit();

	    	    
	       }  
	     
	   
   }
   
   public void findById() {
	   System.out.println("Enter employee Id");
	     int id = scanner.nextInt();
	     
	     Employee emp = null;
	      emp = em.find(Employee.class, id);
	      if(emp == null) {
	    	   System.out.println("No record with this given Employee Id");
	       }
	       else {
	    	     System.out.println(emp);
	       }  
	    
	 
   }
   
   public void findAllEmployees() {
	   
		  
	   Query query=em.createQuery("select e from Employee e ");
	   
	   List  <Employee> emps=query.getResultList();
	   
	   for(Employee e:emps)
	   {
		   System.out.println(e);
	   }
	   
	  	     
   }
   
   public void findBySalary()
   {
		  
	   Query query=em.createQuery("select e from Employee e where e.salary >20000");
	   
	   List  <Employee> emps=query.getResultList();
	   
	   for(Employee e:emps)
	   {
		   System.out.println(e);
	   }

   }
   public void getEmployeeName() {
	   Query query=em.createQuery("select e.id,e.firstName,e.lastName from Employee e");
	   List<Object[]> objects = query.getResultList();
	   
	   for(Object[] obj : objects) {
		   System.out.println(obj[0] + " " + obj[1] + " "+obj[2]);
	   }
   }
   public void sortByName() {
	   
		  
	   Query query=em.createQuery("select obj from Employee obj order by obj.firstName desc ");
	   
	   List  <Employee> emps=query.getResultList();
	   
	   for(Object e:emps)
	   {
		   System.out.println(e);
	   }
   }
	   
	   public void maxSalary() {
		   
			  //select max(salary) from employee
		   Query query=em.createQuery("select  max(e.salary) from Employee e ");
		   
Object obj=query.getSingleResult();		   
			   System.out.println(obj);
			   
			   
		   }
	   public void minSalary() {
		   
			  //select max(salary) from employee
		   Query query=em.createQuery("select  min(e.salary) from Employee e ");
		   
Object obj=query.getSingleResult();		   
			   System.out.println(obj);
			   
			   
		   }

		   
		  	     
	      }
 

	  	     
   

   
