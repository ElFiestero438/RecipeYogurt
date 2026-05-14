# Manual de Usuario - RecipeYogurt

## Introducción

RecipeYogurt es una API REST para manejar recetas de yogurt.
Permite crear, consultar, actualizar y eliminar recetas de forma sencilla.

---

# Funciones

* Crear recetas
* Consultar recetas
* Actualizar recetas
* Eliminar recetas

---

# Cómo ejecutar el proyecto

## Paso 1

Abrir el proyecto en el editor o IDE.

## Paso 2

Ejecutar este comando:

```bash id="2g0qxa"
./mvnw spring-boot:run
```

## Paso 3

Esperar a que el servidor inicie correctamente.

---

# Cómo usar Swagger

## Paso 1

Abrir el navegador.

## Paso 2

Entrar a esta URL:

```txt id="3n2tr0"
http://localhost:8080/swagger-ui/index.html
```

## Paso 3

Elegir el endpoint que desea probar.

## Paso 4

Presionar el botón "Try it out".

## Paso 5

Ingresar el JSON correspondiente.

## Paso 6

Presionar "Execute".

---

# Ejemplo JSON

```json id="1i5tbo"
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

# Posibles errores

## Error 404

El endpoint no existe.

## Error 500

Ocurrió un error interno del servidor.

---

# Evidencias

Las capturas y evidencias están en la carpeta:

docs/
