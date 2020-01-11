//package NewProfit;
import java.util.ArrayList;
import java.util.Scanner;

public class profitDemo {

	public static void main(String[] args) {
		int index=-1; 
		boolean ep=false; 
		double com;
		
		ArrayList<employees> em =new ArrayList<employees>();
		ArrayList<salary> s =new ArrayList<salary>();
	
		
		Scanner input =new Scanner (System.in);
		char ch;
		do {
			
			System.out.print("Enter EmployeesID : ");
			String id=input.next();
			System.out.print("Enter Employees Name : ");
			String name=input.next();
			System.out.print("Enter Salary : ");
			double money =input.nextInt();
			em.add(new employees(name,id));
			s.add(new salary(money));
			System.out.println("Do you want enter again [y/n]");
			ch = input.next().charAt(0);
			}while(ch=='y');
				for(int i=0;i<em.size();i++) {
					em.get(i).setSalary(s.get(i));
		}
		
			System.out.println("==================================================");
	
		do {
			
			System.out.print("Enter EmployeeID : ");
			String num =input.next();
			System.out.print("Enter Sale amount : ");
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
				if(sale>100001)
					com=0.03*sale;
				else if(sale>50001)
					com=0.02*sale;
				else
					com=0.01*sale;
				s.get(index).setCommission(com);
					
			}else {
				System.out.println("!! Not have Employees number !!");
			}
			System.out.print("Do you want enter again [y/n]");
			ch = input.next().charAt(0);
		}	while(ch=='y');
			for (int i = 0; i <em.size() ; i++) {
				System.out.println(em.get(i).toString());


		}
	}
}
