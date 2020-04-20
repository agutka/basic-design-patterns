package observer.orderExample.notification;

import observer.orderExample.order.Order;

public interface Observer {

    void update(Order order);
}
