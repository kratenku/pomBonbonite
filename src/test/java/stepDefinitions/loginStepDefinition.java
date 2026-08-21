package stepDefinitions;

import co.com.bon.bonite.page.loginPage;
import co.com.bon.bonite.page.registroPage;
import co.com.bon.bonite.dto.registroDTO;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Dado;

public class loginStepDefinition {

    private final loginPage modificar;
    private registroDTO modeloRegistro;

    public loginStepDefinition() throws Exception {
        this.modificar = new loginPage();
        this.modeloRegistro = new registroDTO("", "", "", "", "", "","","","","");
    }

    @Cuando("Ingreso a datos y modifico telefono {}")
    public void ingresoDatos(String telefono) {
        modificar.selecctorPerfilDato();

        modeloRegistro.setTelefono(telefono);
        modificar.infoCambioTlefono(modeloRegistro.getTelefono());
    }

    @Y("selecciono boton de guardar")
    public void seleccionarGuardar(){
        modificar.seleccionarGuardar();
    }

    @Entonces("valido el mensaje {string}")
    public void seleccionMensaje(String mensaje) throws InterruptedException {
        modeloRegistro.setMensaje(mensaje);
        modificar.mensajeActualizacion(modeloRegistro.getMensaje());
    }


}
