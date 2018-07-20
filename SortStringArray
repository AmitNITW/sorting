public class SortStringArray {
	
	/*
	 * Input : { "paper", "true", "soap", "floppy", "flower" }
	 * 
	 *  Ouput : { "floppy", "flower", "paper", "soap", "true" }
	 */
	
	public static void sortStringUsingSelection(String[] str) {
		for (int i = 0; i < str.length - 1; i++) {
			int index = i;
			for (int j = i; j < str.length; j++) {
				if (str[index].compareTo(str[j]) > 0) {
					index = j;
				}
			}

			if (index != i) {
				String s = str[i];
				str[i] = str[index];
				str[index] = s;
			}
		}
	}
}
