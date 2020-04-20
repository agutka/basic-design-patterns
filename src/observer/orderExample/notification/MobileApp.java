package observer.orderExample.notification;

import observer.orderExample.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Aplikacja mobilna - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
