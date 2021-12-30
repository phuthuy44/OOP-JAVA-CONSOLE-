package DoAn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class filesp {
	private static final String filebanhang = "quanlybanhang.txt";
    public SanPham[] readSP;
     
   public void writesanpham(SanPham[] banhang) 
     {
         FileOutputStream foo = null;
         ObjectOutputStream ooo = null;
         try {
             foo = new FileOutputStream(new File(filebanhang));
             ooo = new ObjectOutputStream(foo);
             ooo.writeObject(banhang);
         }catch(FileNotFoundException e) {
             e.printStackTrace();
         }catch(IOException e) {
             e.printStackTrace();
         }finally {
        	 CloseStream(foo);
             CloseStream(ooo);
         }
     }
	public  SanPham[] readSP() {
	     SanPham[] banhang= new SanPham[1000];
	     FileInputStream fii = null;
	     ObjectInputStream oii = null;
	     try {
	         fii = new FileInputStream(new File(filebanhang));
	         oii = new ObjectInputStream(fii);
	        banhang = (SanPham[]) oii.readObject();   
	     }catch(FileNotFoundException e) {
	         e.printStackTrace();
	     }catch(ClassNotFoundException e) {
	         e.printStackTrace();
	     }catch(IOException e) {
	         e.printStackTrace();
	     }finally {
	    	 	CloseStream(fii);
	           CloseStream(oii);
	     }
	     return banhang;
	  }
	public void CloseStream(OutputStream oo) {
	  	 if(oo!=null) {
	  		 try {
	  			 oo.close();
	  		 }catch(IOException e) {
	  			 e.printStackTrace();
	  		 }
	  	 }
	   }
	   public void CloseStream(InputStream ii) {
	  	 if(ii!=null) {
	  		 try {
	  			 ii.close();
	  		 }catch(IOException e) {
	  			 e.printStackTrace();
	  		 }
	  	 }
	   }
}
