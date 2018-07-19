
public class SelectionSort {
	/*
	 * Recursion start
	 */
	public static void sortUsingRecursion(int[] arr) {
		sortUsingRecursion(arr, 0, arr.length);
	}

	public static void sortUsingRecursion(int[] arr, boolean isDescending) {
		sortUsingRecursion(arr, 0, arr.length, isDescending);
	}

	public static void sortUsingRecursion(int[] arr, int startIndex, int endIndex) {
		sortUsingRecursion(arr, 0, arr.length, false);
	}

	public static void sortUsingRecursion(int[] arr, int startIndex, int endIndex, boolean isDescending) {
		if (startIndex >= endIndex)
			return;
		int index;

		if (isDescending)
			index = findMaxIndex(arr, startIndex, endIndex, isDescending);
		else
			index = findMinIndex(arr, startIndex, endIndex, isDescending);

		int temp = arr[startIndex];
		arr[startIndex] = arr[index];
		arr[index] = temp;
		sortUsingRecursion(arr, startIndex + 1, endIndex, isDescending);
	}

	private static int findMinIndex(int[] arr, int startIndex, int endIndex, boolean isDescending) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = startIndex; i < endIndex; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}

	private static int findMaxIndex(int[] arr, int startIndex, int endIndex, boolean isDescending) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = startIndex; i < endIndex; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	/*
	 * Recursion end
	 */

	/*
	 * byte start
	 */
	public static void sort(byte[] arr) {
		sort(arr, 0, arr.length, false);
	}

	public static void sort(byte[] arr, boolean isDescending) {
		sort(arr, 0, arr.length, isDescending);
	}

	public static void sort(byte[] arr, int fromIndex, int toIndex) {
		sort(arr, fromIndex, toIndex, false);
	}

	public static void sort(byte[] arr, int fromIndex, int toIndex, boolean isDescending) {
		rangeCheck(arr.length, fromIndex, toIndex);
		for (int i = fromIndex; i < toIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < toIndex; j++) {
				if (isDescending) {
					if (arr[j] > arr[minIndex]) {
						minIndex = j;
					}
				} else {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
			}

			if (minIndex != i) {
				byte temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	/*
	 * byte end
	 */

	/*
	 * short start
	 */
	public static void sort(short[] arr) {
		sort(arr, 0, arr.length, false);
	}

	public static void sort(short[] arr, boolean isDescending) {
		sort(arr, 0, arr.length, isDescending);
	}

	public static void sort(short[] arr, int fromIndex, int toIndex) {
		sort(arr, fromIndex, toIndex, false);
	}

	public static void sort(short[] arr, int fromIndex, int toIndex, boolean isDescending) {
		rangeCheck(arr.length, fromIndex, toIndex);
		for (int i = fromIndex; i < toIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < toIndex; j++) {
				if (isDescending) {
					if (arr[j] > arr[minIndex]) {
						minIndex = j;
					}
				} else {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
			}

			if (minIndex != i) {
				short temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	/*
	 * Short end
	 */

	/*
	 * int start
	 */
	public static void sort(int[] arr) {
		sort(arr, 0, arr.length, false);
	}

	public static void sort(int[] arr, boolean isDescending) {
		sort(arr, 0, arr.length, isDescending);
	}
	
	public static void sort(int[] arr, int fromIndex, int toIndex) {
		sort(arr, fromIndex, toIndex, false);
	}
	
	public static void sort(int[] arr, int fromIndex, int toIndex, boolean isDescending) {
		rangeCheck(arr.length, fromIndex, toIndex);
		for (int i = fromIndex; i < toIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < toIndex; j++) {
				if (isDescending) {
					if (arr[j] > arr[minIndex]) {
						minIndex = j;
					}
				} else {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
			}

			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	/*
	 * int end
	 */
	
	/*
	 * long start
	 */
	public static void sort(long[] arr) {
		sort(arr, 0, arr.length, false);
	}

	public static void sort(long[] arr, boolean isDescending) {
		sort(arr, 0, arr.length, isDescending);
	}
	
	public static void sort(long[] arr, int fromIndex, int toIndex) {
		sort(arr, fromIndex, toIndex, false);
	}
	
	public static void sort(long[] arr, int fromIndex, int toIndex, boolean isDescending) {
		rangeCheck(arr.length, fromIndex, toIndex);
		for (int i = fromIndex; i < toIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < toIndex; j++) {
				if (isDescending) {
					if (arr[j] > arr[minIndex]) {
						minIndex = j;
					}
				} else {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
			}

			if (minIndex != i) {
				long temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	/*
	 * long end
	 */
	
	/*
	 * double start
	 */
	public static void sort(double[] arr) {
		sort(arr, 0, arr.length, false);
	}

	public static void sort(double[] arr, boolean isDescending) {
		sort(arr, 0, arr.length, isDescending);
	}
	
	public static void sort(double[] arr, int fromIndex, int toIndex) {
		sort(arr, fromIndex, toIndex, false);
	}
	
	public static void sort(double[] arr, int fromIndex, int toIndex, boolean isDescending) {
		rangeCheck(arr.length, fromIndex, toIndex);
		for (int i = fromIndex; i < toIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < toIndex; j++) {
				if (isDescending) {
					if (arr[j] > arr[minIndex]) {
						minIndex = j;
					}
				} else {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
			}

			if (minIndex != i) {
				double temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	/*
	 * double end
	 */
	
	/*
	 * float start
	 */
	public static void sort(float[] arr) {
		sort(arr, 0, arr.length, false);
	}

	public static void sort(float[] arr, boolean isDescending) {
		sort(arr, 0, arr.length, isDescending);
	}
	
	public static void sort(float[] arr, int fromIndex, int toIndex) {
		sort(arr, fromIndex, toIndex, false);
	}
	
	public static void sort(float[] arr, int fromIndex, int toIndex, boolean isDescending) {
		rangeCheck(arr.length, fromIndex, toIndex);
		for (int i = fromIndex; i < toIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < toIndex; j++) {
				if (isDescending) {
					if (arr[j] > arr[minIndex]) {
						minIndex = j;
					}
				} else {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
			}

			if (minIndex != i) {
				float temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	/*
	 * float end
	 */
	
	/*
	 * char start
	 */
	public static void sort(char[] arr) {
		sort(arr, 0, arr.length, false);
	}

	public static void sort(char[] arr, boolean isDescending) {
		sort(arr, 0, arr.length, isDescending);
	}
	
	public static void sort(char[] arr, int fromIndex, int toIndex) {
		sort(arr, fromIndex, toIndex, false);
	}
	
	public static void sort(char[] arr, int fromIndex, int toIndex, boolean isDescending) {
		rangeCheck(arr.length, fromIndex, toIndex);
		for (int i = fromIndex; i < toIndex - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < toIndex; j++) {
				if (isDescending) {
					if (arr[j] > arr[minIndex]) {
						minIndex = j;
					}
				} else {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
			}

			if (minIndex != i) {
				char temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	
	/*
	 * char end
	 */
	
	/*
	 * common function to check range 
	 */
	private static void rangeCheck(int arrayLength, int fromIndex, int toIndex) {
		if (fromIndex > toIndex) {
			throw new IllegalArgumentException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
		}
		if (fromIndex < 0) {
			throw new ArrayIndexOutOfBoundsException(fromIndex);
		}
		if (toIndex > arrayLength) {
			throw new ArrayIndexOutOfBoundsException(toIndex);
		}
	}
}
