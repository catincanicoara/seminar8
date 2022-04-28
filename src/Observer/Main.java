package Observer;

public class Main {
    //1. Instantiere obiecte UpdateServer
    //2. ob carOS
    //3. Adaugare ob in lista de observere
    public static void main(String[] args) {
        OS masina1 = new CarOS();
        OS masina2 = new CarOS();
        OS masina3 = new CarOS();
        UpdateServer updateServer = new UpdateServer("update1");

        updateServer.addObs(masina1);
        updateServer.addObs(masina2);
        updateServer.addObs(masina3);

        updateServer.pushUpdate();
    }

}
