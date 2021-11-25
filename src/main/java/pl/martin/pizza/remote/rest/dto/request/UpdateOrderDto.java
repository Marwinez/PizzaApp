package pl.martin.pizza.remote.rest.dto.request;

import pl.martin.pizza.remote.rest.dto.response.OrderDto;

public class UpdateOrderDto {
    private OrderDto order;

    public UpdateOrderDto() {
    }

    public UpdateOrderDto(OrderDto order) {
        this.order = order;
    }

    public OrderDto getOrder() {
        return order;
    }

    public void setOrder(OrderDto order) {
        this.order = order;
    }
}
