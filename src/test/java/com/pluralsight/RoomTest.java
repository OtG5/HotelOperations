package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void should_be_occupied_dirty_checkIN(){
       // arrange
        Room room = new Room(3, 124.00);
        int numberOfBeds;
        double price;

        //act
        room.checkIn();



        //assert

    }


}