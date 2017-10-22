package home;

public class TwoSum {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int e=5;
		int d=4;
		System.out.println(a);
		int f=2;
		System.out.println(b);
		System.out.println(c);
		int g=4;
	}

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

		 int[] twonums={i1,j1};
		 return twonums;}

		 
    }
