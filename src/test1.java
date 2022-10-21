import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class test1
{
    public static void main(String[] args)
    {
        int dp[][] = new int[2][1050000];
        Scanner input = new Scanner(System.in);
        int loo = 0;
        loo = input.nextInt();
        int n, i;


        for (int l = 0; l < loo; l++)
        {
            n = input.nextInt();
            i = input.nextInt();
            dp[0][0] = 1;
            for (int j = 1; j <= n; j++)
            {
                for (int k = 0; k < j + 1; k++)
                {

                    if (k == 0 || j == k) dp[j % 2][k] = 1;
                    else
                    {
                        if (j % 2 == 1)
                        {
                            dp[1][k] = dp[0][k] ^ dp[0][k - 1];
                        }
                        if (j % 2 == 0)
                        {
                            dp[0][k] = dp[1][k] ^ dp[1][k - 1];
                        }
                    }
                }

            }

            System.out.println(dp[n % 2][i]);
        }

    }

}