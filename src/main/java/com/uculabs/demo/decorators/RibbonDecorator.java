package com.uculabs.demo.decorators;
import com.uculabs.demo.Item;
public class RibbonDecorator extends AbstractDecorator {
    public RibbonDecorator(Item item) {
        this.item = item;
    }
    
    public double getPrice() {
        return 40+this.item.getPrice() ;
    }
    public String getDescription() {
        return item.getDescription() + " with decorator Ribbon";
    }
}
