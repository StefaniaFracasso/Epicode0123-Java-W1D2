package W1D2;

public class MainEsercizio1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rettangolo rettangolo1 = new Rettangolo (12,7);
        Rettangolo rettangolo2 = new Rettangolo (4.5, 9.6);
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("perimetro:" + rettangolo.perimetro() + ", Area:" + rettangolo.area() );
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo1:");
        stampaRettangolo(rettangolo1);
        System.out.println("Rettangolo2:");
        stampaRettangolo(rettangolo2);
        System.out.println("Somma delle aree: " + (rettangolo1.area() + rettangolo2.area()));
        System.out.println("Somma dei perimetri: " + (rettangolo1.perimetro() + rettangolo2.perimetro()));
    }
}