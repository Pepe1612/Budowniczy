package me.pepe;

public class Plansza {

    private int rozmiarPlanszy;
    private int liczbaPrzeszkod;
    private boolean plansza[][];

    Plansza(int rozmiarPlanszy){
        this.rozmiarPlanszy = rozmiarPlanszy;

        //towrzenie planszy
        plansza = new boolean[rozmiarPlanszy][rozmiarPlanszy];

        //zerowanie planszy
        for(int i = 0; i < rozmiarPlanszy; i++)
            for(int j = 0; j < rozmiarPlanszy; j++)
                plansza[i][j] = false;
    }

    public int getRozmiarPlanszy(){
        return rozmiarPlanszy;
    }

    public boolean[][] getPlansza(){
        return plansza;
    }

    void ustawPrzeszkode(int x, int y){
        plansza[x][y] = true;
    }
}
