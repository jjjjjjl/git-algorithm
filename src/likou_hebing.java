public class likou_hebing
{
    public static void main(String[] args)
    {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m =3,n = 3;
        merge(nums1,m,nums2,n);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int stack[] =new int [m+n];
        int j = 0;
        int i =0;
        int length = 0;
        while(length<m+n)
        {
            if(nums1[i]<=nums2[j] && i<m)
            {
                stack[length++] = nums1[i++];
            }
            else if(i>=m)
            {
                stack[length++] = nums2[j++];
            }
            else
            {
                stack[length++] = nums2[j++];
            }
        }
        for(int k=0;k<length;k++)
        {
            nums1[k] = stack[k];
        }
    }
    }


