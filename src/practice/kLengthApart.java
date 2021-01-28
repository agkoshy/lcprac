package practice;

public class kLengthApart {

	public static void main(String[] args) {
		int[] nums = {0,0,0};
		System.out.print(kLengthApartMethod(nums, 1));
	}
	public static boolean kLengthApartMethod(int[] nums, int k) {
        boolean flag = true;
        int spaces = 0;
        int count = 0;
        while (nums[count] != 1 && count < nums.length-1) {
        	count++;
        }
        System.out.println("count: " + count);
        for (int i = count+1; i<nums.length; i++) {
        	System.out.println("number: "+nums[i] + " at position: " + i);
        	if(nums[i] == 1) {
                if (k-spaces <= 0) {
                	System.out.println("k-spaces " + (k-spaces));
                	spaces = 0;	                	
                	flag = true;
                }  else {
	            	System.out.println("k-spaces " + (k-spaces));
	            	flag = false;
	            	break;
	            }
            } else {
                spaces++;
            }
            
        }
        return flag;
    }

}
