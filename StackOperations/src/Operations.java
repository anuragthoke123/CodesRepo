import java.util.Stack;

class Operations {
	static Stack<Integer> rstack = new Stack<Integer>();
	static Stack<Character> st = new Stack<>();
	
	public static void push_stack(Stack<Integer> stack)
	{
		for(int i = 0; i <5 ; i++)
		{
			stack.push(i);
		}
	}
	public static void pop_stack(Stack<Integer> stack)
	{
		for(int i = 0; i < 5; i++)
		{
			Integer x = (Integer) stack.pop();
			System.out.println(x);
		}
	}
	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);
	}
	static Stack<Integer> reverse(Stack<Integer> stack)
	{
		for(int i=0; i<5; i++)
		{
			rstack.push( stack.pop());
		}
		return rstack;
	}
	static void recpush(char x)
	{
		if (st.isEmpty())
			st.push(x);

		else {
			char a = st.peek();
			st.pop();
			recpush(x);
			st.push(a);
		}
	}
	static void recreverse()
	{
		if(st.size()>0)
		{
			char x = st.peek();
			st.pop();
			recreverse();
			recpush(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		push_stack(stack);
		pop_stack(stack);
		push_stack(stack);
		stack_search(stack, 2);
//		reverse the stack
		System.out.println(reverse(stack)); 
		
//	reverse stack using recursion.
		recpush('1');
		recpush('2');
		recpush('3');
		recpush('4');
		System.out.println("original stack"+st);
		recreverse();
		System.out.println("recursion reverse stack"+st);
		
		System.out.println("Changes in git");
	}

}
