package com.github.lless.tacos.data;

import com.github.lless.tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
}
