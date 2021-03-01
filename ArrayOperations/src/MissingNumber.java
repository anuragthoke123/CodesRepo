import java.util.Arrays;

public class MissingNumber {

	static int MissingNumber(int array[], int n) {
		// Your Code Here
		Arrays.sort(array);
		int k = 0;
		for (int i = 0; i < n-1; i++) {
			if (i+1 != array[i]) {

				k = i+1;
				return k;
			}
			if(k==0 && i== n-2)
			{
				k= i +2;
				return k;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4};
		System.out.println(MissingNumber(A,5));
	}

}
