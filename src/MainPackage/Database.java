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
        this.lista = new ArrayList<Rekord>();
    }
    public void add(){
        lista.add(new Rekord(lista.size(), "element0"));
    }
    public void remove(){}
    public void edit(){}
    public void showAll(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).id + " " + lista.get(i).date);
        }
    }
    public void showSpecified(){}
    public void save(){}
    public void load(){}
}
