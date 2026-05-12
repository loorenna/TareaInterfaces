# TAREA DE INTERFACES EN JAVA

## Autor

Alisson Quiguango.

## Descripción

Este proyecto fue desarrollado en Java utilizando Programación Orientada a Objetos e interfaces. El objetivo principal es aplicar conceptos como interfaces, herencia, encapsulamiento, polimorfismo, validaciones y clases abstractas mediante tres ejercicios prácticos.

El proyecto fue realizado en IntelliJ IDEA.

---

# Ejercicio 1: Sistema académico de documentos

## Descripción

Este ejercicio simula un sistema académico que permite imprimir distintos tipos de documentos como certificados, actas de notas y horarios académicos.

## Interfaces utilizadas

* Imprimible

## Clases desarrolladas

* Certificado
* ActaNotas
* HorarioAcademico
* MainAcademico

## Funcionalidades

* Implementación de interfaces
* Uso de @Override
* Polimorfismo
* Encapsulamiento
* Impresión de diferentes tipos de documentos

---

# Ejercicio 2: Sistema bancario de pagos

## Descripción

Este ejercicio simula un sistema bancario que procesa pagos mediante efectivo, tarjeta y transferencia.

## Interfaces utilizadas

* Pagable

## Clases desarrolladas

* PagoEfectivo
* PagoTarjeta
* Transferencia
* MainPagos

## Funcionalidades

* Validación de montos
* Uso de comisiones
* Implementación de interfaces
* Polimorfismo
* Encapsulamiento

---

# Ejercicio 3: Sistema de roles empresariales

## Descripción

Este ejercicio representa un sistema empresarial con diferentes tipos de usuarios y permisos dentro de la empresa.

## Interfaces utilizadas

* Autenticable
* Reportable
* Gestionable

## Clase abstracta

* UsuarioEmpresa

## Clases desarrolladas

* Cajero
* Administrador
* Supervisor
* MainRoles

## Explicación de interfaces

* Cajero implementa Autenticable y Gestionable porque necesita iniciar sesión y gestionar datos.
* Administrador implementa las tres interfaces porque tiene control completo del sistema.
* Supervisor implementa Autenticable y Reportable porque puede iniciar sesión y generar reportes, pero no modificar datos.

## Funcionalidades

* Inicio de sesión
* Validación de usuario y contraseña
* Menú interactivo
* Polimorfismo
* Clase abstracta
* Encapsulamiento

---

# Conceptos aplicados

* Interfaces
* Herencia
* Clase abstracta
* Encapsulamiento
* Polimorfismo
* Validaciones
* Sobrescritura de métodos con @Override

---

# Herramientas utilizadas

* Java
* IntelliJ IDEA
* GitHub

---

# Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar el archivo Main correspondiente a cada ejercicio.
3. Probar las funcionalidades del sistema.

---

# Video

El video explicativo corresponde al ejercicio 3: Sistema de roles empresariales.
Link:
https://epnecuador-my.sharepoint.com/:v:/g/personal/alisson_quiguango_epn_edu_ec/IQDsos0Nv02SS4ejzTkAe5d7ASYi8udR9eJpucvzHXrS1mc 
---

# Conclusión

Con esta práctica se logró comprender cómo utilizar interfaces para definir comportamientos comunes entre clases diferentes. Además, se aplicaron conceptos importantes de Programación Orientada a Objetos para desarrollar sistemas más organizados, reutilizables y fáciles de mantener.
