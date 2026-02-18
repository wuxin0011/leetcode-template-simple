package leetcode.contest.weekly.w_400.w_479;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: qitongwei
 * @Description:
 * @url:   <a href="https://leetcode.cn/contest/weekly-contest-479/problems/sort-integers-by-binary-reflection">二进制反射排序</a>
 * @title: 二进制反射排序
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class A {

    public static void main(String[] args) {
        IoUtil.testUtil(A.class,"sortByReflection","A.txt");
    }
    private static final int MOD = (int)1e9 + 7;

    public int[] sortByReflection(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int revA = Integer.reverse(a) >>> Integer.numberOfLeadingZeros(a);
            int revB = Integer.reverse(b) >>> Integer.numberOfLeadingZeros(b);
            return revA != revB ? revA - revB : a - b;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }

  

}