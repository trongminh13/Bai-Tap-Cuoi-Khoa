/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfile.concurrency;

import java.util.List;
import javax.swing.JProgressBar;
import finalfile.model.Datum;

/**
 *
 * @author Asus
 */
public class ProgressBarThread implements Runnable {

    JProgressBar progessbar;
    List<Datum> data;
    UpdateTableThread udThread;
    Thread updateTable;
    

    public ProgressBarThread(JProgressBar progessbar, List<Datum> data) {
        this.progessbar = progessbar;
        this.data = data;

    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
