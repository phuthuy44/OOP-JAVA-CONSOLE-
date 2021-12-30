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
public class filexuathang {
    private static final String filexuat = "xuatkho.txt";
	public PhieuXuat[] read2;

	public void writexuat1(PhieuXuat[] dsPhieuXuat)
	{
		FileOutputStream goo = null;
		ObjectOutputStream hoo =null;
		try {
			goo = new FileOutputStream(new File(filexuat));
			hoo = new ObjectOutputStream(goo);
			hoo.writeObject(dsPhieuXuat);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			CloseStream1(goo);
			CloseStream1(hoo);
		}
	}
	public PhieuXuat[] read2() {
		PhieuXuat[] dsctx =  new PhieuXuat[1000];
		FileInputStream gii = null;
		ObjectInputStream hii = null;
		try {
			gii = new FileInputStream(new File(filexuat));
			hii = new ObjectInputStream(gii);
			dsctx = (PhieuXuat[]) hii.readObject();
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
		return dsctx;
	}
	public static void CloseStream1(OutputStream oo) {
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
  private static final String filexuat1="xuatkho1.txt";
  public chitietxuat[] read4;
  public  void writexuat(chitietxuat[] dsctx){
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {
        fos = new FileOutputStream(new File(filexuat1));
        oos = new ObjectOutputStream(fos);
        oos.writeObject(dsctx);
    }catch(FileNotFoundException e) {
        e.printStackTrace();
    }catch(IOException e) {
        e.printStackTrace();
    }finally {
        CloseStream(fos);
        CloseStream(oos);
    }
  }
  public  chitietxuat[] read4() {
    chitietxuat[] dsctx= new chitietxuat[1000];
     FileInputStream fis = null;
     ObjectInputStream ois = null;
     try {
         fis = new FileInputStream(new File(filexuat1));
         ois = new ObjectInputStream(fis);
         dsctx = (chitietxuat[]) ois.readObject();   
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
     return dsctx;
  }
      private static void CloseStream(OutputStream os)
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