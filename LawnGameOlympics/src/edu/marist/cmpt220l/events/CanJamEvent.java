package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.Team;

/**
 * The CanJam event
 */
public class CanJamEvent extends Event {

    private int frisbeeSize;

    /**
     * Construct a new CanJam event
     */
    public CanJamEvent(Team[] teams) {
        super("Can Jam", 21, true, 50);
    }

    /**
     * Retrieve any extra information for this event.
     *
     * @return extra information for this event
     */
    public String getExtraInfo() {
        return "Frisbee Size: " + frisbeeSize;
    }

    /**
     * Retrieve the size of the frisbee
     *
     * @return the size of the frisbee
     */
    public int getFrisbeeSize() {
        return frisbeeSize;
    }

    /**
     * Set the size of the frisbee
     *
     * @param frisbeeSize the size of the frisbee
     */
    public void setFrisbeeSize(int frisbeeSize) {
        this.frisbeeSize = frisbeeSize;
    }
}
