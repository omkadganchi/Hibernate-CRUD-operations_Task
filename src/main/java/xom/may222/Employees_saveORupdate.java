package xom.may222;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Employees_saveORupdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employees.class);
		SessionFactory session = cfg.buildSessionFactory();
		Session ss = session.openSession();
		Transaction transaction = ss.beginTransaction();
		Employees emp = new Employees(107, "Aahna Sharma", "Data Analyst Intern", "36000");
		ss.saveOrUpdate(emp);
		transaction.commit();
	}

}
