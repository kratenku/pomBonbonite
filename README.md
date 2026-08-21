Notas e instrucciones ejecución de la automatización

1. Se utiliza gradle para la compilación de cada modulo o escenario esto para mayor escalabilidad al realizar una migración a azure

2. Estos son los comandos recomendados para ña ejecución en un ide de desarrollo:
 -Registro: :test --tests "runners.runnerRegistro"
 -Modificar :test --tests "runners.runnerLogin"
 -comprar :test --tests "runners.runnerCompra"

3. La automatización genera reporte extendido con evidencias visuales, la ruta es por defecto del proyecto
 :\PPT_JhonSalazar\test-output