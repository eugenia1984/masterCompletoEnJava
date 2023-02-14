package SeccionPOOClasesObjetos;

public enum Color {
    /* Un enum es una colección de atributos constantes */
    // se escriben siempre en mayúscula y separan con coma
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    GRIS("Gris Oscuro"),
    NARANJA("Naranje");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}