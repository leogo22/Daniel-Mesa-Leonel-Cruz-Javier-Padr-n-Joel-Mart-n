class Main {
public static void main(String[] args) {
        
        Archivos a1 = new Archivos("Archivo a", 10);
        Archivos a2 = new Archivos("Archivo b1", 20);
        Archivos a3 = new Archivos("Archivo b9", 11);
        Archivos a4 = new Archivos("Archivo b3", 5);
        Archivos a5 = new Archivos("Archivo x", 30);
        Archivos a6 = new Archivos("Archivo k", 9);
        
        Carpeta c1 = new Carpeta("Carpeta a");
        Carpeta c2 = new Carpeta("Carpeta c");
        Carpeta c3 = new Carpeta("Carpeta b");
        Carpeta c4 = new Carpeta("Carpeta z");
        Carpeta c5 = new Carpeta("Carpeta g");
        Carpeta c6 = new Carpeta("Carpeta k");

        
        c1.agregarArchivo(a1);
        c1.agregarArchivo(a4);
        c1.agregarArchivo(a5);
        
        c2.agregarArchivo(a2);
        c2.agregarArchivo(a3);
        c2.agregarArchivo(a6);

        c1.agregarCarpeta(c2);
        c1.agregarCarpeta(c5);
        c1.agregarCarpeta(c6);
        
        c2.agregarCarpeta(c3);
        c2.agregarCarpeta(c4);
        
        a1.agregarIcono(new Archivos("Archivo a - icono", 5));
        a3.agregarIcono(new Archivos("Archivo a - icono", 5));

        c1.mostrarDirectorio();
        
    }
}