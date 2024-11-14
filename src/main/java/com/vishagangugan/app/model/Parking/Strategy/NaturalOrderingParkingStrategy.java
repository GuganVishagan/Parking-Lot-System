package com.vishagangugan.app.model.Parking.Strategy;

import com.vishagangugan.app.model.Slot;

import java.util.TreeSet;

public class NaturalOrderingParkingStrategy implements ParkingStrategy {
    TreeSet<Integer> slotTreeSet;

    public NaturalOrderingParkingStrategy(){
        this.slotTreeSet = new TreeSet<>();
    }

    /**
     * Add a new slot to parking strategy. After adding, this new slot will become available
     * for future parkings.
     *
     * @param slotNumber Slot number to be added.
     */
    @Override
    public void addSlot(Integer slotNumber) {
        this.slotTreeSet.add((slotNumber));
    }

    /**
     * Remove a new slot to parking strategy. After removing, this new slot will not be available
     * for future parkings.
     *
     * @param slotNumber Slot number to be removed.
     */
    @Override
    public void removeSlot(Integer slotNumber) {
        this.slotTreeSet.remove((slotNumber));
    }

    /**
     * Remove a new slot to parking strategy. After removing, this new slot will not be available
     * for future parkings.
     *
     * @return Next free Slot.
     */
    @Override
    public Integer getNextSlot() {
        if(slotTreeSet.isEmpty()){
            throw new NoFreeSlotAvailableException();
        }
        return this.slotTreeSet.first();
    }

}
