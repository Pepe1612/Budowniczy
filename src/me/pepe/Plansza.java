package me.pepe;

public class Plansza {

    private int rozmiarPlanszy;
    private int liczbaPrzeszkod;
    private boolean plansza[][];

    public int getRozmiarPlanszy(){
        return rozmiarPlanszy;
    }

    public boolean[][] getPlansza(){
        return plansza;
    }

    Plansza(int rozmiarPlanszy){
        this.rozmiarPlanszy = rozmiarPlanszy;

        //towrzenie planszy
        plansza = new boolean[rozmiarPlanszy][rozmiarPlanszy];

        //zerowanie planszy
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                plansza[i][j] = false;
    }

    public void notifyWielkosc(){

    }

    void ustawPrzeszkode(int x, int y){
        plansza[x][y] = true;
    }
}
