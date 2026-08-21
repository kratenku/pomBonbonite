# language: es
@regresion
Característica: Modificación Registro de cliente en la pagina bon-bonite

  @1_loginModificar
  Esquema del escenario: : Ingresar a pagina de login y modificar datos
    Dado El usuario inicia sesión: Cédula "<cedula>", contraseña "<contrasenia>"
    Cuando Ingreso a datos y modifico telefono "<telefono>"
    Y selecciono boton de guardar
    Entonces valido el mensaje "<mensaje>"
    Ejemplos:
      | cedula  | contrasenia | telefono | mensaje |
      | 12345674|  12345678   |  3001234567 |  Datos personales actualizados correctamente|
