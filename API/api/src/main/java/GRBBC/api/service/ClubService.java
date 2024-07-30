package GRBBC.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GRBBC.api.model.Event;
import GRBBC.api.model.Player;
import GRBBC.api.repository.EventRepository;
import GRBBC.api.repository.PlayerRepository;

@Service
public class ClubService {
    private PlayerRepository playerRepository;
    private EventRepository eventRepository;

    @Autowired
    public ClubService(PlayerRepository playerRepository, EventRepository eventRepository){
        this.playerRepository = playerRepository;
        this.eventRepository = eventRepository;
    }

    public List<Player> getRoster(){
        List<Player> roster = new ArrayList<>();
        for(Player p : playerRepository.findAll()){
            roster.add(p);
        }
        return roster;
    }

    public List<Event> getEvents(){
        List<Event> events = new ArrayList<>();
        for(Event e : eventRepository.findAll()){
            events.add(e);
        }
        return events;
    }
}
