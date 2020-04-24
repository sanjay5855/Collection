import java.util.Comparator;

public class EmployeeDemo implements Comparable{
	String name;
	int eid;

	 EmployeeDemo(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	

	public EmployeeDemo() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "EmployeeDemo [name=" + name + ", eid=" + eid + "]"+"\n";
	}



	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		int i1=this.eid;
		int i2=((EmployeeDemo)arg0).eid;
		if(i1>i2)
			return 1;
		else if(i1<i2)
			return -1;
		return 0;
	}

	/*
	 * @Override public int compare(Object arg0, Object arg1) { // TODO
	 * Auto-generated method stub return 0; }
	 */
	
}
