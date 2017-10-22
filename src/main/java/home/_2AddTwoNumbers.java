/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode res=new ListNode(0);
        res=l1;
        int flag=0;
        int r=0;
        r=l1.val+l2.val;
        l1.val=r%10;
        flag=r/10;
        while(l1.next!=null&&l2.next!=null){
            l1=l1.next;
            l2=l2.next;
            r=l1.val+l2.val+flag;
            l1.val=r%10;
            flag=r/10;
         
        } 
       
        while(l1.next!=null){
            l1=l1.next;
            r=l1.val+flag;
            l1.val=r%10;
            flag=r/10;
            }
           
        
       
        while(l2.next!=null){
            l1.next=l2.next;
            l2=l2.next;
            l1=l1.next;
            r=l1.val+flag;
            l1.val=r%10;
            flag=r/10;
            }
        if(flag!=0){
            ListNode l=new ListNode(flag);
            l1.next=l;
        
        }
        return res;
           
    }
}
