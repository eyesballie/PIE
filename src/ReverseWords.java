
public class ReverseWords {

	public static char[] reverseWord(String str) {
		char[] strCharArray = str.toCharArray();
		reverseString(strCharArray, 0, strCharArray.length - 1);
		
		int start = 0;
		int end = 0;
		while (end < strCharArray.length) {
			while (strCharArray[end] != ' ' && end < strCharArray.length - 1) {
				end++;
			}	
			if (end != strCharArray.length - 1) {
				reverseString(strCharArray, start, end - 1);
			}
			else {
				reverseString(strCharArray, start, end);	
				break;
			}
			start = end + 1;
			end = start + 1;
		}
		return strCharArray;
	}			

	
	public static void reverseString(char[] str, int start, int end) {
		while (end > start) {
			char swap = str[start];
			str[start] = str[end];
			str[end] = swap;
			start ++;
			end --;
		}		
	}
	
	public static void main(String[] args) {
		String str = "Do or do not, there is no try";
		System.out.println(reverseWord(str));
	}
}
