package com.tianzikun.huawei.credible.exam;

import com.tianzikun.huawei.credible.exam.ListNode;


class Solution {
    private final int INITIAL_VALUE=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(INITIAL_VALUE);
        ListNode p=new ListNode(INITIAL_VALUE);
        ListNode q=new ListNode(INITIAL_VALUE);
        int carry=0;
        while(p.next!=null&&q.next!=null)
        {
            p.val=l1.val;
            q.val=l2.val;
            int sum=(p.val+q.val+carry)/10;
            carry=sum%10;
            p=p.next;
            q=q.next;
            result.val=sum;
            result=result.next;
        }
        return result;
    }
}