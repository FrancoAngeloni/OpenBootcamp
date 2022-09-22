package com.company;

public class autos {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println(miCoche.puertas);
    }
}
    class Coche {
        public int puertas =0;
        public void masPuertas() {
            this.puertas++;
        }
    }



