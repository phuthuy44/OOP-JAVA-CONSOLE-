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
public class filekho {
	private static final String filekho1 = "nhakho3.txt";
	public chitietnhap[] read;
	
	public void write(chitietnhap[] dsctn)
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(new File(filekho1));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(dsctn);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream(fos);
			CloseStream(oos);
		}
	}
	public  chitietnhap[] read() {
      chitietnhap[] dsctn= new chitietnhap[1000];
       FileInputStream fis = null;
       ObjectInputStream ois = null;
       try {
    	   fis = new FileInputStream(new File(filekho1));
    	   ois = new ObjectInputStream(fis);
    	   dsctn = (chitietnhap[]) ois.readObject();   
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
       return dsctn;
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
