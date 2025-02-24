/*   檔名:位於pack1\ch11_03.java        功能:將不同檔案的類別宣告為同一個類別庫   */

package pack1;        //本檔案內的類別屬於pack1類別庫

public class ch11_03         //主類別
{
    public static void main(String args[])
    {
        CRect obj = new CRect(5.0,3.0);
        obj.showArea();  
    } 
}