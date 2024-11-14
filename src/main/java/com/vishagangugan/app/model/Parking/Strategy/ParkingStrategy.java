package com.vishagangugan.app.model.Parking.Strategy;

public interface ParkingStrategy {
    
    /**
     * Add a new slot to parking strategy. After adding, this new slot will become available 
     * for future parkings.
     * 
     * @param slotNumber Slot number to be added.
     * 
     */

     public void addSlot(Integer slotNumber);

     /**
     * Remove a new slot to parking strategy. After removing, this new slot will not be available 
     * for future parkings.
     * 
     * @param slotNumber Slot number to be removed.
     * 
     */

     public void removeSlot(Integer slotNumber);

     /**
     * Remove a new slot to parking strategy. After removing, this new slot will not be available 
     * for future parkings.
     * 
     * @return Next free Slot.
     * 
     */

     public Integer getNextSlot();
}
