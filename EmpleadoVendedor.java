package Examen;

public class EmpleadoVendedor extends Persona {
    private double montoVendido;
    private double tasaComision;
    private double ingresos;
    private  double bonificacion;
    private  double descuentos;
    private  double sueldoNeto;

    
    public EmpleadoVendedor(String rfc, String apellidos, String nombres, double montoVendido, double tasaComision) {
        super(rfc, apellidos, nombres);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }
    public double getMontoVendido() {
        return montoVendido;
    }
    public double getTasaComision() {
        return tasaComision;
    }
    public void Ingresos(){
        ingresos = montoVendido * tasaComision;
        System.out.println("Ingresos: " + ingresos);
    }
    public void Bonificacion(){
        if(montoVendido < 1000){
            System.out.println("No tiene bonificacion");
        }else if(montoVendido > 1000 && montoVendido <5000){
            bonificacion = ingresos * 0.05;
            System.out.println("Su bonificacion es: " + bonificacion);
        }else if(montoVendido >5000){
            bonificacion = montoVendido * 0.10;
            System.out.println("Su bonificacion es: " + bonificacion);
        }
    }

    public void Descuento (){
        if(ingresos < 1000){
            descuentos = ingresos * 0.11;
            System.out.println("Descuento: " + descuentos);
        }
    }

    public void sueldoNeto(){
        sueldoNeto = ingresos + bonificacion - descuentos;
        System.out.println("Sueldo Neto: " + sueldoNeto);
    }
}
