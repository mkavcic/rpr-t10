package ba.unsa.etf.rpr.tutorijal09;

import java.util.ArrayList;

public class GeografijaDAO {
    ArrayList<Grad> gradovi=new ArrayList<>();
    ArrayList<Drzava> drzave=new ArrayList<>();
    private static GeografijaDAO instanca=null;


    public static GeografijaDAO getInstance() {
        if(instanca==null) initialize();
    }

    Grad GlavniGrad(String drzava){
        Grad g=new Grad();
        return g;
    }

    void obrisiDrzavu(String drzava){}

    ArrayList<Grad> gradovi(){
        ArrayList<Grad> a=new ArrayList<>();
        return a;
    }

    void dodajGrad(Grad grad){

    }

    void dodajDrzavu(Drzava drzava){

    }

    void izmijeniGrad(Grad grad){

    }

    Drzava nadjiDrzavu(){
        Drzava d=new Drzava();
        return d;
    }

    String ispisiGradove(){
        String c="";
        return c;
    }

    void glavniGrad(){

    }
}
