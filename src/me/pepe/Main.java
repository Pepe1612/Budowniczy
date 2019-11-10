package me.pepe;

public class Main {

    public static void main(String[] args) {
        Plansza plansza = new Plansza(3);
        Ludzik ludzik = new Ludzik(0, 2, plansza);
        plansza.ustawPrzeszkode(1, 1);
        ludzik.idzPrawo();
        ludzik.idzGore();
        ludzik.idzLewo();
        ludzik.idzDol();
        System.out.println("Przeszkody:" + ludzik.getPrzeszkodyLudzika());
        System.out.println("x:" + ludzik.getxLudzika());
        System.out.println("y:" + ludzik.getyLudzika());
    }
}
