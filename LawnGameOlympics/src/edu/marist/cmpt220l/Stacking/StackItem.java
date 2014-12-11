package edu.marist.cmpt220l.Stacking;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/10/2014.
 */
public class StackItem {

    public StackItem next;
    public Team value;

    public StackItem(Team value){

        this.value = value;

    }

}
