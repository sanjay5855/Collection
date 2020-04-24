import java.util.Comparator;

public class MyComarator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		EmployeeDemo e1=(EmployeeDemo) obj1;
		EmployeeDemo e2=(EmployeeDemo) obj2;
        String i1=e1.name;
        String i2=e2.name;
	    return i1.compareTo(i2);
	}

}
