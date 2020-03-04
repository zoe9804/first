package com.version.first.bean;

public class OrderDetails {
    private int orderDetailsId;
    private int orderId;
    private int menuId;
    private int menuAmount;
    private int sumPrice;

    public int getOrderDetailId() {
        return orderDetailsId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailsId = orderDetailId;
    }

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

    public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }
}
