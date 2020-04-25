package com.tianzikun.huawei.credible.exam;

import com.tianzikun.huawei.credible.exam.ListNode;

import java.util.ArrayList;
import java.util.List;

/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

        示例：

        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        输出：7 -> 0 -> 8
        原因：342 + 465 = 807

 */


class Solution {
    private final int INITIAL_VALUE=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(INITIAL_VALUE);
        ListNode p=l1;
        ListNode q=l2;
        int carry=0;
        List<Integer> tempList=new ArrayList<>();
        int pvalue=0;
        int qvalue=0;
        while(p!=null||q!=null)
        {
            if(p==null)
            {
                p=new ListNode(INITIAL_VALUE);
            }
            if(q==null)
            {
                q=new ListNode(INITIAL_VALUE);
            }
            int sum=(p.val+q.val+carry)%10;
            carry=(p.val+q.val+carry)/10;
            p=p.next;
            q=q.next;
            tempList.add(sum);
            if(p==null&&q==null&&carry!=0)
            {
                tempList.add(carry);
            }

        }
        ListNode tempNodeList=new ListNode(INITIAL_VALUE);
        result=tempNodeList;
        for(int i=0;i<tempList.size();i++)
        {
            tempNodeList.val=tempList.get(i);
            if(i<tempList.size()-1)
            {
                tempNodeList.next=new ListNode(INITIAL_VALUE);
                tempNodeList=tempNodeList.next;
            }
        }
        return result;
    }
}