/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfile.concurrency;

import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class UpdateTableThread implements Runnable {

    String tinhThanh;
    String QuanHuyen;
    String xaPhuong;
    JTable table;

    public UpdateTableThread(String tinhThanh, String QuanHuyen, String xaPhuong, JTable table) {
        this.tinhThanh = tinhThanh;
        this.QuanHuyen = QuanHuyen;
        this.xaPhuong = xaPhuong;
        this.table = table;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
