import java.util.HashSet;
import java.util.Set;

public class LengthNonRepeatingSubstring {

	static String lengthOfLongestSubstring(String input) {

//		char[] arr = s.toCharArray();
//		int count=0;
//		int Maxcount=0;
//		for(int i=0;i<arr.length;i++)
//		{
//		
//			for(int j=i+1;j<arr.length-1;j++)
//			{
//		
//				if(arr[i]==arr[j])
//				{
//					System.out.println(count +" :count");
//					if(count>Maxcount)
//					{
//					Maxcount=count;
//					}
//					count =0;
//					break;
//				}
//				if(arr[i]!=arr[j])
//				{
//					count++;
//				}
//			}
//		}
//		
//		return Maxcount;
		
		String output = "";
	    for (int start = 0; start < input.length(); start++) {
	        Set<Character> visited = new HashSet<>();
	        int end = start;
	        for (; end < input.length(); end++) {
	            char currChar = input.charAt(end);
	            if (visited.contains(currChar)) {
	                break;
	            } else {
	                visited.add(currChar);
	            }
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end);
	        }
	    }
	    return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
