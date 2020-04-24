import java.util.TreeSet;

public class CompanyEmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubE
		
		EmployeeDemo e1=new EmployeeDemo("sanjay",109);
		EmployeeDemo e2=new EmployeeDemo("sanjeet",101);
		EmployeeDemo e3=new EmployeeDemo("ganga",105);
		EmployeeDemo e4=new EmployeeDemo("balu",103);
		EmployeeDemo e5=new EmployeeDemo("Ashsh",104);
		
		TreeSet<EmployeeDemo> t=new TreeSet<EmployeeDemo>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
	
		TreeSet t1=new TreeSet(new MyComarator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
		
		
	}
	

}
