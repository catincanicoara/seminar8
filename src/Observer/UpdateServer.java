package Observer;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    //updatePackage: String
    //listObservers: lista de sisteme de operare(OS)
    //+addObs()
    //+delServer()
    //pushUpdate() -> trimite updatePackage catre toate serverele din lista, parcurge lista si seteaza informatia pe fiecare obiect

    public String updatePackage;
    public List<OS> listaOs = new ArrayList<>();

    public UpdateServer(String updatePackage) {
        this.updatePackage = updatePackage;
    }

    public void addObs(OS os){
        listaOs.add(os);
    }

    public void delObs(OS os){
        listaOs.remove(os);
    }

    public void pushUpdate(){
        for (OS os:listaOs) {
            os.update(updatePackage);
        }
    }
}
