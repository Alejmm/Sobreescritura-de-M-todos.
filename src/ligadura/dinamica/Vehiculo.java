package ligadura.dinamica;

    public class Vehiculo {
        private String placas;
        private int numeRuedas;

        public Vehiculo () {
            placas = "";
            numeRuedas = 0;
        }

        public Vehiculo(String placas, int numeRuedas) {
            this.placas = placas;
            this.numeRuedas = numeRuedas;
        }

        public String getPlacas() {
            return placas;
        }

        public void setPlacas(String placas) {
            this.placas = placas;
        }

        public int getNumeRuedas() {
            return numeRuedas;
        }

        public void setNumeRuedas(int numeRuedas) {
            this.numeRuedas = numeRuedas;
        }

        public String toString () {
            String info  = "La matrícula del vehículo es: " + getPlacas() + "\nEl vehículo tiene " + getNumeRuedas() + " ruedas";
            return info;
        }

}
