package SeccionPOOClasesObjetos;

public class Motor {
    private double cilindrada;
    private TipoMotor tipo;

    public Motor() {
    }
    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilibrada) {
        this.cilindrada = cilibrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}