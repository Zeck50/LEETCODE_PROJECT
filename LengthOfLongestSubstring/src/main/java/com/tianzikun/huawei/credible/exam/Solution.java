package com.tianzikun.huawei.credible.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:

        输入: "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        示例 2:

        输入: "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
        示例 3:

        输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
             请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
class Solution {
    public boolean isUnique(Map input,int startIndex,int endIndex)
    {
        if(input!=null)
        {
            HashMap<Integer,Character> temp=new HashMap<>(input);

            for(int i=startIndex;i<endIndex;i++)
            {
                char tempChar=(Character) temp.get(i);
                temp.remove(i);
                if(temp.containsValue(tempChar))
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        if(s.length()==1)
        {
            return s.length();
        }
        if(s!=null&&s!="")
        {
            for(int i=0;i<s.length();i++)
            {
                for(int j=i;j<s.length();j++)
                {
                    Map<Integer,Character> map=new HashMap<>();
                    for(int m=i;m<=j;m++)
                    {
                        map.put(m,s.charAt(m));
                    }
                    if(isUnique(map,i,j))
                    {
                        int tempLength=map.size();
                        if(tempLength>maxLength)
                        {
                            maxLength=tempLength;
                        }
                    }
                }
            }
        }
        return maxLength;
    }
}
