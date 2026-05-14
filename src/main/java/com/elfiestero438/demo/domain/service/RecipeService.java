package com.elfiestero438.demo.domain.service;

import com.elfiestero438.demo.domain.model.Recipe;
import com.elfiestero438.demo.domain.model.Ingredient;
import com.elfiestero438.demo.dto.RecipeDTO;
import com.elfiestero438.demo.dto.IngredientDTO;
import com.elfiestero438.demo.domain.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public Recipe createRecipe(RecipeDTO recipeDTO) {
        Recipe recipe = Recipe.builder()
                .name(recipeDTO.getName())
                .description(recipeDTO.getDescription())
                .defaultMilkVolume(recipeDTO.getDefaultMilkVolume())
                .defaultStarterAmount(recipeDTO.getDefaultStarterAmount())
                .heatingTemperature(recipeDTO.getHeatingTemperature())
                .heatingDuration(recipeDTO.getHeatingDuration())
                .incubationTemperature(recipeDTO.getIncubationTemperature())
                .incubationDuration(recipeDTO.getIncubationDuration())
                .minIncubationTime(recipeDTO.getMinIncubationTime())
                .maxIncubationTime(recipeDTO.getMaxIncubationTime())
                .refrigerationTime(recipeDTO.getRefrigerationTime())
                .difficulty(recipeDTO.getDifficulty())
                .tips(recipeDTO.getTips())
                .ingredients(new ArrayList<>())
                .active(true)
                .build();

        if (recipeDTO.getIngredients() != null) {
            for (IngredientDTO ingredientDTO : recipeDTO.getIngredients()) {
                Ingredient ingredient = Ingredient.builder()
                        .name(ingredientDTO.getName())
                        .quantity(ingredientDTO.getQuantity())
                        .unit(ingredientDTO.getUnit())
                        .notes(ingredientDTO.getNotes())
                        .optional(ingredientDTO.getOptional() != null ? ingredientDTO.getOptional() : false)
                        .recipe(recipe)
                        .build();
                recipe.getIngredients().add(ingredient);
            }
        }

        return recipeRepository.save(recipe);
    }

    public Recipe updateRecipe(Long id, RecipeDTO dto) {
        Recipe recipe = recipeRepository.findById(id).orElseThrow();

        recipe.setName(dto.getName());
        recipe.setDescription(dto.getDescription());
        recipe.setDefaultMilkVolume(dto.getDefaultMilkVolume());
        recipe.setDefaultStarterAmount(dto.getDefaultStarterAmount());
        recipe.setHeatingTemperature(dto.getHeatingTemperature());
        recipe.setHeatingDuration(dto.getHeatingDuration());
        recipe.setIncubationTemperature(dto.getIncubationTemperature());
        recipe.setIncubationDuration(dto.getIncubationDuration());
        recipe.setMinIncubationTime(dto.getMinIncubationTime());
        recipe.setMaxIncubationTime(dto.getMaxIncubationTime());
        recipe.setRefrigerationTime(dto.getRefrigerationTime());
        recipe.setDifficulty(dto.getDifficulty());
        recipe.setTips(dto.getTips());

        return recipeRepository.save(recipe);
    }

    public Recipe getRecipe(Long id) {
        return recipeRepository.findById(id).orElseThrow();
    }

    public List<Recipe> getAllActiveRecipes() {
        return recipeRepository.findAll().stream()
                .filter(Recipe::getActive)
                .toList();
    }

    public List<Recipe> searchRecipes(String keyword) {
        return recipeRepository.findAll().stream()
                .filter(r -> r.getName().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    public void deactivateRecipe(Long id) {
        Recipe recipe = recipeRepository.findById(id).orElseThrow();
        recipe.setActive(false);
        recipeRepository.save(recipe);
    }

    public void activateRecipe(Long id) {
        Recipe recipe = recipeRepository.findById(id).orElseThrow();
        recipe.setActive(true);
        recipeRepository.save(recipe);
    }
}