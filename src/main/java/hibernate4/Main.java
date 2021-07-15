package hibernate4;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		
		Product p1=new Product("dell laptop","good",1200);
		Product p2=new Product("lenovo laptop","average",1000);
		Product p3=new Product("apple laptop","best",2000);
		
		Product p4=new Product("mototola mb","good",100);		
		Product p5=new Product("samsung mb","better",160);
		
		List<Product>list1=new ArrayList<>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		
		List<Product>list2=new ArrayList<>();
		list2.add(p4);
		list2.add(p5);
		
		Category c1 = new Category("Laptop",list1);
		Category c2 = new Category ("Mobile", list2);
		
		session.save(c1);
		session.save(c2);
		
		
		session.getTransaction().commit();
		session.close();
		

	}

}
