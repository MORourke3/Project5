package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.Team;

/**
 * The Stick Game event
 */
public class StickGameEvent extends Event {
    private int frisbeeSize;

    /**
     * Construct the stick game event
     */
    public StickGameEvent(Team[] teams) {
        super("Stick Game", 11, false, 25, teams);
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
