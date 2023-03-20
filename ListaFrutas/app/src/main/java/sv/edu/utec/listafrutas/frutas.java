package sv.edu.utec.listafrutas;

public class frutas {
    private String nombre;
    private String desc;
    public frutas(String nombre, String desc) {
        this.nombre=nombre;
        this.desc=desc;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDesc() {
        return desc;
    }
}
