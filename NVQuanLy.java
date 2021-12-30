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
public class NVQuanLy extends NhanVien implements ChucVu,Serializable{
    @Override
    public void ChucVu(){
        this.ChucVu="Quan li";
    }
    @Override
    public void Luong(){
        this.Luong="15.000.000D";
    }
}
