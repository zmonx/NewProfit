package newprofit;
import java.util.ArrayList;
import java.util.Scanner;

public class profitDemo {

	public static void main(String[] args) {
		int index=-1; boolean ep=false; double com;
		ArrayList<Employees> em =new ArrayList<Employees>();
		ArrayList<Salary> s =new ArrayList<Salary>();
	
		
		Scanner input =new Scanner (System.in);
		char ch;
		do {
			System.out.println("Enter employeesID :");
			String id=input.next();
			System.out.println("Enter employees name :");
			String name=input.next();
			System.out.println("Enter salary");
			double money =input.nextInt();
			em.add(new Employees(name,id));
			s.add(new Salary(money));
			System.out.println("Do you want enter again [y/n]");
			ch = input.next().charAt(0);
			}while(ch=='y');
		for(int i=0;i<em.size();i++) {
			em.get(i).setSalary(s.get(i));
		}
		System.out.println("==================================================");
		do {
			System.out.println("Enter EmployeeID :");
			String num =input.next();
			System.out.println("Enter saleamount");
			double sale=input.nextDouble();
			for(int i=0;i<em.size();i++) {
				if(em.get(i).getId().equals(num)) {
					index=i;
					ep=true;
					break;
				}else
					ep=false;
			}
			if(ep) {
				if(sale>50000)
					com=0.03*sale;
				else if(sale>25000)
					com=0.02*sale;
				else
					com=0.01*sale;
				s.get(index).setCommission(com);
					
			}else {
				System.out.println("not have Employees number");
			}
			System.out.println("Do you want enter again [y/n]");
			ch = input.next().charAt(0);
		}while(ch=='y');
		
		for (int i = 0; i <em.size() ; i++) {
			System.out.println(em.get(i).toString());


		}
		
		
		

	}

}
