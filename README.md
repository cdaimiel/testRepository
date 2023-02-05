# testRepository

 El proyecto esta hecho usando sdk 17 
 Tiene una unica dependencia con el conector de mySQL (Está añadida usando Maven)

La ruta donde se genera el fichero es: TestingInstalation\src\com\prueba\file\
 El nombre del fichero  FileListProveedores.txt

Para ejecutarlo desde consola usando Maven se puede usar el comando: 
$...\TestingInstalation>mvn exec:java -Dexec.mainClass="com.prueba.principal.Main" -Dexec.args="5"

sustituyendo el 5 por el IdCliente del que queramos buscar sus proveedores
