/*   檔名:ch11_17.java      功能:使用其他模組中的package  */

package ex17;              //本類別隸屬的類別庫
import test.pack1.CA;       //使用CA需要引入，但必須模組開放了test.pack1
import test.pack2.CB;       //使用CB需要引入，但必須模組開放了test.pack2

public class ch11_17         //主類別
{
    public static void main(String args[])
    {
        System.out.println("test"+test.pack1.CA.data);
        System.out.println("test"+test.pack2.CB.data);  
    } 
}