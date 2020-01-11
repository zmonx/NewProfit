//package NewProfit;
public class employees {

	
	public String name;
	public String id;
	private salary sl;
	
	public void setSalary(salary s) {
		this.sl=s;
	}
	public salary getSalary() {
		return sl;
	}
	
	public employees(String name, String id) {
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
