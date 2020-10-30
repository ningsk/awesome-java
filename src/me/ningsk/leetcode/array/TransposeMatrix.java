package me.ningsk.leetcode.array;

import java.util.Arrays;

/**
 *
 * Leetcode.867
 *
 * 转换矩阵
 * 给定一个矩阵A，返回A的转置矩阵
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引
 *
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 * 示例 2：
 *
 * 输入：[[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 *
 * 提示：
 *  1. 1 <= A.length <= 1000
 *  2. 1 <= A[0].length <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/transpose-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,2,3}, {4,5,6}};
        int[][] result = new TransposeMatrix().transpose(A);

    }

    public int[][] transpose(int[][] A) {

        // 水平为x轴，垂直为y轴 然后x轴，y轴转换
        int xAxis = A[0].length;
        int yAxis = A.length;
        int[][] result = new int[xAxis][yAxis];
        for (int i = 0; i < xAxis; i++) {
            for (int j = 0; j < yAxis; j++) {
                result[i][j] = A[j][i];
            }
        }

        return result;
    }

}
