/*  檔名:位於pack3b\ch11_05.java          功能:使用其他類別庫的類別 */

package pack3b;        //本檔案內的類別屬於pack3b類別庫

import pack3a.CRect;    //匯入類別

public class ch11_05         //主類別
{
    public static CRect obj;
    public static void main(String args[])
    {
        obj = new CRect(5.0,3.0);
        obj.showArea();  
    } 
}