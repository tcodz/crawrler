package Leetcode;
class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		val=x;	
		}
}
public class AddTwo {
    public static ListNode solution(ListNode l1,ListNode l2){
           ListNode pre=new ListNode(0);
           ListNode curr=pre;
           int carry=0;
           while(l1!=null||l2!=null||carry!=0){
        	   int n1=l1==null? 0:l1.val;
        	   int n2=l2==null? 0:l2.val;
        	   int sum=n1+n2+carry;
        	   carry=sum/10;
        	   curr.next=new ListNode(sum%10);
        	   curr=curr.next;
        	   l1=l1==null?l1:l1.next;
        	   l2=l2==null?l2:l2.next;
           }
           return pre.next;
    	 }    
	public static void main(String[] args) {
		ListNode l1=new ListNode(2);
		ListNode l2=new ListNode(4);
		ListNode l3=new ListNode(5);
		ListNode a1=new ListNode(9);
		ListNode a2=new ListNode(3);
		l1.next=l2;l2.next=l3;l3.next=null;a1.next=a2;a2.next=null;
		ListNode result=solution(l1, a1);
		while(result!=null)
			{System.out.print(result.val);
			result=result.next;
			}
		
	}

}
