package com.prosick.HibernetDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien tulesko = new Alien();
        tulesko.setAid(101);
        tulesko.setAname("Prosick");
        tulesko.setAcolor("Green");
        	
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        //Now we can save the object direct to the database
        Transaction tx = session.beginTransaction();
        
        session.save(session);
        tx.commit();
    }
}
