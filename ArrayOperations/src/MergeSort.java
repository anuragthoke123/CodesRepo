import java.util.Arrays;

public class MergeSort {

	public static void merge(int arr1[], int arr2[], int n, int m) 
    {
		int[] result = new int[n + m];  //resultant array of size first array and second array  
		System.arraycopy(arr1, 0, result, 0, n);  
		System.arraycopy(arr2, 0, result, n, m);
		for(int i = 0; i <n; i++)
		{
			arr1[i]=result[i];
		}
		for(int i = n; i <m; i++)
		{
			arr2[i]=result[i];
		}
    }
	
	public static void main(String[] args)   
	{  
	int[] firstArray = {23,45,12,78,4,90,1};        //source array  
	int[] secondArray = {77,11,45,88,32,56,3};  //destination array  
	int fal = firstArray.length;        //determines length of firstArray  
	int sal = secondArray.length;   //determines length of secondArray  
	int[] result = new int[fal + sal];  //resultant array of size first array and second array  
	System.arraycopy(firstArray, 0, result, 0, fal);  
	System.arraycopy(secondArray, 0, result, fal, sal);  
	Arrays.sort(result);
	for(int i = 0; i <fal; i++)
	{
		firstArray[i]=result[i];
	}
	for(int i = 0; i <sal; i++)
	{
		secondArray[i]=result[i+fal];
	}
	System.out.println(Arrays.toString(result));
	System.out.println(Arrays.toString(firstArray));
	System.out.println(Arrays.toString(secondArray));//prints the resultant array  
	}  
}
