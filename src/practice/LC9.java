package practice;

public class LC9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(131));
	}
	
	public static boolean isPalindrome(int x) {
		String s = Integer.toString(x);
        int start = 0;
        int end = s.length()-1;
        
        while (end > start) {
            char a = s.charAt(start++);
            char b = s.charAt(end--);
            if (a != b) {
                return false;
            }
        }
        return true;
	}
}
