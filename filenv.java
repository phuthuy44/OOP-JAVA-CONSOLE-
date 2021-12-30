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

public class filenv {
	
	private static final String filenv ="nhanvien124.txt";
	public NhanVien[] readnv;
	public void writenv(NhanVien[] arrnv) {
		FileOutputStream piz = null;
		ObjectOutputStream giz =null;
		try {
			piz = new FileOutputStream(new File(filenv));
			giz = new ObjectOutputStream(piz);
			giz.writeObject(arrnv);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream(piz);
			CloseStream(giz);
		}
	}
	public NhanVien[] readnv() {
		NhanVien[] arrnv = new NhanVien[10000];
		FileInputStream pus = null;
		ObjectInputStream gus = null;
		try {
			pus = new FileInputStream(new File(filenv));
			gus = new ObjectInputStream(pus);
			arrnv = (NhanVien[]) gus.readObject();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			CloseStream(pus);
			CloseStream(gus);
		}
		return arrnv;
	}
	public void CloseStream(OutputStream iz)
	{
			if(iz!=null)
			
			{
					try 
					{
						iz.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
	}
	public void CloseStream(InputStream us)
	{
			if(us!=null)
			
			{
					try 
					{
						us.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
		}
	
}
