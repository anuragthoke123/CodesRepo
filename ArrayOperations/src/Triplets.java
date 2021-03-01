import java.util.Arrays;

public class Triplets {

	static String countTriplet(int arr[], int n) {
		int tempArray[] = arr;
//		int temp = 0;
//		for (int k = 0; k < n; k++) {
//
//			for (int i = 0; i < n; i++) {
//				if (i < n - 1 && tempArray[i] > tempArray[i + 1]) {
//					temp = tempArray[i];
//					tempArray[i] = tempArray[i + 1];
//					tempArray[i + 1] = temp;
//					temp = 0;
//				}
//			}
//		}
		Arrays.sort(tempArray);
//		System.out.println(Arrays.toString(tempArray));
//		int counter = 0;
//		int temp2 = 0;
//		for(int k = 0; k < n; k++)
//		{
//		for (int i = 0; i < n/2; i++) {
//
//			temp2 = arr[i] + arr[i + 1];
//			
//			if ( arr[i + 2] == temp2) {
//				counter++;
//				temp2 = 0;
//			}
//			temp2 = 0;
//		}
//		}
//		System.out.println(counter + "counter value");
		
		int max_val = 0; 
        for (int i = 0; i < n; i++) 
            max_val = Math.max(max_val, arr[i]); 
        int[] freq = new int[max_val + 1]; 
        for (int i = 0; i < n; i++) 
            freq[arr[i]]++; 
  
        int ans = 0; // stores the number of ways 
  
        // Case 1: 0, 0, 0 
        ans += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6; 
  
        // Case 2: 0, x, x 
        for (int i = 1; i <= max_val; i++) 
            ans += freq[0] * freq[i] * (freq[i] - 1) / 2; 
  
        // Case 3: x, x, 2*x 
        for (int i = 1; 2 * i <= max_val; i++) 
            ans += freq[i] * (freq[i] - 1) / 2 * freq[2 * i]; 
  
        // Case 4: x, y, x + y 
        // iterate through all pairs (x, y) 
        for (int i = 1; i <= max_val; i++) { 
            for (int j = i + 1; i + j <= max_val; j++) 
                ans += freq[i] * freq[j] * freq[i + j]; 
        } 
  
        System.out.println(ans + " counter value");
		return Arrays.toString(tempArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12 ,8 ,2 ,11 ,5 ,14 ,10 };
		System.out.println("final" + countTriplet(arr, 7));
	}

}
