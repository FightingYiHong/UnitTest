package org.apache.commons.math3.stat.descriptive.summary;

public class CoverExample {
    boolean p=false;
    public static boolean judge(int y,int m,int d)
    {
        if(m<1||m>12)
        {
            System.out.println("月份不合法！\n");
            p=false;
        }
        else if (m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
            if(d>=1||d<=31)
                p=true;
            else
            {
                p=false;
                System.out.println("日期不合法！\n");
            }
        }
        else if(m==2)
        {
            if(y%400==0||(y%4==0&&y%100!=0))
            {
                if(d>=1&&d<=29)
                    p=true;
                else
                {
                    System.out.println("日期不合法！\n");
                    p=false;
                }
            }
            else
            {
                if(d>=1&&d<=28)
                    p=true;
                else {
                    System.out.println("日期不合法！\n");
                    p = false;
                }
            }
        }
        else
        {
            if(d>=1&&d<=30)
                p=true;
            else
            {
                System.out.println("日期不合法！\n");
                p=false;
            }
        }
        return p;
    }
    public static void main(String[]args){
        test2=Coverexample();
    }
}

