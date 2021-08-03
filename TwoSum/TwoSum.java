package algorithm_solutions.LeetCode.TwoSum;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums1 = new int[] {2,7,11,15};
		int[] result = new int[2];
		int target1 = 9;
		result=twoSum(nums1,target1);
		System.out.println("Elements: "+result[0]+" - "+result[1]);
		
		int[] nums2 = new int[] {3,2,4};
		int target2 = 6;
		result=twoSum(nums2,target2);
		System.out.println("Elements: "+result[0]+" - "+result[1]);
		
		int[] nums3 = new int[] {3,3};
		int target3 = 6;
		result=twoSum(nums3,target3);
		System.out.println("Elements: "+result[0]+" - "+result[1]);
		
	}
public static int[] twoSum(int[] nums, int target) {
	int[] solution = new int[2];
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {				
				if(nums[i]+nums[j]==target) {
				solution[0]=i;
					solution[1]=j;
					return solution;
				}//end inner if.				
			}//end inner for.
		}//end for.		
		return solution;
    }//end twoSum().

}
