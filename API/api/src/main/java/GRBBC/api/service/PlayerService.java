package GRBBC.api.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GRBBC.api.model.Player;

@Service
public class PlayerService {
    private Player player;

    @Autowired
    public PlayerService(Player player){
        this.player = player;
    }


    
}
