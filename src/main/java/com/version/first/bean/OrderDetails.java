package com.version.first.bean;

public class OrderDetails {
    private int orderDetailsId;
    private int orderId;
    private int menuId;
    private int menuAmount;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getMenuAmount() {
        return menuAmount;
    }

    public void setMenuAmount(int menuAmount) {
        this.menuAmount = menuAmount;
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

}
