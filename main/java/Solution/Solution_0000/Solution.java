package Solution.Solution_0000;

import code_generation.utils.IoUtil;
import code_generation.annotation.TestCaseGroup;
import java.util.*;
/**
 * @author: qitongwei
 * @Description:
 * @url:   <a href="https://leetcode.cn/problems/find-the-sum-of-the-power-of-all-subsequences">求出所有子序列的能量和</a>
 * @title: 求出所有子序列的能量和
 */
//@TestCaseGroup(start = 1,end = 0x3fff,use = true)
public class Solution {

    public static void main(String[] args) {
        IoUtil.testUtil(Solution.class,"sumOfPower","in.txt");
    }
    private static final int MOD = (int)1e9 + 7;

    public int sumOfPower(int[] nums, int k) {
        long[] f = new long[k + 1];
        f[0] = 1;
        for (int x : nums) {
            for (int j = k; j >= 0; j--) {
                f[j] = (f[j] * 2 + (j >= x ? f[j - x] : 0)) % MOD;
            }
        }
        return (int) f[k];
    }

  

}