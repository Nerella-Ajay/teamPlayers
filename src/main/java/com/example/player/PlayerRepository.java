// Write your code here
package com.example.player;
import java.util.*;

import org.apache.coyote.http11.filters.VoidInputFilter;

public interface PlayerRepository{
    ArrayList<Player> getPlayers();
    Player getPlayersById(int playerId);
    Player addPlayer(Player player);
    Player updatePlayer(int playerId, Player player);
    void deletePlayer(int playerId);
}