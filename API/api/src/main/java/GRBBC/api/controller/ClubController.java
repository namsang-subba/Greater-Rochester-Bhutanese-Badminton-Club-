package GRBBC.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import GRBBC.api.model.Club;
import GRBBC.api.model.Event;
import GRBBC.api.model.Player;

@RestController
public class ClubController {
    @Autowired
    public Club club;

    @GetMapping()
    public ResponseEntity<Map<String, Object>> home(){
        Map<String, Object> homeInfo = new HashMap<>();
        homeInfo.put("home", "home");
        return new ResponseEntity(homeInfo, HttpStatus.ACCEPTED);
    }

    @GetMapping("/roster")
    public ResponseEntity<List<Player>> getRoster(){
        System.out.println(club.getRoster());
        return new ResponseEntity<List<Player>>(club.getRoster(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getEvents(){
        return new ResponseEntity<List<Event>>(club.getEvents(), HttpStatus.OK);
    }
}
