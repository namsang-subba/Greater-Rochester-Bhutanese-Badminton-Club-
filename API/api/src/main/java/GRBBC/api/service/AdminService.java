package GRBBC.api.service;

import GRBBC.api.repository.EventRepository;
import GRBBC.api.repository.PlayerRepository;

@Service
public class AdminService{
    private PlayerRepository playerRepository;
    private EventRepository eventRepository;

    @Autowired
    public AdminService(PlayerRepository playerRepository, EventRepository eventRepository){
        this.playerRepository = playerRepository;
        this.eventRepository = eventRepository;
    }

    public boolean addPlayer(Player player){
        playerRepository.add(player);
    }
}