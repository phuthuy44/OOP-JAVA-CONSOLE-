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

public class filekh {
	private static final String filekh ="khachhang12.txt";
	public KhachHang[] readkh;
	public void writekh(KhachHang[] arrkh) {
		FileOutputStream ces = null;
		ObjectOutputStream ges =null;
		try {
			ces = new FileOutputStream(new File(filekh));
			ges = new ObjectOutputStream(ces);
			ges.writeObject(arrkh);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream(ces);
			CloseStream(ges);
		}
	}
	public KhachHang[] readkh() {
		KhachHang[] arrkh = new KhachHang[10000];
		FileInputStream csa = null;
		ObjectInputStream gsa = null;
		try {
			csa = new FileInputStream(new File(filekh));
			gsa = new ObjectInputStream(csa);
			arrkh = (KhachHang[]) gsa.readObject();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			CloseStream(csa);
			CloseStream(gsa);
		}
		return arrkh;
	}
	public void CloseStream(OutputStream es)
	{
			if(es!=null)
			
			{
					try 
					{
						es.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
	}
	public void CloseStream(InputStream sa)
	{
			if(sa!=null)
			
			{
					try 
					{
						sa.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
		}

}
