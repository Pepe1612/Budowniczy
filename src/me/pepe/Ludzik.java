package me.pepe;

import java.util.Scanner;

public class Ludzik {

    private int xLudzika, yLudzika;

    void setWspolrzedneLudzika(){
        Scanner odpowiedz = new Scanner(System.in);
        System.out.print("Podaj x ludzika:");
        this.xLudzika = odpowiedz.nextInt();
        System.out.print("Podaj y ludzika:");
        this.yLudzika = odpowiedz.nextInt();
    }

    @Override
    public String toString() {
        return Integer.toString(this.xLudzika) +
                " " +Integer.toString(this.yLudzika);
    }
}