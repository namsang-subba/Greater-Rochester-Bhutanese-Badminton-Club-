package GRBBC.api.service;

import GRBBC.api.service.AdminService;

@Restcontroller
public class AdminController{

    @Autowired
    private AdminService adminService;

    @Post()
    public ResponseEntity<String> addPlayer(@RequestParam("playerName") String playerName){
        boolean playerAdded = adminService.addPlayer(new Player(playerName));
        if(playerAdded){
            return new ResponseEntity<String>("player added", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<String>("Failed to add player");
        
    }
}