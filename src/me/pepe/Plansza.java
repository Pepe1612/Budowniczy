package me.pepe;

public class Plansza {

    private int rozmiarPlanszy;
    private int liczbaPrzeszkod;

    Plansza(int rozmiarPlanszy){
        this.rozmiarPlanszy = rozmiarPlanszy;

        //towrzenie planszy
        boolean plansza[][] = new boolean[rozmiarPlanszy][rozmiarPlanszy];

        //zerowanie planszy
        for(int i = 0; i < rozmiarPlanszy; i++)
            for(int j = 0; j < rozmiarPlanszy; j++)
                plansza[i][j] = false;
    }
}
