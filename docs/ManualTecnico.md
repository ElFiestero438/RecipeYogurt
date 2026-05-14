# Manual Técnico - RecipeYogurt

## Descripción

RecipeYogurt es una API REST hecha con Spring Boot para manejar recetas de yogurt.
Permite crear, consultar, actualizar y eliminar recetas usando endpoints HTTP.

---

# Tecnologías usadas

* Java 21
* Spring Boot
* Maven
* Swagger
* Spring Data JPA
* Hibernate

---

# Organización del proyecto

El proyecto está dividido en varias carpetas:

## Controller

Maneja las peticiones y endpoints.

## Service

Contiene la lógica del sistema.

## Repository

Se encarga de la base de datos.

## Model

Contiene las entidades del proyecto.

---

# Estructura

src/main/java

* controller
* service
* repository
* model

docs

* imágenes
* evidencias
* documentación

---

# Ejecutar el proyecto

## Requisitos

* Java 21
* Maven

## Comando

```bash
./mvnw spring-boot:run
```

---

# Swagger

La documentación Swagger está disponible en:

```txt
http://localhost:8080/swagger-ui/index.html
```

---

# Endpoints principales

## Obtener recetas

GET /api/recipes

## Crear receta

POST /api/recipes

## Actualizar receta

PUT /api/recipes/{id}

## Eliminar receta

DELETE /api/recipes/{id}

---

# Ejemplo JSON

```json
{
  "name": "Yogurt con frutas",
  "description": "Receta saludable",
  "ingredients": [
    "Yogurt",
    "Fresas",
    "Banano"
  ]
}
```

---

# Evidencias

Las imágenes y capturas del proyecto están en la carpeta:

docs/
