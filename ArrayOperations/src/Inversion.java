//import java.util.Arrays;
//
//public class Inversion {
//	static long inversionCount(long arr[], long N)
//    {
//        // Your Code Here
//		long temp[] = new long[N]; 
//        return _mergeSort(arr, temp, 0, (int) (N - 1)); ;
//    }
//
//  
//    /* An auxiliary recursive method that sorts the input array and 
//      returns the number of inversions in the array. */
//    static long _mergeSort(long[] arr, long[] temp, int m, int l) 
//    { 
//        int mid;
//        long inv_count = 0; 
//        if (l > m) { 
//            /* Divide the array into two parts and call _mergeSortAndCountInv() 
//           for each of the parts */
//            mid = (l + m) / 2; 
//  
//            /* Inversion count will be sum of inversions in left-part, right-part 
//          and number of inversions in merging */
//            inv_count = _mergeSort(arr, temp, m, mid); 
//            inv_count += _mergeSort(arr, temp, mid + 1, l); 
//  
//            /*Merge the two parts*/
//            inv_count += merge(arr, temp, m, mid + 1, l); 
//        } 
//        return inv_count; 
//    } 
//  
//    /* This method merges two sorted arrays and returns inversion count in 
//       the arrays.*/
//    static long merge(long[] arr, long[] temp, int m, int l, long l2) 
//    { 
//    	int i;
//    	int j;
//    	int k; 
//        long inv_count = 0; 
//  
//        i = m; /* i is index for left subarray*/
//        j = l; /* j is index for right subarray*/
//        k = m; /* k is index for resultant merged subarray*/
//        while ((i <= l - 1) && (j <= l2)) { 
//            if (arr[i] <= arr[j]) { 
//                temp[k++] = arr[i++]; 
//            } 
//            else { 
//                temp[k++] = arr[j++]; 
//  
//                /*this is tricky -- see above explanation/diagram for merge()*/
//                inv_count = inv_count + (l - i); 
//            } 
//        } 
//  
//        /* Copy the remaining elements of left subarray 
//       (if there are any) to temp*/
//        while (i <= l - 1) 
//            temp[k++] = arr[i++]; 
//  
//        /* Copy the remaining elements of right subarray 
//       (if there are any) to temp*/
//        while (j <= l2) 
//            temp[k++] = arr[j++]; 
//  
//        /*Copy back the merged elements to original array*/
//        for (i = m; i <= l2; i++) 
//            arr[i] = temp[i]; 
//  
//        return inv_count; 
//    } 
//    public static void main(String[] args) {
//    	long arr[] = {468,335,1,170,225,479,359,463,465,206,146,282,328,462,492,496,443,328,437,392,105,403,154,293,383,422,217,219,396,448,227,272,39,370,413,168,300,36,395,204,312,323};
//    	System.out.println(inversionCount(arr, 42));
//	}
//}
