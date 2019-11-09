package me.pepe;

public class Plansza {

    private static int rozmiarPlanszy;
    private int liczbaPrzeszkod;
    private boolean plansza[][];


    Plansza(int rozmiarPlanszy){
        this.rozmiarPlanszy = rozmiarPlanszy;

        //towrzenie planszy
        plansza = new boolean[rozmiarPlanszy][rozmiarPlanszy];

        //zerowanie planszy
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                plansza[i][j] = false;
    }

    void ustawPrzeszkode(int x, int y){
        plansza[x][y] = true;
    }

    public static int getRozmiarPlanszy() {
        return rozmiarPlanszy;
    }
}
