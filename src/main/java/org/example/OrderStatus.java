package org.example;

public enum OrderStatus {


    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),

    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELED("Canceled");
    private String orderStatus;

    public String getOrderStatus() {
        return orderStatus;
    }

    OrderStatus(String orderStatus) {
      this.orderStatus = orderStatus;

    }

    @Override
    public String toString() {
        return "orderStatus{" +
                "OrderStatus='" + orderStatus + '\'' +
                "} " + super.toString();
    }


    }

