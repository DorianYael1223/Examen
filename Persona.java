package Examen;

abstract class Persona {
    private String rfc;
    private String apellidos;
    private String nombres;
    public Persona(String rfc, String apellidos, String nombres ) {
        this.rfc = rfc;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    public String getRfc() {
        return rfc;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public void MostrarInformacion(){
        System.out.println("Nombre: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Rfc: " + rfc);
    }
}