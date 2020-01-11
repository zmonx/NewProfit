package newprofit;
public class employees {

	
	public String name;
	public String id;
	private Salary sl;
	
	public void setSalary(Salary s) {
		this.sl=s;
	}
	public Salary getSalary() {
		return sl;
	}
	
	public Employees(String name, String id) {
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Name %s Salary+commission+bonus %.2f",this.name,sl.salary+sl.commission);
	}
}
