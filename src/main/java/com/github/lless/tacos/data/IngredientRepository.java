package com.github.lless.tacos.data;

import com.github.lless.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}
