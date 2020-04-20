package observer.orderExample;

import observer.orderExample.notification.Email;
import observer.orderExample.notification.MobileApp;
import observer.orderExample.notification.TextMessage;
import observer.orderExample.order.Order;
import observer.orderExample.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAJERESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println(" ------------------------- ");

        order.changeOrderStatus(OrderStatus.WYSLANE);
    }
}
