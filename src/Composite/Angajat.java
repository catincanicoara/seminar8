package Composite;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements iAngajat{
    public String nume;
    public int cod;
    public float salariu;
    public List<Angajat> listaSubordonati = new ArrayList<>();

    public Angajat(String nume, int cod, float salariu, List<Angajat> listaSubordonati) {
        this.nume = nume;
        this.cod = cod;
        this.salariu = salariu;
        this.listaSubordonati = listaSubordonati;
    }


    @Override
    public void printDetalii() {
        for (Angajat a:listaSubordonati) {
            System.out.println(a.nume);
        }
    }

    public void addSubordonat(iAngajat iAngajat){
        listaSubordonati.add((Angajat) iAngajat);
    }

    public void delSubordonat(iAngajat iAngajat){
        listaSubordonati.remove(iAngajat);
    }


    //nume, cod, salariu, listaSubordonati
    //+constructor cu parametrii
    //printDetalii()
    //lista de noduri copil
    //stocam sub forma unei liste listaSubordonati ->obiecte de tip iAngajat
    //+addSubordonat(iAngajat)
    //+delSubordonat(iAngajat)
}
