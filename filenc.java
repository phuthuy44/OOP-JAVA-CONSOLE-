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

public class filenc {
	private static final String filencc = "nhacungcap2.txt";
	public nhacungcap[] read;
	public void write(nhacungcap[] dsncc)
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(new File(filencc));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(dsncc);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream(fos);
			CloseStream(oos);
		}
	}
	public  nhacungcap[] read() {
       nhacungcap[] dsncc= new nhacungcap[1000];
       FileInputStream fis = null;
       ObjectInputStream ois = null;
       try {
    	   fis = new FileInputStream(new File(filencc));
    	   ois = new ObjectInputStream(fis);
    	   dsncc = (nhacungcap[]) ois.readObject();   
       }catch(FileNotFoundException e) {
    	   e.printStackTrace();
       }catch(ClassNotFoundException e) {
    	   e.printStackTrace();
       }catch(IOException e) {
    	   e.printStackTrace();
       }finally {
    	   CloseStream(fis);
    	   CloseStream(ois);
       }
       return dsncc;
    }
		private void CloseStream(OutputStream os)
		{
			if(os!=null)
			{
				try {
					os.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		private void CloseStream(InputStream is)
		{
			if(is!=null)
			{
				try {
					is.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
}
