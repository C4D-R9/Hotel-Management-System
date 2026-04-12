package com.hotel.model;

import java.time.LocalDateTime;

public class RoomStatus {

    private int roomStatusId;
    private String roomStatusName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public RoomStatus() {}

    public RoomStatus(int roomStatusId, String roomStatusName,
                      LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.roomStatusId = roomStatusId;
        this.roomStatusName = roomStatusName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getRoomStatusId() { return roomStatusId; }
    public void setRoomStatusId(int roomStatusId) { this.roomStatusId = roomStatusId; }

    public String getRoomStatusName() { return roomStatusName; }
    public void setRoomStatusName(String roomStatusName) { this.roomStatusName = roomStatusName; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}