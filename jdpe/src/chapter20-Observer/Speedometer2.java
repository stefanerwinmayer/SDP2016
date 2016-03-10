/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter20;

import java.util.ArrayList;
import java.util.List;

public class Speedometer2 {

    private int currentSpeed;
    private List<SpeedometerListener> listeners;

    public Speedometer2() {
        currentSpeed = 0;
        listeners = new ArrayList<SpeedometerListener>();
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        currentSpeed = speed;

        // Tell all observers so they know speed has changed...
        fireSpeedChanged();
    }

    public void addSpeedometerListener(SpeedometerListener obj) {
        listeners.add(obj);
    }

    public void removeSpeedometerListener(SpeedometerListener obj) {
        listeners.remove(obj);
    }

    protected void fireSpeedChanged() {
        SpeedometerEvent speedEvent =
                new SpeedometerEvent(this, getCurrentSpeed());
        for (SpeedometerListener eachListener : listeners) {
            eachListener.speedChanged(speedEvent);
        }
    }

}
