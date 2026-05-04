package com.elfiestero438.demo.dto;

import java.util.List;

import com.elfiestero438.demo.domain.model.Recipe;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Objeto para crear o actualizar recetas de yogurt")
public class RecipeDTO {

    @Schema(description = "Nombre de la receta", example = "Yogurt natural")
    private String name;

    @Schema(description = "Descripción de la receta")
    private String description;

    @Schema(description = "Cantidad de leche en litros", example = "1.0")
    private Double defaultMilkVolume;

    @Schema(description = "Cantidad de cultivo inicial (starter)", example = "2.0")
    private Double defaultStarterAmount;

    @Schema(description = "Temperatura de calentamiento en °C", example = "85")
    private Double heatingTemperature;

    @Schema(description = "Duración del calentamiento en minutos", example = "30")
    private Integer heatingDuration;

    @Schema(description = "Temperatura de inoculación en °C", example = "45")
    private Double inoculationTemperature;

    @Schema(description = "Temperatura de incubación en °C", example = "42")
    private Double incubationTemperature;

    @Schema(description = "Tiempo mínimo de incubación en horas", example = "6")
    private Integer minIncubationTime;

    @Schema(description = "Tiempo máximo de incubación en horas", example = "8")
    private Integer maxIncubationTime;

    @Schema(description = "Tiempo de refrigeración en horas", example = "4")
    private Integer refrigerationTime;

    @Schema(description = "Nivel de dificultad de la receta", example = "EASY")
    private Recipe.DifficultyLevel difficulty;

    @Schema(description = "Consejos adicionales para la preparación")
    private String tips;

    @Schema(description = "Lista de ingredientes de la receta")
    private List<IngredientDTO> ingredients;
}