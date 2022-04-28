package Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //1. CO membrii echipe
    //2. CO Team manager
    //3. Adaugare membri in obiectele team manager
    //4. CO. Project Manager
    //5. Add....
    //7. Add sefi departamente in ob CEO
    //Cel mai mare sa fie primul

    public static void main(String[] args) {
        //liste in plus
        List<Angajat> lista1 = new ArrayList<>();
        List<Angajat> lista2 = new ArrayList<>();
        List<Angajat> lista3 = new ArrayList<>();

        Angajat CO1 = new Angajat("Angajat1", 1, 123, lista1);
        Angajat CO2 = new Angajat("Angajat2", 2, 124, lista2);
        Angajat CO3 = new Angajat("Angajat3", 3, 125, lista3);

        Angajat TM1 = new Angajat("Angajat4", 4, 124, lista1);
        Angajat TM2 = new Angajat("Angajat5", 5, 125, lista2);
        Angajat TM3 = new Angajat("Angajat6", 6, 126, lista3);

        Angajat PM1 = new Angajat("Angajat7", 1, 123, lista1);
        Angajat PM2 = new Angajat("Angajat8", 1, 123, lista2);
        Angajat PM3 = new Angajat("Angajat9", 1, 123, lista3);

        Angajat sefDepartament1 = new Angajat("Angajat10", 1, 123, null);
        Angajat sefDepartament2 = new Angajat("Angajat11", 1, 123, null);
        Angajat sefDepartament3 = new Angajat("Angajat12", 1, 123, null);

        PM1.addSubordonat(sefDepartament1);
        PM2.addSubordonat(sefDepartament2);
        PM3.addSubordonat(sefDepartament3);

        TM1.addSubordonat(PM1);
        TM2.addSubordonat(PM2);
        TM3.addSubordonat(PM3);

        CO1.addSubordonat(TM1);
        CO2.addSubordonat(TM2);
        CO3.addSubordonat(TM3);

        CO1.printDetalii();
        //CO2.printDetalii();
        //CO3.printDetalii();
    }
}
