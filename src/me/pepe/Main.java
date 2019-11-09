package me.pepe;

public class Main {

    public static void main(String[] args) {
        Plansza plansza = new Plansza(10);
        Ludzik ludzik = new Ludzik(1, 1, plansza);
        plansza.ustawPrzeszkode(3, 1);
        ludzik.idzPrawo();
        System.out.println(ludzik.getPrzeszkodyLudzika());
    }
}
