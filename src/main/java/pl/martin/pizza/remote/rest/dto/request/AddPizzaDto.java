package pl.martin.pizza.remote.rest.dto.request;

import pl.martin.pizza.remote.rest.dto.response.PizzaDto;

public class AddPizzaDto {
    private PizzaDto pizza;

    public AddPizzaDto() {
    }

    public AddPizzaDto(PizzaDto pizza) {
        this.pizza = pizza;
    }

    public PizzaDto getPizza() {
        return pizza;
    }

    public void setPizza(PizzaDto pizza) {
        this.pizza = pizza;
    }
}
