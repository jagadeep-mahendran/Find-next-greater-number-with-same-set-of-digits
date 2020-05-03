import java.util.*;
public class Test {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
         int len=String.valueOf(n).length();
          int a[]=new int[len];
          int res[]=new int[len];
            int i=0;
           while(n!=0)
             {
               int d=n%10;
               a[i]=d;
               n=n/10;
               i++;
             }
                 Arrays.sort(a);

          String limit="";
          for(i=0;i<len;i++)
            limit+="9";
            int lmt=Integer.parseInt(limit);
            int f=0;

            for(int j=m+1;j<lmt;j++)
               {
                  i=0;
                  int num=j;
                  while(num!=0)
                     {
                       int d=num%10;
                       res[i]=d;
                       num=num/10;
                       i++;
                     }
                     Arrays.sort(res);
                     String x=Arrays.toString(a);
                     String y=Arrays.toString(res);

                     if(x.equals(y))
                        {
                         System.out.println(j);
                          f=1;
                          break;
                        }
               }
               if(f==0)
                 System.out.print("Not possible");

    }
}
