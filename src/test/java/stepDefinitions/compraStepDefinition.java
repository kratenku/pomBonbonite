package stepDefinitions;

import co.com.bon.bonite.page.compraPage;
import co.com.bon.bonite.dto.registroDTO;
import co.com.bon.bonite.page.registroPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Dado;


public class compraStepDefinition {

    private final compraPage pageCompra;
    private registroDTO modeloRegistro;

    public compraStepDefinition() throws Exception {
        this.pageCompra = new compraPage();
        this.modeloRegistro = new registroDTO("", "", "", "", "", "","","","","");
    }


    @Dado("El usuario inicia sesión: Cédula {string}, contraseña {string}")
    public void iniciarSesion(String cedula, String Contrasenia) {
        //pageCompra.seleccionLogin();

        modeloRegistro.setCedula(cedula);
        pageCompra.seleccionDeUsuario(modeloRegistro.getCedula());

        modeloRegistro.setContrasenia(Contrasenia);
        pageCompra.seleccionarContrasenia(modeloRegistro.getContrasenia());

        pageCompra.seleccionSesion();

    }

    @Cuando("El usuario este en la pestaña home seleccione zapatos")
    public void seleccionarHomeZapatos(){
        pageCompra.seleccionModuloCompra();
    }


    @Y("Buscar descripcción del zapato {string}, seleccionar la imagen del producto")
    public void seleccionarProducto(String descripccion){
        modeloRegistro.setDescripccion(descripccion);
        pageCompra.assertProducto(modeloRegistro.getDescripccion());

    }

    @Entonces("seleccionar talla {string}, seleccionar boton de compar ahora y finaliza la compra")
    public void seleccionarTallaYfinalizarCompra(String talla){
        modeloRegistro.setTallaZapato(talla);
        pageCompra.asserTalla(modeloRegistro.getTallaZapato());

        pageCompra.botonComprarAhora();
        pageCompra.botonFinalizarCompra();
        pageCompra.botonContinuarCompra();
        pageCompra.assertFinalizarCompra();

    }


}
