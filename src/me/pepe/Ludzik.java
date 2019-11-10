package me.pepe;

public class Ludzik {

    private int xLudzika, yLudzika;
    private int przeszkodyLudzika = 0;
    private Plansza klasaPlansza;

    public int getPrzeszkodyLudzika(){
        return przeszkodyLudzika;
    }

    Ludzik(int x, int y, Plansza klasaPlansza) {
        this.xLudzika = x;
        this.yLudzika = y;
        this.klasaPlansza = klasaPlansza;
    }

    void idzPrawo(){
        while(true){
            if(xLudzika + 1 < klasaPlansza.getRozmiarPlanszy() && klasaPlansza.getPlansza()[xLudzika+1][yLudzika] == false){
                klasaPlansza.getPlansza()[xLudzika][yLudzika] = true;
                przeszkodyLudzika++;
                xLudzika++;
            }
            else break;
        }
    }

    void idzLewo(){
        while(true){
            if(xLudzika - 1 >= 0 && klasaPlansza.getPlansza()[xLudzika-1][yLudzika] == false){
                klasaPlansza.getPlansza()[xLudzika][yLudzika] = true;
                przeszkodyLudzika++;
                xLudzika--;
            }
            else break;
        }
    }

    void idzDol(){
        while(true){
            if(yLudzika + 1 < klasaPlansza.getRozmiarPlanszy() && klasaPlansza.getPlansza()[xLudzika][yLudzika+1] == false){
                klasaPlansza.getPlansza()[xLudzika][yLudzika] = true;
                przeszkodyLudzika++;
                yLudzika++;
            }
            else break;
        }
    }

    void idzGore(){
        while(true){
            if(yLudzika - 1 >= 0 && klasaPlansza.getPlansza()[xLudzika][yLudzika-1] == false){
                klasaPlansza.getPlansza()[xLudzika][yLudzika] = true;
                przeszkodyLudzika++;
                yLudzika--;
            }
            else break;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(this.xLudzika) +
                " " +Integer.toString(this.yLudzika);
    }
}