package W1D2;

public class Rettangolo {
	private double base;
	private double altezza;
	
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double perimetro() {
    	return (base+altezza)*2;
    }
    
    public double area() {
    	return base*altezza;
    }
}
