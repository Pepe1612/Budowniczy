package me.pepe;

public class Main {

    public static void main(String[] args) {
        Plansza plansza = new Plansza(2);
        Ludzik ludzik = new Ludzik(0, 0, plansza);
        plansza.ustawPrzeszkode(0, 0);
        ludzik.idzPrawo();
        ludzik.idzGore();
        ludzik.idzLewo();
        ludzik.idzDol();
        System.out.println(ludzik.getPrzeszkodyLudzika());
    }
}
