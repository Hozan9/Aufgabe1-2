package org.example;

public class Main {
    public static void main(String[] args) {
        Order neueBestellung = new Order ("1233456",OrderStatus.COMPLETED);

        System.out.println(neueBestellung);
        switch (neueBestellung.getStatus()) {


            case RECEIVED -> System.out.println(neueBestellung.getStatus());
            case IN_PROGRESS-> System.out.println(neueBestellung.getStatus());
            case IN_DELIVERY -> System.out.println(neueBestellung.getStatus());
            case COMPLETED -> System.out.println(neueBestellung.getStatus());
            case CANCELED -> System.out.println(neueBestellung.getStatus());
        }
    }
}
