import java.util.Scanner;

class Yetable
{
    public int yehao;
    public int kuaihao;

    public Yetable(int yehao, int kuaihao)
    {
        this.yehao = yehao;

        this.kuaihao = kuaihao;
    }

    public static void dayinyebiao(Yetable[] table)
    {
        System.out.println("页号  " + "块号");
        for (Yetable yetable : table)
        {
            System.out.println(yetable.yehao + "    " + yetable.kuaihao);
        }
    }

    public static int getYemiandaxiao(Scanner scan, int yemiandaxiao)
    {
        int xuanzeSize;
        System.out.println("请输入页面大小");
        xuanzeSize = scan.nextInt();
        if (xuanzeSize % 2 == 0)
        {
            yemiandaxiao = xuanzeSize * 1024;
            System.out.println("您选择的页面大小为" + xuanzeSize + "K" + "--" + yemiandaxiao);
        } else
        {
            System.out.println("您输入的页面大小不正确 ，请重新输入");
            yemiandaxiao = getYemiandaxiao(scan, yemiandaxiao);
        }

        return yemiandaxiao;
    }

    public static void ayinyebiao(Yetable[] table)
    {
    }
}

public class os
{

        public static void main(String[] args) {
            Yetable[] table = new Yetable[5];
            table[0] = new Yetable(0, 5);
            table[1] = new Yetable(1, 2);
            table[2] = new Yetable(2, 10);
            table[3] = new Yetable(3, 11);
            table[4] = new Yetable(4, 8);
            Scanner scan = new Scanner(System.in);

            int yemiandaxiao = 0;
            yemiandaxiao = Yetable.getYemiandaxiao(scan, yemiandaxiao);

            int yeno;
            /*
            输入一个整数的页内地址
             */
            //int dizhi;
            String dizhi16;
            int jueduidizhi;
            int a = 0;
            System.out.println("页号  " + "主存块号");
            for (Yetable yetable : table) {
                System.out.println(yetable.yehao + "    " + yetable.kuaihao);
            }
            while (true) {
                System.out.println("请输入页号的逻辑地址:");
                //dizhi = sc.nextInt();
                dizhi16 = scan.next();
                int dizhi = Integer.parseInt(dizhi16, 16);

                System.out.println("16进制转换为10进制后的逻辑地址为");
                System.out.println(dizhi);
                // System.out.println("请输入要访问的页号:");
                // yeno = scan.nextInt();
                //计算要访问的页号
                yeno = dizhi / yemiandaxiao;
                System.out.println("访问的页号为" + yeno);
                for (Yetable yetable : table) {
                    if (yeno == yetable.yehao) {
                        a++;
                        Yetable.dayinyebiao(table);
                        /*
                        绝对地址等于块号*1024+页内地址
                         */
                        jueduidizhi = yetable.kuaihao * yemiandaxiao + (dizhi % yemiandaxiao);
                        System.out.println("物理地址:" + jueduidizhi);
                        String shiliu_juedui = Integer.toHexString(jueduidizhi);
                        System.out.println("16进制的物理地址为"+shiliu_juedui);

                        Yetable .ayinyebiao(table);
                        break;
                    }
                    if (a == 0) {
                        System.out.println("无此页号!");
                    }
                }
            }
        }



}



