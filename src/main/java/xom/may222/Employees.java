package xom.may222;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {
@Id
int	eID;
String name;
String role;
String salary;


public Employees() {
	super();
}
public Employees(int eID, String name, String role, String salary) {
	super();
	this.eID = eID;
	this.name = name;
	this.role = role;
	this.salary = salary;
}
public int geteID() {
	return eID;
}
public void seteID(int eID) {
	this.eID = eID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employees [eID=" + eID + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
}



}
