# RecipeYogurt API - Documentación con Swagger

API REST desarrollada con Spring Boot para la gestión de recetas de yogurt.

## Tecnologías
- Java 21
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Swagger (OpenAPI 3)

## Documentación Swagger
Disponible en:
http://localhost:8080/swagger-ui/index.html

## Endpoints principales
- POST /api/recipes → Crear receta
- GET /api/recipes → Listar recetas
- GET /api/recipes/{id} → Obtener receta
- PUT /api/recipes/{id} → Actualizar receta
- PATCH /api/recipes/{id}/activate → Activar
- PATCH /api/recipes/{id}/deactivate → Desactivar

## Evidencias
- Archivo openapi.json incluido

## Capturas Swagger

### Modelo de datos (Schema)
<p align="center">
  <img src="docs/Schema.png" width="600"/>
</p>

### Prueba exitosa (201 Created)
<p align="center">
  <img src="docs/Codigos.png" width="600"/>
</p>

### Manejo de errores (400 / 500)
<p align="center">
  <img src="docs/Error.png" width="600"/>
</p>

## Pruebas realizadas
- Creación de receta (201 Created)
- Consulta de recetas (200 OK)
- Manejo de errores (400 / 500)

## Ejecución
```bash
./mvnw spring-boot:run