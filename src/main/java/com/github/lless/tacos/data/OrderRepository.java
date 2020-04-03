package com.github.lless.tacos.data;

import com.github.lless.tacos.Order;

public interface OrderRepository {
    Order save (Order order);
}
