/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.logic;

import cat.paucasesnovescifp.lloguervideojocs.dto.DtoException;
import cat.paucasesnovescifp.lloguervideojocs.dto.Game;
import cat.paucasesnovescifp.lloguervideojocs.dto.GameCopy;
import cat.paucasesnovescifp.lloguervideojocs.dto.Rent;
import cat.paucasesnovescifp.lloguervideojocs.dto.User;
import cat.paucasesnovescifp.lloguervideojocs.util.GamePlatform;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumne
 */
public class BusinessLogic {
    private static ArrayList<User> userList = new ArrayList<>();
    private static ArrayList<Game> gameList = new ArrayList<>();
    private static ArrayList<Rent> rentList = new ArrayList<>();

    public static ArrayList<User> getUserList(){
        return userList;
    }
    
    public static ArrayList<Game> getGameList(){
        return gameList;
    }
    
    public static ArrayList<Rent> getRentList(){
        return rentList;
    }
    
    
    
    public static void addUser(User user) throws BusinessException{
        for (User currentUser : userList) {
            if (currentUser.getDni().equals(user.getDni())) throw new BusinessException("Ja hi ha un usuari amb aquest DNI.");
        }
        userList.add(user);
    }
    
    public static void removeUser(User user) throws BusinessException{

        for (Rent rent : rentList){
            if (rent.getUser() == user && !rent.isEnded()){
                throw new BusinessException("L'usuari no es pot eliminar perquè té un o més lloguers actius");
            }
        }
        
        userList.remove(user);
        
    }
    
    
    
    public static void addGame(Game game) throws BusinessException{
        for (Game currentGame : gameList) {
            if (currentGame.getName().equals(game.getName())) throw new BusinessException("Ja hi ha un joc amb aquest nom.");
        }
        gameList.add(game);
    }
    
    public static void removeGame(Game game) throws BusinessException, DtoException{
        
        for (Rent rent : rentList){   
            if (rent.getGame() == game && !rent.isEnded()){
                throw new BusinessException("El joc no es pot eliminar perquè té un o més lloguers actius");
            }
        }
        
        gameList.remove(game);     
    }
    
    
    
    public static void addRent(Rent rent){
        rentList.add(rent);
    }
    
    public static void completeRent(Rent rent){
        rent.markAsEnded();
    }
    
    public static Rent getRent(int registerNumber) {
        return rentList.get(registerNumber);
    }
    
    
    
    public static GameCopy rentGameCopy(Game game, GamePlatform platform) throws BusinessException{   
        List<GameCopy> gameCopyList = game.getPlatformsCopy().get(platform);
        GameCopy gameToReturn = null;
        
        if (game.getAvailableGameUnits(platform) < 1) throw new BusinessException("No queden o no existeixen jocs per aquesta plataforma.");
        
        for (GameCopy gameCopy : gameCopyList) {
            if (!gameCopy.isRent()) {
                gameCopy.changeRentValue();
                gameToReturn = gameCopy;
                break;
            }
        }
        
        return gameToReturn;
    }
    
    public static void unRentGameCopy(Game game, GamePlatform platform) {
        List<GameCopy> gameCopyList = game.getPlatformsCopy().get(platform);
        
        for (GameCopy gameCopy : gameCopyList) {
            if (gameCopy.isRent()) {
                gameCopy.changeRentValue();
                return;
            }
        }
        
    }
}
