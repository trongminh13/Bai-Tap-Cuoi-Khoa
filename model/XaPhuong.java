/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfile.model;

/**
 *
 * @author Asus
 */
public class XaPhuong {

    private String tinhThanh;
    private String QuanHuyen;
    private String xaPhuong;

    public XaPhuong(String tinhThanh, String QuanHuyen, String xaPhuong) {
        this.tinhThanh = tinhThanh;
        this.QuanHuyen = QuanHuyen;
        this.xaPhuong = xaPhuong;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public String getQuanHuyen() {
        return QuanHuyen;
    }

    public void setQuanHuyen(String QuanHuyen) {
        this.QuanHuyen = QuanHuyen;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    
}