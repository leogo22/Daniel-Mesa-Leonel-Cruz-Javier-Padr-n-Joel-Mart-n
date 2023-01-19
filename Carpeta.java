import java.util.TreeSet;
public class Carpeta{
  protected String nombre;
    TreeSet<Carpeta> tscarpetas;
    TreeSet<Archivos> tsarchivo;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        tsarchivo = new TreeSet<>(new Comparador2());
        tscarpetas = new TreeSet<>(new Comparador());
    }

    public void mostrarDirectorio() {
        
        if (tscarpetas.isEmpty() && tsarchivo.isEmpty()) {
            System.out.println("El directorio de la carpeta "+this.nombre+" esta vacio");
        } else{
        System.out.println("Directorio de la carpeta " + this.nombre+ ":\n");
        tscarpetas.forEach(car -> System.out.println(car.nombre));
        System.out.println("");
        tsarchivo.forEach(ar -> System.out.println(ar.nombre));
        }
    }

    public void agregarCarpeta(Carpeta c) {
        tscarpetas.add(c);
    }

    public void agregarArchivo(Archivos ar) {
        tsarchivo.add(ar);
    }
}