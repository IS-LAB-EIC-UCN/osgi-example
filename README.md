# Ejemplo de Biblioteca OSGi-Felix



En este ejemplo se implementa un sistema que tiene por objetivo inventariar libros al estilo de una biblioteca virtual. El desarrollo está basado en un estilo arquitectural de tres capas: 3: capa de persistencia, 2: capa de servicios, 1: capa de presentación. Los desarrollos son proyectos Apache Maven para **Eclipse IDE**.

## Deployment (Creación de los Bundles)

    mvn clean deploy

Para el deployment en Apache Felix, se debe crear un repositorio el cual se especifica en el archivo **pom.xml**. Pasos para el deployment:

1. Adicionar el repositorio a Apache Felix:

	`repos add [url repo]`
2. Verificar si existen los bundles a ser deployados.

	`list - biblioteca`
3. Deployar

    `deploy -s [bundle]`
