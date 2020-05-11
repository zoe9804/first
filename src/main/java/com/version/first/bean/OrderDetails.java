package com.version.first.bean;

public class OrderDetails {
    private int orderDetailsId;
    private long orderId;
    private int menuId;
    private int menuAmount;
    private String menuRemark;

    public String getMenuRemark() {
        return menuRemark;
    }

    public void setMenuRemark(String menuRemark) {
        this.menuRemark = menuRemark;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
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
