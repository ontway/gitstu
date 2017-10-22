package home;

public class MedianofTwoSorteArryas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        int[] nums1=new int[]{2,5,6};
        int[] nums2=new int[]{3,4,6};
        
        Slo solution=new Slo();
        double m=solution.findMedianSortedArrays(nums1, nums2);
        
        System.out.println(m);
	}
	

}

	

