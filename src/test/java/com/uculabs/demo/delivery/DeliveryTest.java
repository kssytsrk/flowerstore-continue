package com.uculabs.demo.delivery;
import com.uculabs.demo.Item;

import com.uculabs.demo.flowerstore.Flower;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class DeliveryTest {
    private Delivery delivery;
    private List<Item> items;

    @Test
    void testDeliverPost() {
        delivery = new PostDeliveryStrategy();
        items = new ArrayList<>();
        items.add(new Flower());
        assertDoesNotThrow(() -> delivery.deliver(items));
    }

    @Test
    void testDeliverDHL() {
        delivery = new DHLDeliveryStrategy();
        items = new ArrayList<>();
        items.add(new Flower());
        assertDoesNotThrow(() -> delivery.deliver(items));
    }
}
