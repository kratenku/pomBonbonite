# language: es
@regresion
Característica: Registro de cliente en la pagina bon-bonite

  @0_registro
  Esquema del escenario: : Ingresar a pagina de registro y registrar cliente
    Dado el usuario selecciona el boton de registro
    Cuando Ingresa los siguientes datos: Cédula"<cedula>", Nombres "<nombres>", Apellidos "<apellidos>", correo "<correo>", contraseña "<contrasenia>"
    Y Seleccionar boton de aceptar condicion y boton de registrar
    Entonces Validar mensaje de registro exitoso usuario "<cedula>"
    Ejemplos:
      | cedula   | nombres | apellidos | correo        | contrasenia |
      | 12345674 | Testi    | Salazar   | qvision@test.com | 12345678      |
