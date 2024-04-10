/*Scrivere un programma che contenga una interfaccia Forma ed un
metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed
implementano il metodo per il calcolo dell'area.*/

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3,5);
        Triangolo triangolo = new Triangolo(3,5);

        System.out.println("L'area del rettangolo è " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è " + triangolo.calcolaArea());
    }
}