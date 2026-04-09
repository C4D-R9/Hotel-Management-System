package src.myhotel.models;

import java.math.BigDecimal;

public class Room {

    private int roomID;
    private int roomNumber;
    private BigDecimal roomPrice;
    private int roomStatus;
    private int floorNumber;

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStauts(int roomStauts) {
        this.roomStatus = roomStauts;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

}
