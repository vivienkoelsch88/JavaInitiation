package demenagement;

public class Calcul {
    int cartons = 34;
    int camion = 0;
    int camionMax = 9;

    public String sayVoyage() {
        return "un voyage de " + camion + " cartons";
    }

    public static String toto()
    {
        return "toto";
    }

    public void chargement() {

        while (cartons > 0) {
            while (camion < camionMax && cartons > 0) {
                cartons--;
                camion++;
            }
            System.out.println(this.sayVoyage());
            camion = 0;
        }
    }
}


