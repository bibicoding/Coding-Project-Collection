/*   ÀÉ¦W:ch10_06.java          ¥\¯à:ƒÜ	Multi-catchªº­­¨î  */

package myJava.ch10;
import java.lang.*;

public class ch10_06         //¥DÃþ§O
{
    public static void main(String args[])
    {
    	  int lottoSize=99;
    	
    	  try
    	  {   	   
    	    if(lottoSize > 48)
    	        throw new CmyException1();    	    
    	    else if(lottoSize < 6)
    	        throw new CmyException2();    	    
    	  }
    	  catch(CmyException1 | CmyException2 e)
    	  {
    	    e.showMessage();
    	    lottoSize = e.changeSize();
    	  }     	
    	  finally
    	  {
    	    System.out.println("¼Ö³z¶}¼ú²y¼Æ¬°" + lottoSize);
    	  }
    	
    	  int lottoAry[] = new int[lottoSize];
    	  System.out.println("¦s©ñ¼Ö³z¶}¼úªº°}¦C¹êÅé²£¥Í§¹²¦");
    } 
}    

class CmyException1 extends Exception
{
    public CmyException1()   //«Øºc¤l
    {
         super();
    }
    public void showMessage()
    {
         System.out.println("¨Ò¥~°T®§:°}¦C¤j¤p¿ù»~");
    }
    public int changeSize()
    {
         System.out.println("¨Ò¥~°T®§:°}¦C¤j¤p±N³Q­«³]¬°6");
         return 6;
    }
}


class CmyException2 extends Exception
{
    public CmyException2()   //«Øºc¤l
    {
         super();
    }
    public void showMessage()
    {
         System.out.println("¨Ò¥~°T®§:°}¦C¤j¤p¿ù»~");
    }
    public int changeSize()
    {
         System.out.println("¨Ò¥~°T®§:°}¦C¤j¤p±N³Q­«³]¬°6");
         return 6;
    }
}
