package SeccionPOOClasesObjetos;

import java.util.Arrays;

public class Auto implements Comparable<Auto> { // Comparable es un INTERFAZ propia de Java, uso Generic para no castear Object a Auto
    /************ PROPERTIES (atributos) ***********/
    private int id;
    private String fabricante;
    private String modelo;
    // private String color; lo paso a enum
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas = 0;

    private TipoAutomovil tipo;
    // Atributos STATIC
    private static int capacidadTanqueEstatico = 30;
    private static Color colorPatente = Color.NARANJA;
    private static int ultimoId;


    /*************** MÉTODOS (funcionalidades) ************/

    /******************** CONSTRUCTORES *******************/
    /* Constructor vacío */
    public Auto() {

        this.id = ++ultimoId; // para que el ID sea autoincremental
        this.ruedas = new Rueda[5];
    }
    /* Sobrecarga de constructor */
    public Auto(String fabricante) {
        this();
        this.fabricante = fabricante;
    }
    public Auto(String fabricante, String modelo) {
        this(fabricante);
        this.modelo = modelo;
    }

    public Auto(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Auto(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Auto(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Auto( String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas, TipoAutomovil tipo) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setCapacidadTanque(Estanque estanque) {
        this.estanque = estanque;
    }
    public static void setColorPatente(Color colorPatente) {
        Auto.colorPatente = colorPatente;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Auto.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRueda(Rueda rueda) { // Para agregar ruedas de a una
        if(indiceRuedas < this.ruedas.length) { // asi no agrego más de 5, como tengo inicializado el atributo
            this.ruedas[indiceRuedas++] = rueda;
        }
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
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

    public Motor getMotor() {
        return this.motor;
    }

    public Estanque getEstanque() {
        if(estanque == null) {
            this.estanque = new Estanque();
        }
        return this.estanque;
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
        String detalle = "Automovil { " +  "id= " + id + " , fabricante= " + fabricante +
                ", modelo= " + modelo;

        if(this.getTipo() != null) {
            detalle += " , tipo =" + this.getTipo().getDescripcion();
        }

        detalle += ", color= " + color + " , patenteColor = " + colorPatente;

        if(this.motor != null) {
            detalle +=" , cilindrara = " + this.motor.getCilindrada();
        }

        if(this.conductor != null) {
            detalle += " , conductor = " + this.conductor;
        }

        return detalle;
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
        return km / (this.estanque.getCapacidad() * porcentajeBencina );
    }

    // Sobre carga de métodos, al mismo método, le paso distintos parámetros
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (this.estanque.getCapacidad() * (porcentajeBencina/100f));
    }
    public static float calcularConsumoEstatico(int km, float porcentajeBencina) {
        return km / (Auto.capacidadTanqueEstatico * (porcentajeBencina / 100f));
    }

    /******* POLIMORFISMO **********/
    // Sobre escritura de métodos de la clase padre
    // Generate -> Override Method
    @Override // indico que sobreescribo
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Auto)) {
            return false;
        }
        Auto a = (Auto)obj;
        return (this.fabricante != null &&  this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals((a.modelo)));
    }
    /******** TO STRING **********/
    @Override
    public String toString() {
        return "Auto { " +
                "id= " + id +
                ", fabricante= '" + fabricante + '\'' +
                ", modelo= '" + modelo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Auto obj) { // el CONTRATO por implementar la Interfaz Comparable
        return fabricante.compareTo(obj.fabricante);
    }
}