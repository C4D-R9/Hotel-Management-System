package com.hotel.model;

import java.time.LocalDateTime;

public class RoomType {

    private int roomTypeId;
    private String roomTypeName;
    private double price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public RoomType() {}

    public RoomType(int roomTypeId, String roomTypeName, double price,
                    LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.roomTypeId = roomTypeId;
        this.roomTypeName = roomTypeName;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getRoomTypeId() { return roomTypeId; }
    public void setRoomTypeId(int roomTypeId) { this.roomTypeId = roomTypeId; }

    public String getRoomTypeName() { return roomTypeName; }
    public void setRoomTypeName(String roomTypeName) { this.roomTypeName = roomTypeName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
