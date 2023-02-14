package SeccionPOOClasesObjetos;

public class Automovil {
    /************ PROPERTIES (atributos) ***********/
    private int id;
    private String fabricante;
    private String modelo;
    // private String color; lo paso a enum
    private Color color;
    private double cilindrada;
    private int capacidadTanque = 40;

    private TipoAutomovil tipo;
    // Atributos STATIC
    private static int capacidadTanqueEstatico = 30;
    private static Color colorPatente = Color.NARANJA;
    private static int ultimoId;
    // Atributo constante -> FINAL
    // Se define y asigna valor
    // Suele ser public, como una variable de ambiente
    // Van en mayúscula, separadas por _ en palabra compuesta
    // son solo de lectura, no se modifican
    // Se usan con enum
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int  VELOCIDAD_MAXIMA_CIUDAD = 60;

    /* Todas estas constantes de colores las paso al enum Color*/
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_VERDE = "Verde";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";


    /*************** MÉTODOS (funcionalidades) ************/

    /******************** CONSTRUCTORES *******************/
    /* Constructor vacío */
    public Automovil() {
        this.id = ++ultimoId;
    }
    /* Sobrecarga de constructor */
    public Automovil(String fabricante) {
        this();
        this.fabricante = fabricante;
    }
    public Automovil(String fabricante, String modelo) {
        // En vez de -> this.fabricante = fabricante; - utilizo el constructor de arriba
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        // this.fabricante = fabricante;
        // this.modelo = modelo;
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        //this.cilindrada = cilindrada;
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    /************* SETTERS -> setAtributo *******************/

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color= color;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    /************* GETTERS -> getAtributo *******************/
    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Color getColor() {
        return this.color;
    }

    public int getCapacidadTanque() {
        return this.capacidadTanque;
    }

    public double getCilindrada() {
        return this.cilindrada;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    /* lombok*/
    /***** Métodos de operación *******/
    public String detalle() {
        return "\nauto.id = " + this.id +
            "\nauto.fabricante = " + this.getFabricante() +
            "\nauto.modelo = " + this.getModelo() +
            "\nauto.tipo = " + this.getTipo().getDescripcion() +
            "\nauto.color = " + this.color.getColor() +
            "\nauto.patenteColor = "   + this.colorPatente.getColor()  +
            "\nauto.cilindrada = " + this.getCilindrada();
    }

    public String acelerar(int rpm) {
        return "El auto" + this.fabricante + " acelerando a " + rpm + " rpm.";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando.";
    }

   public String acelararFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.capacidadTanque * porcentajeBencina );
    }

    // Sobre carga de métodos, al mismo método, le paso distintos parámetros
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (this.capacidadTanque * (porcentajeBencina/100f));
    }
    public static float calcularConsumoEstatico(int km, float porcentajeBencina) {
        return km / (Automovil.capacidadTanqueEstatico * (porcentajeBencina / 100f));
    }

    /******* POLIMORFISMO **********/
    // Sobre escritura de métodos de la clase padre
    // Generate -> Override Method
    @Override // indico que sobreescribo
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil)obj;
        return (this.fabricante != null &&  this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals((a.modelo)));
    }

    @Override
    public String toString() {
        return "Automovil{ " +
                "id=' " + id + '\'' +
                "fabricante=' " + fabricante + '\'' +
                ", modelo=' " + modelo + '\'' +
                ", color=' " + color + '\'' +
                '}';
    }
}