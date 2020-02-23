import java.util.Calendar;

public class Cliente {
    private  String Nombre;
    private String NIF;
    private  String correoelctronico;
    private Calendar fechaAlta;
    private double tarifa;

    public Cliente(String nombre, String NIF, String correoelctronico, Calendar fechaAlta, double tarifa) {
        this.Nombre = nombre;
        this.NIF = NIF;
        this.correoelctronico = correoelctronico;
        this.fechaAlta = fechaAlta;
        this.tarifa = tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}
