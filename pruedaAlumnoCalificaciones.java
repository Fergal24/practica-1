public class pruedaAlumnoCalificaciones {
    public static void main (String[] args) {
        alumno alumno1 = new alumno ();
        alumno1.establecerNoCuentas("20103601");
        alumno1.establecerNombre("juan pelez");
        alumno1.establecerAsignatura("programacion 1");
        alumno1.establecerParciales(10.0, 1.5);
        System.out.println((alumno1.obtenerDatos()));
        System.out.println("-----------------------------------------------------------------");
    
           alumno alumno2 = new alumno();
           alumno2.establecerNoCuentas("20103602");
           alumno2.establecerNombre("Maria Lopez");
           alumno2.establecerAsignatura("Programacion 1");
           alumno2.establecerParciales(8.0, 8.5);
           System.out.println((alumno2.obtenerDatos()));
           System.out.println("-----------------------------------------------------------------");
    
              alumno alumno3 = new alumno();
        alumno3.establecerNoCuentas("2124670");
        alumno3.establecerNombre("miguel lopez");
        alumno3.establecerAsignatura("programacion 1");
        alumno3.establecerParciales(8.0, 9.0);
        System.out.println(alumno3.obtenerDatos());
        System.out.println("-----------------------------------------------------------------");
        
         alumno alumno4 = new alumno();
         alumno4.establecerNoCuentas("281826373");
         alumno4.establecerNombre("karla mendoza");
         alumno4.establecerAsignatura("programacion 1");
         alumno4.establecerParciales(6.0, 5.0);
         System.out.println(alumno4.obtenerDatos());
         System.out.println("-----------------------------------------------------------------");
    }
}