/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfile.data;

import com.google.gson.stream.JsonReader;
import finalfile.model.JsonResult;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Asus
 */
public class DataHelper {
    public static JsonResult readJsonFile(String path) {
        FileReader fr = null;
        JsonResult result = null;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataHelper.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DataHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
}
