public class exer_youxiaodekuohao {
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(s.charAt(1));
    }
    public boolean ab(String s)
    {
        int n = s.length();
        int arr[] = new int[n];
        int i=0;
        for(int j =0;j<n;j++)
        {
            if (s.charAt(j)=='(' || s.charAt(j)=='{' || s.charAt(j)=='[' )
            {
                arr[i++] = s.charAt(j);
            }
            else if((arr[i]=='(' && s.charAt(j)==')')|| (arr[i]=='[' && s.charAt(j)==']') ||  (arr[i]=='{' && s.charAt(j)=='}'))
            {
                arr[i--] = 0;

            }
        }
        if (i==0)return true;
        else return false;
    }
}
