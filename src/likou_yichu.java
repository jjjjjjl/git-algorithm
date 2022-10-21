public class likou_yichu
{
    class Solution {

        public class ListNode {
     int val;
     ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public ListNode removeElements(ListNode head, int val) {
            if(head ==null) return null;
            ListNode head_temp = new ListNode();
            head_temp.next = head;
            ListNode p = head_temp;
            while(p!=null && p.next!=null)
            {
                if(p.next.val == val)
                {
                    ListNode q = p.next.next;
                    p.next =q;
                }
                else
                {
                    p = p.next;
                }
            }
            return head_temp.next;
        }
    }
}
