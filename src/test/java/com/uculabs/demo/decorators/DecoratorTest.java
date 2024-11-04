package com.uculabs.demo.decorators;
import com.uculabs.demo.flowerstore.Flower;
import com.uculabs.demo.flowerstore.FlowerType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {
    private AbstractDecorator d;
    private Flower f;
    private double price;
    private String desc;
    @Test
    void testBasketDecorator() {
        f = new Flower("violet", 7, 1, FlowerType.ROSE);
        d = new BasketDecorator(f);
        price = f.getPrice()+4;
        desc = "ROSE flower with decorator Basket";
        assertEquals(price, d.getPrice());
        assertEquals(desc, d.getDescription());
    }

    @Test
    void testPaperDecorator() {
        f = new Flower("yellow", 7, 1, FlowerType.ROSE);
        d = new PaperDecorator(f);
        price = f.getPrice()+13;
        desc = "ROSE flower with decorator Paper";
        assertEquals(price, d.getPrice());
        assertEquals(desc, d.getDescription());
    }

    @Test
    void testRibbonDecorator() {
        f = new Flower("orange", 8, 10, FlowerType.CHAMOMILE);
        d = new RibbonDecorator(f);
        price = f.getPrice()+40;
        desc = "CHAMOMILE flower with decorator Ribbon";
        assertEquals(price, d.getPrice());
        assertEquals(desc, d.getDescription());
    }
}