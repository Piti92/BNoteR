/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Database {
    List <Rekord> lista;
    String path = "";
    int index = 0;
    public Database()
    {
        this.lista = new ArrayList<>();
    }
    void triggerAdd()   {
        AddRecordFrame arf = new AddRecordFrame(lista.size());
        arf.setVisible(true);
    }
    void triggerEdit()  {
    EditRecordFrame erf = new EditRecordFrame();
        erf.setVisible(true);
    }
    void triggerDelete(){
    DeleteRecordFrame drf = new DeleteRecordFrame();
        drf.setVisible(true);
    }
    
    void remove(){}
    void showAll(){}
    void showSpecified(){}
    void save(){}
    void load(){}
    void addRecord(Rekord r){
        lista.add(r);
        index++;
        
    }
    
}
