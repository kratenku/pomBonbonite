package stepDefinitions;

import co.com.bon.bonite.page.registroPage;
import co.com.bon.bonite.dto.registroDTO;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Dado;


public class registroStepDefinition {

    private final registroPage pageRegistro;
    private registroDTO modeloRegistro;

    public registroStepDefinition() throws Exception {
            this.pageRegistro = new registroPage();
            this.modeloRegistro = new registroDTO("", "", "", "", "", "","","");
    }

    @Dado("el usuario selecciona el boton de registro")
    public void ingresoRegistro(){
        this.pageRegistro.ingresarRegistro();
    }

    @Cuando("Ingresa los siguientes datos: Cédula{string}, Nombres {string}, Apellidos {string}, correo {string}, contraseña {string}")
    public void ingresoDataRegistro(String cedula, String nombres, String apellido, String correo, String contrasenia){

        modeloRegistro.setCedula(cedula);
        pageRegistro.ingresarCedula (modeloRegistro.getCedula());

        modeloRegistro.setNombres(nombres);
        pageRegistro.ingresarNombre(modeloRegistro.getCedula());

        modeloRegistro.setApellidos(apellido);
        pageRegistro.ingresarApellido(modeloRegistro.getApellidos());

        modeloRegistro.setCorreo(correo);
        pageRegistro.ingresarCorreo(modeloRegistro.getCorreo());

        modeloRegistro.setContrasenia(contrasenia);
        pageRegistro.ingresarContrasenia(modeloRegistro.getContrasenia());

        modeloRegistro.setContrasenia(contrasenia);
        pageRegistro.repetirContrasenia(modeloRegistro.getContrasenia());

    }

    @Y("Seleccionar boton de aceptar condicion y boton de registrar")
    public void ingresarCondicionRegistrar(){
        pageRegistro.aceptarPolitica();
        pageRegistro.registrarmeButtom();
    }

    @Entonces("Validar mensaje de registro exitoso usuario {string}")
    public void ingresarAssertPostRegistro(String usuario){

        modeloRegistro.setCedula(usuario);
        pageRegistro.asserUser(modeloRegistro.getCedula());
    }



}
