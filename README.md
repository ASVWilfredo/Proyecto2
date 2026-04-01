# 🏦 Proyecto2 - API REST de Gestión de Cuentas

## 📌 Descripción

**Proyecto2** es una aplicación backend desarrollada con Spring Boot que implementa una API REST para la gestión de cuentas, simulando un sistema bancario básico.

Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre las cuentas almacenadas en una base de datos, siguiendo una arquitectura en capas que facilita la escalabilidad y el mantenimiento del código.

---

## 🧠 Objetivo del proyecto

El objetivo principal es aplicar conceptos de desarrollo backend utilizando:

* Arquitectura en capas
* Persistencia con JPA / Hibernate
* Creación de APIs REST
* Manejo de solicitudes HTTP

---

## 🏗️ Arquitectura

El proyecto está estructurado en las siguientes capas:

### 🌐 Controller

* Maneja las peticiones HTTP
* Define los endpoints de la API
* Retorna respuestas al cliente

### ⚙️ Service

* Contiene la lógica de negocio
* Procesa los datos antes de enviarlos al repositorio

### 📂 Repository

* Se encarga del acceso a la base de datos
* Utiliza Spring Data JPA para operaciones CRUD

### 🧩 Model (Entity)

* Representa las tablas de la base de datos
* Define los atributos de la entidad Cuenta

---

## 📦 Funcionalidades

El sistema permite:

* ✅ Crear nuevas cuentas
* 📄 Consultar todas las cuentas
* 🔍 Buscar cuentas por ID
* ✏️ Actualizar información de una cuenta
* ❌ Eliminar cuentas

---

## 🔄 Flujo de funcionamiento

1. El cliente realiza una petición HTTP (Postman o frontend)
2. El Controller recibe la solicitud
3. El Service procesa la lógica
4. El Repository accede a la base de datos
5. Se devuelve la respuesta al cliente

---

## 🛠️ Tecnologías utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

---

## 📊 Estructura del proyecto

```bash
src/
 ├── main/
 │   ├── java/
 │   │   ├── controller/
 │   │   ├── service/
 │   │   ├── repository/
 │   │   └── model/
 │   └── resources/
 │       └── application.properties
```

---

## 🚀 Ejecución del proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/ASVWilfredo/Proyecto2.git
```

2. Configurar la base de datos en `application.properties`

3. Ejecutar el proyecto desde tu IDE o con:

```bash
mvn spring-boot:run
```

4. Acceder a los endpoints mediante Postman o navegador

---

## 💡 Ejemplo de endpoints

* `GET /cuentas` → Obtener todas las cuentas
* `GET /cuentas/{id}` → Obtener cuenta por ID
* `POST /cuentas` → Crear cuenta
* `PUT /cuentas/{id}` → Actualizar cuenta
* `DELETE /cuentas/{id}` → Eliminar cuenta

---

## 🎯 Conclusión

Este proyecto demuestra la implementación de una API REST funcional utilizando Spring Boot, aplicando buenas prácticas como la separación de responsabilidades mediante arquitectura en capas, facilitando el desarrollo de aplicaciones backend escalables y mantenibles.

---
