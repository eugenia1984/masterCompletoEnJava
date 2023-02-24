package SeccionPOOHerenciaClaseAbstracta;

import SeccionPOOHerenciaClaseAbstracta.elementos.*;
import SeccionPOOHerenciaClaseAbstracta.elementos.select.Opcion;
import SeccionPOOHerenciaClaseAbstracta.elementos.validador.EmailValidador;
import SeccionPOOHerenciaClaseAbstracta.elementos.validador.LargoValidador;
import SeccionPOOHerenciaClaseAbstracta.elementos.validador.NoNuloValidador;
import SeccionPOOHerenciaClaseAbstracta.elementos.validador.RequeridoValidador;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        // ElementoForm el = new ElementoForm();
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NoNuloValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1", "Java"))
        .addOpcion(new Opcion("2", "JavaScript"))
        .addOpcion(new Opcion("3", "Python"))
        .addOpcion(new Opcion("4", "TypeScript").setSelected())
        .addOpcion(new Opcion("5", "PHP"));

        /** Clase anonima **/
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value='" + this.valor + "' >";
            }
        };

        saludar.setValor("Hola que tal este campo está deshabilitado!");

        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@email.com");
        edad.setValor("20");
        experiencia.setValor("...más de 2 años de experiencia...");

        List<ElementoForm> elementos = Arrays.asList(username, password,email, edad, experiencia, lenguaje, saludar);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()) {
                //  e.getErrores().forEach(System.out::println);
                // e.getErrores().forEach(err -> System.out.println(err));
                e.getErrores().forEach(err -> System.out.println(e.getNombre() + " : " + err));
            }
        });
    }
}