/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.dto;

import cat.paucasesnovescifp.lloguervideojocs.util.GameGenre;
import cat.paucasesnovescifp.lloguervideojocs.util.GamePlatform;
import java.time.LocalDate;

/**
 *
 * @author marc
 */
public class Rent {
    private int registerNumber;
    private String gameName;
    private User user;
    private GamePlatform platform;
    private LocalDate initialDate;
    private LocalDate finalDate;
    private GameGenre genre;


    private Game game;
    private boolean ended;
    private static final int extraDays = 3;
    
    private static int rentId = 0;

    public Rent(User user, GameCopy gameCopy) {
        setRegisterNumber(rentId);
        setGameName(gameCopy.getGame().getName());
        setUser(user);
        setPlatform(gameCopy.getPlatform());
        setInitialDate();
        setFinalDate();
        setGenre(gameCopy.getGame().getGenre());
        
        game = gameCopy.getGame();
        ended = false;
    }
    
    public Rent(User user, GameCopy gameCopy, LocalDate initialDate) {
        this(user, gameCopy);
        this.initialDate = initialDate;
        this.finalDate = initialDate.plusDays(extraDays);
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    private void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
        rentId++;
    }

    public String getGameName() {
        return gameName;
    }

    private void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public User getUser() {
        return user;
    }

    private void setUser(User user) {
        this.user = user;
    }

    public GamePlatform getPlatform() {
        return platform;
    }

    private void setPlatform(GamePlatform platform) {
        this.platform = platform;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    private void setInitialDate() {
        this.initialDate = LocalDate.now();
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    private void setFinalDate() {
        this.finalDate = getCalculatedFinalDate();
    }

    public GameGenre getGenre() {
        return genre;
    }

    private void setGenre(GameGenre genre) {
        this.genre = genre;
    }

    public Game getGame() throws DtoException{
        if (game != null) return game;
        throw new DtoException("Aquest joc no existeix");
    }
    
    public static int getRentId() {
        return rentId;
    }
    
    public static LocalDate getCalculatedFinalDate() {
        return LocalDate.now().plusDays(extraDays);
    }
    
    
    
    public boolean isOutOfDate() {
        return finalDate.isBefore(LocalDate.now());
    }
 
    public boolean isEnded() {
        return ended;
    }
    
    public void markAsEnded() {
        ended = true;
    }
    
}
