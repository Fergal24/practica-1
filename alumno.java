public class alumno {
    private String noCuenta;
    private String nombre;
    private String asignatura;
    private double parcial1;
    private double parcial2;
    private String estado;

    public void establecerNoCuentas(String cuentaA) {
        this.noCuenta = cuentaA;
    }

    public void establecerNombre(String nombreA) {
        this.nombre = nombreA;
    }

    public void establecerAsignatura(String asignaturaA) {
        this.asignatura = asignaturaA;
    }
    public void establecerParciales(double p1 , double p2) {
        this.parcial1 = p1;
        this.parcial2 = p2;
    }

    private double obtenerPromedio() {
        double promedio;
        promedio = (this.parcial1 + this.parcial2) / 2;
        return promedio;
    }

    private String obtenerEstado() {
        // promedio 8.0 a 10.0 EXENTO
        // promedio 6.0 A 7.9 ORDINARIO
        // promedio 0.0 A 5.9 EXTRAORDINARIO
        // promedio no esta en esos rangos poner INDEFINIDO
        estado = "INDEFINIDO";
        double promedio = obtenerPromedio();
        if (promedio>=8.0&& promedio <=10.0){
            estado="EXENTO";
        }else if(promedio>=6.0&&promedio<8.0){
            estado="ORDINARIO";
        }else if(promedio>=0.0&& promedio<6.0){
            estado="EXTRAORDINARIO";
        }
        return estado;
    }
    public String obtenerDatos() {
        return "Tu cuenta es " + this.noCuenta +
        ", tu asignatura es " + this.asignatura +
        "\n tus calificaciones son : " +
        "Primer parcial : " + this.parcial1 +
        ", Segundo parcial: " + this.parcial2 +
        ", tu promedio es " + obtenerPromedio () +
        "\nEstas en " + obtenerEstado();
    }
}





 
