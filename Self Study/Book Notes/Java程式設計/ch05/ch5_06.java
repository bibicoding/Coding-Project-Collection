/*   檔名:ch5_06.java      功能:複製部分陣列    */

package myJava.ch05;
import java.lang.*;

public class ch5_06         //主類別
{
    public static void main(String args[])
    {
        int scores[][]={{85,78,65},
                       {75},
                       {63,95},
                       {94,92,88}};
        int ary[];
        ary = scores[3].clone();
        for(int element : ary)
           System.out.print(element + "\t");
    }
}
