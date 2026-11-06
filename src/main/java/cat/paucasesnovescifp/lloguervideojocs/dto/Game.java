/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.dto;

import cat.paucasesnovescifp.lloguervideojocs.util.GameGenre;
import cat.paucasesnovescifp.lloguervideojocs.util.GamePlatform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alumne
 */
public class Game {
    private String name;
    private GameGenre genre;
    private Map<GamePlatform, List<GameCopy>> platformsCopy;
    private static int gameId = 0;

    public Game(String name, GameGenre genre, int PcUnits, int Ps5Units, int XboxUnits, int Switch2Units) {
        setName(name);
        setGenre(genre);
        setPlatformsCopy(PcUnits, Ps5Units, XboxUnits, Switch2Units);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public GameGenre getGenre() {
        return genre;
    }

    private void setGenre(GameGenre genre) {
        this.genre = genre;
    }

    public Map<GamePlatform, List<GameCopy>> getPlatformsCopy() {
        return platformsCopy;
    }

    private void setPlatformsCopy(int PcUnits, int Ps5Units, int XboxUnits, int Switch2Units) {
        this.platformsCopy = new HashMap<>();
        
        platformsCopy.put(GamePlatform.PC, createPlatformGameCopyList(PcUnits, GamePlatform.PC)); 
        platformsCopy.put(GamePlatform.PS5, createPlatformGameCopyList(Ps5Units, GamePlatform.PS5));
        platformsCopy.put(GamePlatform.XBOX, createPlatformGameCopyList(XboxUnits, GamePlatform.XBOX));
        platformsCopy.put(GamePlatform.SWITCH2, createPlatformGameCopyList(Switch2Units, GamePlatform.SWITCH2));
    }
    
    
    private List<GameCopy> createPlatformGameCopyList(int quantity, GamePlatform platform) {
        List<GameCopy> gameCopyList = new ArrayList<>();
        
        for (int i = 0; i < quantity; i++) {
            GameCopy gameCopy = new GameCopy(gameId, platform, this);
            gameCopyList.add(gameCopy);
            gameId++;
        }
        return gameCopyList;
    }
    
    
    
    public int getAvailableGameUnits(GamePlatform platform) {
        int total = 0;
        List<GameCopy> gameCopyList = platformsCopy.get(platform);
        
        for (GameCopy game : gameCopyList) {
            if (!game.isRent()) total++;
        }
        
        return total;
    }
    
    
}
