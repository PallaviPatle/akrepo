package com.cjc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Test {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds = new MetadataSources(registry);
		Metadata md = mds.getMetadataBuilder().build();
		
		SessionFactory sf = md.getSessionFactoryBuilder().build();
		
		Session s = sf.openSession();
		
		Student stu = new Student();
		
		        stu.setRollno(1);
		        stu.setName("Vaish");
		        stu.setAddr("Pune");
		        
		        Student stu1 = new Student();
				
		        stu1.setRollno(2);
		        stu1.setName("Shradhhu");
		        stu1.setAddr("Nagpur");
		        
		    s.save(stu);
		    s.save(stu1);
		    s.beginTransaction().commit();
		
	}

}
