package demanagement;

public class Calcul {

    // Attributs
    private int cartons;
    private int camion;
    private int camion2;
    private int camionMax;
    private int camion2Max;

    //Constructreur(s)
    Calcul(int cartons, int camion, int camion2,  int camionMax, int camion2Max){
        this.cartons = cartons;
        if(camion == 0) {
            this.camion = camion;
        } else if(camion <= 9){
            System.out.println("Ah bon le camion n'est pas vide? ❤");
            this.camion = camion;
        } else {
            System.out.println("Ah Non le camion n'a que 9 places");
            this.camion = 0;
        }
        if(camion2 == 0) {
            this.camion2 = camion2;
        } else if (camion2 <= 20){
            System.out.println("Ah bon le camion 2 n'est pas vide?");
            this.camion2 = camion2;
        } else {
            System.out.println("Ah Non le camion 2 n'a que 20 places");
            this.camion2 = 0;
        }
        if(camionMax == 9 ) {
            this.camionMax = camionMax;
        }else {
            System.out.println("Non non, le camion a 9 places");
            this.camionMax = 9;
        }
        if(camion2Max == 20 ) {
            this.camion2Max = camion2Max;
        }else {
            System.out.println("Non non, le camion 2 a 20 places");
            this.camion2Max = 20;
        }
    }
    // Methodes
    private String sayVoyage(int camionEnCour, int numCamion) {

        return "un voyage du camion num " + numCamion + " de " + camionEnCour + " cartons";
    }

    public void chargement() {
            while (cartons > 0) {
                cartons--;
                camion++;
                if(cartons > 0) {
                    cartons--;
                    camion2++;
                }

                if(camion == camionMax || cartons == 0) {
                    System.out.println(this.sayVoyage(camion, 1));
                    camion = 0;
                }
                if(camion2 == camion2Max || cartons == 0) {
                    System.out.println(this.sayVoyage(camion2, 2));
                    camion2 = 0;
                }
            }

    }

    // Getters and Setters
    public int getCamion(){
        return camion;
    }

    public void setCamion(){
        camion++;
        if (camion >= 9){
            camion = 9;
        }
    }
}


