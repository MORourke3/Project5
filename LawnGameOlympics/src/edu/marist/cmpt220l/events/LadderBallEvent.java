package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.Team;

/**
 * The Ladder Ball event
 */
public class LadderBallEvent extends Event {
    private int numRungs;

    /**
     * Construct the ladder ball event
     */
    public LadderBallEvent(Team[] teams) {
        super("Ladder Ball", 21, true, 15, teams);
    }

    /**
     * Retrieve any extra information for this event.
     *
     * @return extra information for this event
     */
    public String getExtraInfo() {
        return "Num Rungs: " + numRungs;
    }

    /**
     * Retrieve the number of rungs on the ladder
     *
     * @return the number of rungs on the ladder
     */
    public int getNumRungs() {
        return numRungs;
    }

    /**
     * Set the number of rungs on the ladder
     *
     * @param numRungs the number of rungs on the ladder
     */
    public void setNumRungs(int numRungs) {
        this.numRungs = numRungs;
    }
}
