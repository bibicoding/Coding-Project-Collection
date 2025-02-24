/*  檔名:位於pack4c\ch11_06.java          功能:封裝對於繼承的影響  */

package pack4c;        //本檔案內的類別屬於pack4c類別庫

import pack4b.CRect;    //匯入類別

public class ch11_06         //主類別
{
    public static void main(String args[])
    {
        CRect obj = new CRect(5.0,3.0);
        obj.showArea();  
    } 
}