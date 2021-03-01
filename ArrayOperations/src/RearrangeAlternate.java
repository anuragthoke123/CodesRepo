
class RearrangeAlternate {

	// temp: input array
	// n: size of array
	// Function to rearrange the array elements alternately.
	public static void rearrange(int arr[], int n) {
		int temp[] = arr.clone();

		// Indexes of smallest and largest elements
		// from remaining array.
		int small = 0, large = n - 1;

		// To indicate whether we need to copy rmaining
		// largest or remaining smallest at next position
		boolean flag = true;

		// Store result in temp[]
		for (int i = 0; i < n; i++) {
			if (flag)
				arr[i] = temp[large--];
			else
				arr[i] = temp[small++];

			flag = !flag;
		}

	}

}
