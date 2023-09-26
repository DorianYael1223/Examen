package Examen;

public class EmpleadoPermanente extends Persona {
    private double sueldoBase;
    private boolean nss;
    private double descuentoB;

    public EmpleadoPermanente(String rfc, String apellidos, String nombres, double sueldoBase, boolean nss) {
        super(rfc, apellidos, nombres);
        this.sueldoBase = sueldoBase;
        this.nss = nss;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public boolean getNss() {
        return nss;
    }

    public double Sueldo(){
        return sueldoBase;
    }
    
    public double  DescuentoBasado(){
        if(nss == true){
           descuentoB = sueldoBase * 0.11;
        return descuentoB;
        }else if (nss == false){
            System.out.println("No tiene descuento");
        }
        return descuentoB;
    }
    public double SueldoNeto(){
        double sueldoNeto ;
        sueldoNeto = Sueldo() - descuentoB;
        return sueldoNeto;
    } 
}
