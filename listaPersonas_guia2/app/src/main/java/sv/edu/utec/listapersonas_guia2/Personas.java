package sv.edu.utec.listapersonas_guia2;

public class Personas {
    private String nombre, direccion , edad;
    public Personas(String nombre,  String edad ,String direccion) {
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
}
