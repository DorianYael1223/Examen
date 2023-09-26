package Examen;

public class Main {
            public static void main(String[] args) {
                EmpleadoVendedor vendedor = new EmpleadoVendedor("RFC123", "Gómez", "Juan", 6000.0, 0.08);
        
                vendedor.MostrarInformacion();
        
                vendedor.Ingresos();
                vendedor.Bonificacion();
                vendedor.Descuento();
                vendedor.sueldoNeto();
        
                System.out.println("-----------------------");
        
                EmpleadoPermanente permanente = new EmpleadoPermanente("RFC456", "López", "María", 3000.0, true);
        
                permanente.MostrarInformacion();
        
                System.out.println("Sueldo Base: " + permanente.getSueldoBase());
                System.out.println("Descuento Basado en NSS: " + permanente.DescuentoBasado());
                System.out.println("Sueldo Neto: " + permanente.SueldoNeto());
            }
        }
