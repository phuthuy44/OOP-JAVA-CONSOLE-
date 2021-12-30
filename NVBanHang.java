/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoAn;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */

public class NVBanHang extends NhanVien implements ChucVu,Serializable{
    @Override
    public void ChucVu(){
        this.ChucVu="Ban hang";
    }
    @Override
    public void Luong(){
        this.Luong="10.000.000D";
    }

}
