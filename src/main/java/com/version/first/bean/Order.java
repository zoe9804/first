package com.version.first.bean;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private int userId;
    private long orderId;
    private int sumPrice;
    private String payId;
    private int userAddressPhoneId;
    private int deliverId;
    private String orderState;
    private Date orderTime;
    private String orderWord;
    private List<OrderDetails> orderDetails;

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public int getUserAddressPhoneId() {
        return userAddressPhoneId;
    }

    public void setUserAddressPhoneId(int userAddressPhoneId) {
        this.userAddressPhoneId = userAddressPhoneId;
    }

    public int getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(int deliverId) {
        this.deliverId = deliverId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderWord() {
        return orderWord;
    }

    public void setOrderWord(String orderWord) {
        this.orderWord = orderWord;
    }
}
