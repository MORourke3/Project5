package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.Bracketing.Queue;
import edu.marist.cmpt220l.teams.Team;
import edu.marist.cmpt220l.teams.TeamManager;

/**
 * The event manager manages the events in the application
 */
public class EventManager {
    private Event[] events;

    /**
     * Construct a new EventManager
     */
    public EventManager(TeamManager teams) {
        events = new Event[] {
                new WashoosEvent(teams.getTeams()),
                new HorseshoesEvent(teams.getTeams()),
                new CornHoleEvent(teams.getTeams()),
                new CanJamEvent(teams.getTeams()),
                new LadderBallEvent(teams.getTeams()),
                new StickGameEvent(teams.getTeams())
        };
    }

    /**
     * Retrieve the events
     *
     * @return the events
     */
    public Event[] getEvents() {
        return events;
    }

    public Event getOne(int A){

        return events[A];

    }


}
