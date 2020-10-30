package me.ningsk.leetcode.array;

/**
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 *
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 *
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 *
 *  
 *
 * 示例 :
 *
 * 输入:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 *
 * 输出: 16
 *
 * 解释: 它的周长是下面图片中的 16 个黄色的边：
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/island-perimeter
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsLandPerimeter {

    public static void main(String[] args) {
        Solution463 solution463 = new Solution463();
        int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0}, {0,1,0,0},{1,1,0,0}};
        int result =  solution463.islandPerimeter(grid);
        System.out.println(result);
    }

    static class Solution463 {
        public int islandPerimeter(int[][] grid) {
            // 解题思路：找出岛屿的个数，去掉贴合边的数量。两个岛屿贴合就损失两条边
            int width = grid.length;
            int height = grid[0].length;
            int squareNum = 0;
            int edgeNum = 0;
            for (int w = 0; w < width; w++) {
                for (int h = 0; h < height; h++) {
                    if (grid[w][h] == 1) {
                        squareNum++;
                        if ((h + 1 < height) && grid[w][h+1] == 1) { // 下面同样位置有岛屿
                            edgeNum++;
                        }
                        if ((w + 1 < width) && grid[w+1][h] == 1) { // 右边同样位置有岛屿
                           edgeNum++;
                        }
                    }
                }
            }
            return (squareNum * 4) - (edgeNum) * 2;
        }
    }

}
