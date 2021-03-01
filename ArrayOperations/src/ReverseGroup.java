import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

import org.omg.IOP.CodeSets;

public class ReverseGroup {

	static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
//	        // code here
//		 Set<Integer> set = new HashSet<Integer>(arr);
//		 
//		 System.out.println(set);

		for (int i = 0; i < k - 1; i++) // 2
		{
			for (int j = i + 1; j < k; j++) // 1
			{
			
				int temp, temp2 = 0;

				if (arr.get(i) < arr.get(j)) {
					temp = arr.get(i);
					temp2 = arr.get(j);

					arr.remove(i);
					arr.add(i, temp2);
					arr.remove(j);
					arr.add(j, temp);
				}
			}
		}
		for (int i = k; i <= n ; i++) // 2
		{
			for (int j = i + 1; j <= n; j++) // 1
			{
		
				int temp, temp2 = 0;

				if (arr.get(i) < arr.get(j)) {

					temp = arr.get(i);
					temp2 = arr.get(j);

					arr.remove(i);
					arr.add(i, temp2);
					arr.remove(j);
					arr.add(j, temp);
				}
			}
		}
		System.out.println(arr.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);

		reverseInGroups(arr, 5, 3);
	}

}
