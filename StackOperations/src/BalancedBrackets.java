import java.util.Stack;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;

public class BalancedBrackets {
	 static public boolean isValid(String s) {
		  Stack<Character> brackets = new Stack<>();

		char [] arr = s.toCharArray();
		int i =0;
		int counter1 =0;
		int counter2 =0;
		while(i <arr.length)
		{
			if((arr[0]=='}'|| arr[0]==']' || arr[0]==')') || arr.length%2==1)
			{
				return false;
			}
			
			if(arr[i]=='{')
			{
				brackets.push(arr[i]);
				counter1++;
			}
			if(arr[i]=='(')
			{
				brackets.push(arr[i]);
				counter1++;
			}
			if(arr[i]=='[')
			{
				brackets.push(arr[i]);
				counter1++;
			}
		
			if(brackets.isEmpty() == false && arr[i]==']' && brackets.peek()== '[')
			{
				brackets.pop();
				counter2++;
			}
			if(brackets.isEmpty() == false && arr[i]==')' && brackets.peek()== '(')
			{
				brackets.pop();
				counter2++;
			}
			if(brackets.isEmpty() == false && arr[i]=='}' && brackets.peek()== '{')
			{
				brackets.pop();
				counter2++;
			}
			
			i++;
		}
		
		return brackets.isEmpty() && counter1==arr.length/2;
	        
	    }
	  public static void main(String args[])
	  {
		  String s ="([}}])";
		  
		  System.out.println(isValid(s));
	  }
}
