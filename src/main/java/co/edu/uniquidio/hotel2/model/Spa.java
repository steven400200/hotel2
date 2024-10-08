package co.edu.uniquidio.hotel2.model;
import co.edu.uniquidio.hotel2.model.builder.SpaBuilder;

public class Spa extends Servicio{
    static final double precio=20.0;

    public Spa(int diasContratados) {
        super(diasContratados);
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de spa consumido");
    }

    public static SpaBuilder builder(){
        return new SpaBuilder();
    }
    @Override
    public String toString() {
        return "Spa: Precio: $" + precio + super.toString();
    }

    @Override
    public String mostarTipo() {
       return "spa";
    }


}
