public class likou_jieyushui {
    public static void main(String[] args) {
    int h[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    int i = trap(h);
        System.out.println(i);
    }
        static int trap(int[] height) {
            int sum = 0;
            int len = height.length;
            while(height.length!=0)
            {
                int left = -1,right = -1;
                int count = 0;
                for(int i =0;i<len;i++)   //用于找到最左和最右的各自所在的位置
                {

                    if (height[i]!=0 && left == -1)
                    {
                        left = i;right = i;
                    }
                    if (right!=-1 && height[i]!=0) right = i;

                }
                if(left == right) break;
                while(left<=right)     //计算为0的个数
                {

                    if (height[left] == 0) count++;
                    left++;
                    if(height[left-1]!=0)
                    height[left-1]-=1;


                }
                sum+=count;
            }
            return sum;
        }
}

