import java.util.ArrayList;

class ArrayOp {
	

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			alist.clear();
			int temp = 0;
			for (int k = i; k <= n; k++) {
				if (temp == s) {
					alist.add(i+1);
					alist.add(k);
					return alist;
				}else if(temp > s)
					break;
				else {
					temp += arr[k];
				}
			}
		}
		return alist;
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 7, 5 };
//		System.out.println(subarraySum(arr, 5, 12));
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(subarraySum(arr, 10, 15));
		int arr[] = {135 ,101 ,170 ,125 ,79 ,159 ,163 ,65 ,106 ,146 ,82 ,28 ,162 ,92 ,196 ,143 ,28 ,37 ,192 ,5 ,103 ,154 ,93 ,183 ,22 ,117 ,119 ,96 ,48 ,127 ,172 ,139 ,70 ,113 ,68 ,100 ,36 ,95 ,104 ,12 ,123 ,134};
		System.out.println(subarraySum(arr, 42, 468));
		
	}
}
