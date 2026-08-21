package co.com.bon.bonite.dto;

public class registroDTO {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String contrasenia;
    private String confirmarContrasenia;
    private String descripccion;
    private String tallaZapato;
    private String telefono;
    private String mensaje;

    public registroDTO(String cedula, String nombres, String apellidos, String correo, String contrasenia,
                       String confirmarContrasenia,String descripccion, String tallaZapato, String telefono,String mensaje) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.confirmarContrasenia = confirmarContrasenia;
        this.descripccion = descripccion;
        this.tallaZapato = tallaZapato;
        this.telefono = telefono;
        this.mensaje = mensaje;

    }

    public String getCedula() {
        return cedula;
    }

    public String setCedula(String cedula) {
        this.cedula = cedula;
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String setNombres(String nombres) {
        this.nombres = nombres;
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getConfirmarContrasenia() {
        return confirmarContrasenia;
    }

    public void setConfirmarContrasenia(String confirmarContrasenia) {
        this.confirmarContrasenia = confirmarContrasenia;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public String getTallaZapato() {
        return tallaZapato;
    }

    public void setTallaZapato(String tallaZapato) {
        this.tallaZapato = tallaZapato;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
