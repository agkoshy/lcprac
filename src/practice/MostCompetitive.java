package practice;

public class MostCompetitive {
	public static void main(String args[]) {
//		int[] nums = {0,0,0};
//		System.out.print(kLengthApart(nums, 1));
		
	}
	
	
	
	public static int[] mostCompetitive(int[] nums, int k) {
		int[] result = new int[k];
		int pos = 0;
		int temp = nums[0];
		for(int j = 0; j<k;j++) {
			
			for(int i = j+1; i<nums.length;i++) {
				System.out.println("i: " + i);
				System.out.println("j: " + j);
				System.out.println("num at i: " + nums[i]);
				System.out.println("num length: " + nums.length);
				if (temp > nums[i+1]) {
					temp = nums[i+1];
				}
			}
			result[j] = temp;
		}
		return result;
		
	}
}
