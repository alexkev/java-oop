
public class A11dot2 {

	public static void main(String[] args) {
		Person p = new Person("Bob", "123 North", "555-1234", "bob@bob.com");
		System.out.println(p);
		
		Student s = new Student("Sue", "234 South", "666-1234", "suse@sue.com", 3);
		System.out.println(s);
		
		Employee e = new Employee("Joe", "345 East", "555-3456", "joe@joe.com", "STC 100", 120000, new MyDate(2000, 6, 1));
		System.out.println(e);
		
		Faculty f = new Faculty("Anne", "456 West", "55-4567", "anne@anne.com", "Smith 220", 200000, new MyDate(2010, 1, 1), "10:00 - 11:00", 4);
		System.out.println(f);
		
		Staff st = new Staff("Ben", "567 Main", "555-678", "ben@ben.com", "Kim 200", 15000000, new MyDate(2012, 9, 1), "President");
		System.out.println(st);
	}
}

class Person {
	String name; 
	String address;
	String phoneNumber;
	String email;
	
	Person(){
	}
	
	Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Person - " + name;
	}
}

class Student extends Person {
	int status;
	
	Student() {
	}
	
	Student(String name, String address, String phoneNumber, String email, int status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String toString() {
		return "Student - " + name + ", " + status;
	}
	
}

class Employee extends Person {
	String Office;
	int Salary;
	MyDate dateHired;
	
	Employee() {
	}
	
	Employee(String name, String address, String phoneNumber, String email, String office, int Salary, MyDate dateHired) {
		super(name, address, phoneNumber, email);
		this.Office = office;
		this.Salary = Salary;
		this.dateHired = dateHired;
	}
	
	public String toString() {
		return "Employee - " + name + ", " + dateHired;
	}
	
}

class MyDate {
	int year;
	int month;
	int day;
	
	MyDate(){
	}
	
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day; 
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
}

class Faculty  extends Employee {
	String officeHours;
	int rank;
	
	Faculty(){
	}
	
	Faculty(String name, String address, String phoneNumber, String email, String office, int Salary, MyDate dateHired, String officeHours, int rank) {
		super(name, address, phoneNumber, email, office, Salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString() {
		return "Faculty - " + name + ", " + officeHours;
	}
}

class Staff  extends Employee {
	String title;
	
	Staff(){
	}
	
	Staff(String name, String address, String phoneNumber, String email, String office, int Salary, MyDate dateHired, String title) {
		super(name, address, phoneNumber, email, office, Salary, dateHired);
		this.title = title;
	}
	
	public String toString() {
		return "Staff - " + name + ", " + title;
	}
}
