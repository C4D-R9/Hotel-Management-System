package com.hotel.model;

import java.time.LocalDateTime;

public class Room {

    private int roomId;
    private String roomNumber;
    private int roomStatusId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Room() {}

    public Room(int roomId, String roomNumber, int roomStatusId,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomStatusId = roomStatusId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getRoomId() { return roomId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public int getRoomStatusId() { return roomStatusId; }
    public void setRoomStatusId(int roomStatusId) { this.roomStatusId = roomStatusId; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
