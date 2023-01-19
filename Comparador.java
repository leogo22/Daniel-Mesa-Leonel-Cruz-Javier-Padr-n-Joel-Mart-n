
import java.util.Comparator;

public class Comparador implements Comparator<Carpeta> {

    @Override
    public int compare(Carpeta s1, Carpeta s2) {
        return (-s1.nombre.compareTo(s2.nombre));
    }
}