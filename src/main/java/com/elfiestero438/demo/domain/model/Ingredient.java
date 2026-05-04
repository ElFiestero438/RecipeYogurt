package com.elfiestero438.demo.domain.model;

import jakarta.persistence.*;
import lombok.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ingredients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ingredient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    private Double quantity;
    
    private String unit; // kg, g, ml, cucharadas, etc.
    
    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    @JsonIgnore // 🔥 EVITA el error 500 (loop infinito)
    private Recipe recipe;
    
    private String notes;
    
    @Column(nullable = false)
    private Boolean optional;
}
