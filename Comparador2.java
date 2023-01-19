import java.util.Comparator;

public class Comparador2 implements Comparator<Archivos> {

    @Override
    public int compare(Archivos s1, Archivos s2) {
        return (-s1.nombre.compareTo(s2.nombre));
    }
}