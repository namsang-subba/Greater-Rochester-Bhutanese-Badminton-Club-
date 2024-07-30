package GRBBC.api.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import GRBBC.api.service.ClubService;

/**
 * Represents the Greater Bhutanese Badminton Club
 * History is all of the tournament participated by club members
 * Active donors is list of donors
 */

 @Component
public class Club {
    private List<Player> members;
    private List<Event> history;
    private List<String> activeDonor;
    private ClubService clubService;

    @Autowired
    public Club(ClubService clubService){
        this.clubService = clubService;
    }

    public List<Player> getRoster(){
        return clubService.getRoster();
    }
    public List<Event> getEvents(){
        return clubService.getEvents();
    }
    private List<String> getActiveDonor(){
        return this.activeDonor;
    }
}
