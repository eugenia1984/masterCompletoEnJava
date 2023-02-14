package SeccionPOOClasesObjetos;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4 ),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHBACK("Hatchbak", "Auto compacto", 4),
    PICKUP("Pickup", "camioneta", 4),
    COUPE("Cpoupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto pequeño", 2),
    FURGON("Furgón", "Auto utilitario", 4);

    private final String nombre;
   private final int numeroPuertas;
   private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}