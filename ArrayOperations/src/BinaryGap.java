import java.util.ArrayList;

public class BinaryGap {

	static public int solution(int N) {
	        
//			String str =  (Integer.toBinaryString(N));
//			ArrayList<String> ar = new ArrayList<String>();
//			ar.add(str);
//			int counter=0;
//			int maxCounter=0;
//			for(int i = 0; i < ar.size(); i++)
//			{
//				for(int j=i+1; j< ar.size(); j++)
//				{
//					if(ar.get(i)==ar.get(j))
//					{
//						System.out.println("inside");
//						counter++;
//					}
//					if (ar.get(i)!=ar.get(j) && maxCounter < counter)
//					{
//						maxCounter = counter;
//						
//						break;
//					}
//					
//				}
//			}
//			System.out.println(ar.toString());
//			return maxCounter;
			
		int binaryGap = 0;
	    String binaryString = Integer.toBinaryString(N);
	    char[] characters = binaryString.toCharArray();
	    int j = 0;
	    Character c;
	    for (int i = 0; i < characters.length; i++) {
	         c = characters[i];
	        if (c.equals('0')) {
	            j += 1;
	        }

	        if (c.equals('1')) {
	            if (j > binaryGap ){
	                binaryGap = j;
	            }
	            j = 0;
	        }

	    }
	   
	    return binaryGap;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1041));
	}

}
