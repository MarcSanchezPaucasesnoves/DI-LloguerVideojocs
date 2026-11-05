/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.dto;

/**
 *
 * @author marc
 */
public class GameCopy {
    private int id;
    private String platform;
    private Game game;
    private boolean isRent;

    public GameCopy(int id, String platform, Game game) {
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

    public String getPlatform() {
        return platform;
    }

    private void setPlatform(String platform) {
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
