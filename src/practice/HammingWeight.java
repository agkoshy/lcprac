package practice;

public class HammingWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeightCalc(11));
	}
	
	public static int hammingWeightCalc(int n) {
		String s = Integer.toBinaryString(n);
        int ans = 0;
        //System.out.println(s);
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1') {
                //System.out.println(s.charAt(i));
                ans++;
            }
        }
        return ans;
	}
	
	public static int betterHammingWeightCalc(int n) {
		//Online solution - not mine
		int count = 0;
        while(n != 0) {
            count++;
            n &= (n-1); 
        }
        return count;
	}
}
