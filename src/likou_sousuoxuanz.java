public class likou_sousuoxuanz
{
    public static void main(String[] args)
    {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int numsSize = 7;
        int target = 0;


        int left = 0, right = numsSize - 1;
        while (left < right)
        {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return;
            else if (nums[left] <= nums[mid])
            {//左有序
                if (nums[left] <= target && target < nums[mid])//且target在有序部分
                    right = mid - 1;
                else left = mid + 1;
            } else  //右有序
            {
                if (nums[right] >= target && target > nums[mid])//target在有序部分
                    left = mid + 1;
                else right = mid - 1;
            }
        }
    }
}