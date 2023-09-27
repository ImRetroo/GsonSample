# GsonSample

Implementar una aplicación Java creando el proyecto con Maven desde Eclipse.

- GroupId: **dad.maven.gson**
- ArtifactId: **GsonSample**
- Version: **0.0.1**
1. La aplicación recogerá los siguientes datos desde la consola:
- Nombre (String)
- Apellidos (String)
- Edad (Integer)

Y los guardará en la clase **Persona**.

`Persona p = new Persona(); // TODO recoger datos desde la consola y almacenarlos en "p"`

Ejemplo de lectura de la entrada estándar:

`Scanner scanner = new Scanner(System.in);  
String line = scanner.nextLine();`

Todos los datos son obligatorios, así como será necesario verificar que los datos introducimos son del tipo indicado.

2. Con la instancia de la clase **Persona** conteniendo el nombre, apellidos y edad introducidos, convertir (marshall) el objeto Java en JSON utilizando la librería Gson de Google, mostrar el resultado en la consola y terminar.

Ejemplo de conversión de un objeto Java en formato JSON:

`Gson gson = new GsonBuilder().setPrettyPrinting().create();  
String json = gson.toJson(p);  
System.out.println(json);`

Ejemplo de salida en formato JSON generada por la aplicación:

`{  
    "nombre": "Chuck",  
    "apellidos": "Norris",  
    "edad": 67  
}`

La librería Gson que debemos utilizar es la siguiente:

- GroupId: **com.google.code.gson**
- ArtifactId: **gson**
- Version: **2.8.5**
