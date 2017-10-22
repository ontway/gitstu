public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i1=0,j1=0;

		for(int i=0;i<nums.length;i++){
			int a=nums[i];
			int b=target-nums[i];
		    for(int j=i+1;j<nums.length;j++){
		        j1=j;
		    	if(b==nums[j]){
		    	
		    		break;
		    	}
		    }
		    if(nums[j1]+a==target){
		    	i1=i;
		        break;}
		    
		    }
		
		// if(nums[j1]+nums[i1]==target){
		 int[] twonums={i1,j1};
		 return twonums;}
		// else {
		//	 System.out.println("error");
		//	 int[] twonums={0,0};
		//	 return twonums;
		 
    }
