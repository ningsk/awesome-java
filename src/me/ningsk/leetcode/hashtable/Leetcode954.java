package me.ningsk.leetcode.hashtable;

/**
 * 二倍数对数组
 *
 * 给定一个长度为偶数的整数数组A，只有对A进行重组后可以满足"对于每个0 <= i < len(A) /2, 都有A[2 * i + 1] = 2 * A[2 * i]"时，
 * 返回true，否则，返回false
 *
 * 示例 1：
 *
 * 输入：[3,1,3,6]
 * 输出：false
 * 示例 2：
 *
 * 输入：[2,1,2,6]
 * 输出：false
 * 示例 3：
 *
 * 输入：[4,-2,2,-4]
 * 输出：true
 * 解释：我们可以用 [-2,-4] 和 [2,4] 这两组组成 [-2,-4,2,4] 或是 [2,4,-2,-4]
 * 示例 4：
 *
 * 输入：[1,2,4,16,8,4]
 * 输出：false
 *  
 *
 * 提示：
 *
 * 0 <= A.length <= 30000
 * A.length 为偶数
 * -100000 <= A[i] <= 100000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/array-of-doubled-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode954 {
}
