# language: es
@regresion
Característica: Comprar producto en la pagina bon-bonite

  @2_comprar_producto
  Esquema del escenario: : Ingresar a pagina de registro y registrar cliente
    Dado El usuario inicia sesión: Cédula "<cedula>", contraseña "<contrasenia>"
    Cuando El usuario este en la pestaña home seleccione zapatos
    Y Buscar descripcción del zapato "<descripccion>", seleccionar la imagen del producto
    Entonces seleccionar talla "<tallaZapato>", seleccionar boton de compar ahora y finaliza la compra
    Ejemplos:
      | cedula   | descripccion | tallaZapato | correo        | contrasenia |
      | 12345674 | image-1026396 | 34   | qvision@test.com | 12345678      |
