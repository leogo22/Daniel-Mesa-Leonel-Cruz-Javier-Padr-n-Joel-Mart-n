public class Archivos{
   public String nombre;
    private int size;
    public Archivos icono;

    public Archivos(String nombre, int size) {
        this.nombre = nombre;
        this.size = size;
    }

    public void agregarIcono(Archivos a) {
        this.icono = a;
    }

    public String getNombre() {
        return nombre;
    }
}