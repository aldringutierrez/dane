package damas;

public class Employee {
	int			id;
	String	firstName;
	String	lastName;
	double	salary;
	
	public Employee(int i, String nombre, double salario) {
		this.id=i;
		this.firstName=nombre;
		this.lastName=nombre;
		this.salary=salario;
	}
	

	public Employee() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	@Override
	public int hashCode() { 
		int prime = 31;
		int result = 1;
//		result = result*prime+id;
//		result = result*prime+id+((firstName==null)? 0 : firstName.hashCode()  );
//		result = result*prime+id+((lastName==null)? 0 : lastName.hashCode()  );
//		result = (int) (result*prime+salary);
		System.out.println("hash : "+result);

		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj; 
		if (obj==null) {
			return false;
		}
		if (this==obj) {
			return true;
		}
		if (id!=other.id) {
			return false;
		}
		if (firstName!=other.firstName) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() { 
		return this.id+" "+this.firstName+" "+this.lastName;
	}
	
	public void salaryIncrement( double percent) {
		this.salary=this.salary*(1+percent/100);
	}
	
	
	
	
	
}
