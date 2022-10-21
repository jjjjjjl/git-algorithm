public class likou_youxupingf
{
    public static void main(String[] args)
    {
        int numsSize = 5;
        int nums[] ={-4,-1,0,3,10};
        int mid=-1;
        int count = 0;
        int ans[] = new int[5];
        for(int i =0;i<numsSize-1;i++)
        {
            if(nums[i]<0 && nums[i+1]>=0)
            {
                mid = i+1;
                break;
            }
        }
        if(mid == -1)
        {
            for(int i =0;i<numsSize-1;i++)
            {
                nums[i] *=nums[i];
            }
        }
        int i =mid-1;int j =mid;
        for(;i!=-1||j!=numsSize;)
        {
            if( i>=0)
            {
                if((-nums[i])<nums[j])
                {
                    ans[count++] = nums[i] * nums[i];
                    i--;
                }
                else
                {
                    ans[count++] = nums[j]*nums[j];
                    j++;
                }
            }
            else
            {
                ans[count++] = nums[j]*nums[j];
                j++;
            }


        }
    }
}
