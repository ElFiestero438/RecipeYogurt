package com.elfiestero438.demo.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.ArrayList;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private Double defaultMilkVolume;
    private Double defaultStarterAmount;

    private Double heatingTemperature;
    private Integer heatingDuration;

    private Double inoculationTemperature;
    private Double incubationTemperature;
    private Integer incubationDuration;

    private Integer minIncubationTime;
    private Integer maxIncubationTime;

    private Integer refrigerationTime;

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficulty;

    private String tips;

    private Boolean active;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<Ingredient> ingredients = new ArrayList<>();

    public enum DifficultyLevel {
        EASY,
        MEDIUM,
        HARD
    }
}