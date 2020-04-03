package com.github.lless.tacos.data;

import com.github.lless.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {
}
