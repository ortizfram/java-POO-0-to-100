/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e20.Continente;

public enum Continente {
    AMERICA(0, 44444444),
    EUROPA(92832220, 555555555),
    AFRICA(234662, 22222222),
    ASIA(38100000l, 5555555),
    OCEANIA(27000000, 99999999),
    ANTARTICA(1000, 677777777);

    private long cantHabitantes;
    private double superficie;

    private Continente(long cantHabitantes, double superficie) {
        this.name();
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }

    public double densidadPob() {
        return this.cantHabitantes / this.superficie;
    }

    @Override
    public String toString() {
        return "Continente{" + "cantHabitantes=" + cantHabitantes + ", superficie=" + superficie + "}";
    }

}
