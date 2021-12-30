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

public class FILE {
      private static final String filebanhang = "quanlybanhang.txt";
       public SanPham[] readSP;
        
      public void writesanpham(SanPham[] banhang) 
        {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                fos = new FileOutputStream(new File(filebanhang));
                oos = new ObjectOutputStream(fos);
                oos.writeObject(banhang);
            }catch(FileNotFoundException e) {
                e.printStackTrace();
            }catch(IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fos.close();
                } catch (IOException e) {
                    
                    e.printStackTrace();
                }
                try {
                    oos.close();
                } catch (IOException e) {
               
                    e.printStackTrace();
                }
            }
        }
   public  SanPham[] readSP() {
        SanPham[] banhang= new SanPham[1000];
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(filebanhang));
            ois = new ObjectInputStream(fis);
           banhang = (SanPham[]) ois.readObject();   
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
            try {
                ois.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }
        return banhang;
     }
     private static final String fileDM = "quanlyDM.txt";
     public Danhmucsp[] readDM;
     public void writeDM(Danhmucsp[] DANHMUC) 
     {
         FileOutputStream fos = null;
         ObjectOutputStream oos = null;
         try {
             fos = new FileOutputStream(new File(fileDM));
             oos = new ObjectOutputStream(fos);
             oos.writeObject(DANHMUC);
         }catch(FileNotFoundException e) {
             e.printStackTrace();
         }catch(IOException e) {
             e.printStackTrace();
         }finally {
             CloseStream(fos);
             CloseStream(oos);
         }
     }
     public  Danhmucsp[] readDM() {
        Danhmucsp[] DANHMUC= new Danhmucsp[50000];
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(fileDM));
            ois = new ObjectInputStream(fis);
            DANHMUC= (Danhmucsp[]) ois.readObject();   
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
        return DANHMUC;
     }
    
     public void CloseStream(OutputStream os) {
    	 if(os!=null) {
    		 try {
    			 os.close();
    		 }catch(IOException e) {
    			 e.printStackTrace();
    		 }
    	 }
     }
     public void CloseStream(InputStream is) {
    	 if(is!=null) {
    		 try {
    			 is.close();
    		 }catch(IOException e) {
    			 e.printStackTrace();
    		 }
    	 }
     }

}



