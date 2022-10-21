public class likou_fanzhuan
{
    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row = 4,col = 4;
        for(int i = 0;i<row;i++)
        {
            for(int j = i;j<col;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col/2;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][col-i-1];
                matrix[i][col-i-1] = temp;
            }
        }
    }
}
