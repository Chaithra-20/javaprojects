package jdbc.com;
import java.util.*;
public class empcomsume {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		Scanner ck=new Scanner(System.in);
		empdao dao=new empdao();
		employee e1=new employee();
		
		System.out.println("------Welcome to Employee Management System------");
		
		System.out.println("Select Operation : \n 1. for add the Employee \n 2. for to print Employee Details \n 3. for to print Employee name \n 4. for to print Employee Domain ");
		int op=ck.nextInt();
		switch(op) {
		
		case 1-> {
			System.out.print(" Enter Employee name ");
			String ename=ck.next();
			System.out.print(" Enter Employee ID ");
			int eid=ck.nextInt();
			System.out.print(" Enter Employee domain ");
			String edomain=ck.next();
			System.out.print(" Enter Employee salary ");
			int esalary=ck.nextInt();
			e1.eid=eid;
			e1.ename=ename;
			e1.edomain=edomain;
			e1.esalary=esalary;
			dao.connect();
			int res=dao.addEmployee(e1);
			if(res!=0) {
				System.out.println(" Employee added to the database ");
			}
			else {
				System.out.println(" Something went wrong....Please tryagain after sometime ");
				
			}
		}
		case 2-> {
			System.out.println(" Enter Employee id :");
			int eid=ck.nextInt();
			dao.connect();
			employee e2=dao.getEmployee(eid);
			if(e2.eid==0) {
				System.out.println(" Employee not found ");
			
			}
			else {
				System.out.println(e2.eid+" is "+e2.ename+" Working in "+e2.edomain+" With "+e2.esalary+ " Salary ");
				
			}
		}
		case 3->{
			System.out.println(" Enter Employee Id ");
			int eid=ck.nextInt();
			dao.connect();
			String username=dao.getEmpName(eid);
			System.out.println(username);
		}	
		case 4->{
			System.out.println(" Enter Employee Name ");
			String ename=ck.next();
			dao.connect();
			String empdomain=dao.getEmpDomain(ename);
			System.out.println(empdomain);
		}
		}	
		ck.close();
	}
	
}
