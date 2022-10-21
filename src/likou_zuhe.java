import java.util.ArrayList;
import java.util.List;

public class likou_zuhe
{
    public static void main(String[] args)
    {
    Solution s = new Solution();
    int [][] matrix = {{1,4,7,11,15},{2,5,8,12,19}};
    int target = 5;
    s.findNumberIn2DArray(matrix,target);

    }
    static class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int row = 0,col = matrix[0].length-1;
            if(row == 0 || col == 0)return false;
            while(row<matrix.length && col >=0)
            {
                if(matrix[row][col] == target)return true;
                if(target>matrix[row][col])
                {
                    row++;
                }
                else col--;

            }
            return false;
        }
    }

}
