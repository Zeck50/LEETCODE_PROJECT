package com.tianzikun.huawei.credible.exam;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LengthOfLongestSubstringTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LengthOfLongestSubstringTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LengthOfLongestSubstringTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Solution solution=new Solution();
        String test1="abcabcbb";
        int correctResult1=3;

        String test2="bbbbb";
        int correctResult2=1;

        String test3="pwwkew";
        int correctResult3=3;


        String test4=" ";
        int correctResult4=1;

        String test5="au";
        int correctResult5=2;

        String test6="aab";
        int correctResult6=2;


        int s=solution.lengthOfLongestSubstring(test1);
        assertTrue( correctResult1==solution.lengthOfLongestSubstring(test1) );
        assertTrue( correctResult2==solution.lengthOfLongestSubstring(test2) );
        assertTrue( correctResult3==solution.lengthOfLongestSubstring(test3) );
        assertTrue( correctResult4==solution.lengthOfLongestSubstring(test4) );
        assertTrue( correctResult5==solution.lengthOfLongestSubstring(test5) );
        assertTrue( correctResult6==solution.lengthOfLongestSubstring(test6) );
    }
}
