package com.uculabs.demo.decorators;
import com.uculabs.demo.Item;
public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item item) {
        this.item = item;
    }
    
    public double getPrice() {
        return 13+this.item.getPrice() ;
    }
    public String getDescription() {
        return item.getDescription() + " with decorator Paper";
    }
}
