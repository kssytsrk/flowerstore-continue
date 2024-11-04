package com.uculabs.demo.decorators;
import com.uculabs.demo.Item;
public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item item) {
        this.item = item;
    }
    
    public double getPrice() {
        return 4+this.item.getPrice() ;
    }
    public String getDescription() {
        return item.getDescription() + " with decorator Basket";
    }
}
