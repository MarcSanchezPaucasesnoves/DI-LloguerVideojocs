/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.dto;

import cat.paucasesnovescifp.lloguervideojocs.util.GamePlatform;

/**
 *
 * @author marc
 */
public class GameCopy {
    private int id;
    private GamePlatform platform;
    private Game game;
    private boolean isRent;

    public GameCopy(int id, GamePlatform platform, Game game) {
        setId(id);
        setPlatform(platform);
        setGame(game);
        isRent = false;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public GamePlatform getPlatform() {
        return platform;
    }

    private void setPlatform(GamePlatform platform) {
        this.platform = platform;
    }

    public Game getGame() {
        return game;
    }

    private void setGame(Game game) {
        this.game = game;
    }

    public boolean isRent() {
        return isRent;
    }

    public void changeRentValue() {
        isRent = !isRent;
    }
    
    
    
}
