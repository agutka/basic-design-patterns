package observer.orderExample.notification;

import observer.orderExample.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("SMS - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
