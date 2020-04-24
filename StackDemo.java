package coreConcept;

import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class StackDemo {
	public Stack<Integer> stackPush(Stack<Integer> stack) {
		System.out.println("PuPs operation------");
		// Stack s1=new Stack();
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			// Integer p =Stack.push(i);
			// System.out.println(p);
		}
		return stack;

	}

	public void stackPop(Stack<Integer> stack) throws Exception  {
		System.out.println("pop operaton------");
		try {
			if(stack!=null) {
		for (int i = 0; i < 10; i++) {
			Integer p = stack.pop();
			System.out.println(p);
		}
			}
		}catch(Exception e) {
			System.out.println("stack is empty");
		}
	}
  
	public Integer stackPeek(Stack<Integer> stack) throws Exception{
		System.out.println("peek operation------");
		// Stack s1=new Stack();
		//for (int i = 0; i < 10; i++) {
			//int p=	stack.peek();
			// Integer p =Stack.push(i);
			// System.out.println(p);
		//}
	    try {
	    	if(stack!=null) {

	    	}
	    }catch(Exception e) {
	    	System.out.println("stack is empty");
	    }
		return stack.peek();


	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackDemo d1 = new StackDemo();
		// ArrayList<Integer> list=new ArrayList<>();
		//CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		//list.add(40);
		Stack<Integer> stack = new Stack();
		//--------------------puch operation
		stack = d1.stackPush(stack);
		System.out.println("push in main");
		stack.push(20);
		System.out.println(stack.size());
		System.out.println("--------------");

		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			// stack.push(30);
			//stack.add(50);
			System.out.println(i);
		}
		System.out.println(stack.size());
//----------------------------pop operaton
	 d1.stackPop(stack);
   System.out.println(stack.size());
	 //d1.stackPop(stack);
   //-------------------------------------------peek operaton
   Integer a=d1.stackPeek(stack);
   System.out.println("-----------------------");
   System.out.println(a);

   //-------------------------------------------------search operation
   
	}

}
