
public class ArrayRotation {

	static public int[] solution(int[] A, int K) {
		int temp=0;
		int temp2=0;
		for(int i=0; i< K; i++)
		{
			
			for(int j =0; j < A.length; j++)
			{
				if(j < A.length-1 && j !=0)
				{
				
				temp2 = A[j+1];//storing the value in next
				A[j+1]=temp;//replacing the next value with previous, initially zero
				temp = 0;//empty the temp
				temp = temp2;//store the replace value
				temp2=0;
				}
				if(j==A.length-1)
				{
					A[0]=temp;
				}
				if(j==0 && A.length>1)
				{
					temp = A[j];
					temp2 = A[j+1];//storing the value in next
					A[j+1]=temp;//replacing the next value with previous, initially zero
					temp = 0;//empty the temp
					temp = temp2;//store the replace value
					temp2=0;
				}
			}
		}
		
		for(int i=0; i< A.length;i++)
		{
			System.out.println(A[i]);
		}
		return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {0};
		solution(A, 2);
	}

}
