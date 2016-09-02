package com.teamtreehouse.techdegree;

import com.teamtreehouse.techdegree.hardware.FrightMachine;

// DONE: Use the Observer design pattern to allow all accessories to be plugged in.
// DONE: Use another design pattern to adapt the camera to be an accessory. // Adapter?
// DONE: Ensure unit tests pass.

public class Main {
    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();
        machine.simulateMotion();
    }
}
