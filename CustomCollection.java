
public class CustomCollection {
	private Object[] abc=new Object[5];
	private int count=0;
	public void add(Object obj) {
		if(count==abc.length) {
			increaseCapacity();
			
		}
		
		abc[count]=obj;
		count++;
		
	}
		
	public void increaseCapacity() {
		int newCapacity=(abc.length *2)+2;
		
		Object[] abc1=new Object[newCapacity];
		for(int i=0;i<abc.length;i++) {
			abc1[i]=abc[i];
			
		}
		abc=abc1;
		
	}
	public void getElement() {
		for(int i=0;i<abc.length;i++) {
			
			System.out.println(abc[i]);
		}
	}
	
public static void main(String[] args)
{
	CustomCollection cc=new CustomCollection();
	
	cc.add("a");
	cc.add("b");
	cc.add("c");
	cc.add("d");
	cc.add("e");
	cc.add("f");
	cc.add("g");
	cc.add("h");
	cc.getElement();
}
}
