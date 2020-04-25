package com.tianzikun.huawei.credible.exam;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SolutionTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SolutionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        ListNode list1Bit=new ListNode(3);
        ListNode list1Ten=new ListNode(4);
        ListNode list1Hundred=new ListNode(2);


        ListNode list2Bit=new ListNode(4);
        ListNode list2Ten=new ListNode(6);
        ListNode list2Hundred=new ListNode(5);

        ListNode resultListBit=new ListNode(8);
        ListNode resultListTen=new ListNode(0);
        ListNode resultListHundred=new ListNode(7);

        list1Hundred.next=list1Ten;
        list2Hundred.next=list2Ten;
        resultListHundred.next=resultListTen;

        list1Ten.next=list1Bit;
        list2Ten.next=list2Bit;
        resultListTen.next=resultListBit;

        Solution solution=new Solution();
        ListNode resultListNode=solution.addTwoNumbers(list1Hundred,list2Hundred);

        boolean isResultCorrect=isResultCorrect(resultListNode,resultListTen);
        assertTrue(isResultCorrect);
    }
    public boolean isResultCorrect(ListNode result,ListNode testResult)
    {
        while(result.next!=null&&testResult.next!=null)
        {
            boolean isSumCorrective=result.val==testResult.val;
            if(!isSumCorrective)
            {
                return false;
            }
            result=result.next;
            testResult=testResult.next;
        }
        return true;
    }
}
