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

public class filehd {
	private static final String filehd ="hoadon12.txt";
	public hoadon[] readhd;
	public void writehd(hoadon[] dshd) {
		FileOutputStream pas = null;
		ObjectOutputStream gas =null;
		try {
			pas = new FileOutputStream(new File(filehd));
			gas = new ObjectOutputStream(pas);
			gas.writeObject(dshd);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream(pas);
			CloseStream(gas);
		}
	}
	public hoadon[] readhd()
	{
		hoadon[] dshd = new hoadon[1000];
		FileInputStream pal = null;
		ObjectInputStream gal =null;
		try {
			pal = new FileInputStream(new File(filehd));
			gal = new ObjectInputStream(pal);
			dshd = (hoadon[]) gal.readObject();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream(pal);
			CloseStream(gal);
		}
		return dshd;
	}
	public void CloseStream(OutputStream as)
	{
		if(as!=null)
		{
			try {
				as.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
	public void CloseStream(InputStream al)
	{
		if(al!=null)
		{
			try {
				al.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
