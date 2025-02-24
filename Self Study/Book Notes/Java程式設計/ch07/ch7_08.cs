//檔名:ch7_08.cs   功能:傳參考呼叫

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            CVector2 i = new CVector2();
            i.set(20, 40);
            CVector2 j = new CVector2();
            j.set(15, 45);
            Console.WriteLine("-----原始------");
            Console.WriteLine("Vector i=(" + i.x + "," + i.y + ")");
            Console.WriteLine("Vector j=(" + j.x + "," + j.y + ")");
            CMyClass X = new CMyClass();
            X.swap(ref i, ref j);   //傳參考呼叫
            Console.WriteLine("-----swap後-------");
            Console.WriteLine("Vector i=(" + i.x + "," + i.y + ")");
            Console.WriteLine("Vector j=(" + j.x + "," + j.y + ")");
            Console.Read();
        }
    }
    class CMyClass
    {
        public void swap(ref CVector2 a, ref CVector2 b)  //傳參考呼叫的互換函式
        {
            CVector2 temp;
            temp = a;
            a = b;
            b = temp;
        }
    }

    class CVector2                      //二維向量類別
    {
        public int x, y;               //二維向量的兩項元素資料
        public void set(int m, int n)  //用於設定二維向量的兩項元素資料
        {
            x = m;
            y = n;
        }
    }
}