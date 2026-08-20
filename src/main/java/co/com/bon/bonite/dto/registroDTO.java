package co.com.bon.bonite.dto;

public class registroDTO {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String contrasenia;
    private String confirmarContrasenia;

    public registroDTO(String cedula, String nombres, String apellidos, String correo, String contrasenia, String confirmarContrasenia) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.confirmarContrasenia = confirmarContrasenia;
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
}
