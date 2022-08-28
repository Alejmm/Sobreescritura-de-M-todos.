package ligadura.dinamica;

import ligadura.dinamica.Vehiculo;

public class Taxi extends Vehiculo {
    String nombreConductor;
    int numePlazas;

    public Taxi () {
        super ();
        nombreConductor = "";
        numePlazas = 0;
    }


    public Taxi(String placas, int numeRuedas, String nombreConductor, int numePlazas) {
        super(placas, numeRuedas);
        this.nombreConductor = nombreConductor;
        this.numePlazas = numePlazas;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getNumePlazas() {
        return numePlazas;
    }

    public void setNumePlazas(int numePlazas) {
        this.numePlazas = numePlazas;
    }

    public String toString () {
        super.toString();
        String mensaje = "El nombre del conductor es " + getNombreConductor() + " y el taxi posee " + getNumePlazas() + " plazas";
        return mensaje;
    }
}
