import com.Java.A1.FTEmployee;

import FirstPackage.Employee;

public class DemoEmpFT {

	public static void main(String[] args) {
		Employee el =new Employee();
		FTEmployee Ga =new FTEmployee();
		el.setEid(123);
		Ga.setEid(234);
		Ga.setSalary(5000.54);
		System.out.println("Employee ID el :" +el.getEid());
		System.out.println("Employee ID Ga :" +Ga.getEid());
		System.out.println("Employee Salary el :" +Ga.getSalary());
		
		

	}

}
