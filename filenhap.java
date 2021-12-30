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
public class filenhap {
	private static final String filekho = "nhapkho12.txt";
	public phieunhap[] read1;

	public void write1(phieunhap[] dsnhapkho)
	{
		FileOutputStream goo = null;
		ObjectOutputStream hoo =null;
		try {
			goo = new FileOutputStream(new File(filekho));
			hoo = new ObjectOutputStream(goo);
			hoo.writeObject(dsnhapkho);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream1(goo);
			CloseStream1(hoo);
		}
	}
	public phieunhap[] read1() {
		phieunhap[] dsctn =  new phieunhap[1000];
		FileInputStream gii = null;
		ObjectInputStream hii = null;
		try {
			gii = new FileInputStream(new File(filekho));
			hii = new ObjectInputStream(gii);
			dsctn = (phieunhap[]) hii.readObject();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			CloseStream1(gii);
			CloseStream1(hii);
		}
		return dsctn;
	}
	public void CloseStream1(OutputStream oo) {
		if(oo!=null) {
			try {
				oo.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void CloseStream1(InputStream ii) {
		if(ii!=null) {
			try {
				ii.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
