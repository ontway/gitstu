

public class N4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        int[] nums1=new int[]{2,5,6};
        int[] nums2=new int[]{3,4,6};
        
        Slo solution=new Slo();
        double m=solution.findMedianSortedArrays(nums1, nums2);
        
        System.out.println(m);
	}
	

}
class Slo{
	public double findMedianSortedArrays(int[]nums1, int[]nums2){
		int j=0,k=0;
		double r=0,r1=0;
	
			int l=(nums1.length+nums2.length)/2;
			for(int i=1;i<=l+1;i++){
				if(j<nums1.length&&k<nums2.length){
					if(nums1[j]>nums2[k]){
						r1=r;
						r=nums2[k];
						k++;
					}
					else{
						r1=r;
						r=nums1[j];
						j++;
					}
				}
				else if(j<nums1.length){
					r1=r;
					r=nums1[j];
					j++;
				}
				else{
					r1=r;
					r=nums2[k];
					k++;
				}
			}
			if((nums1.length+nums2.length)%2==0)
				return (r1+r)/2.0;
	
			else return r;
			}
		}
	

