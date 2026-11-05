/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.logic;

import cat.paucasesnovescifp.lloguervideojocs.dto.Game;
import cat.paucasesnovescifp.lloguervideojocs.dto.Rent;
import cat.paucasesnovescifp.lloguervideojocs.dto.User;
import java.util.ArrayList;

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
    
    
    
    public static void addUser(User user){
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
    
    
    
    public static void addGame(Game game){
        gameList.add(game);
    }
    
    public static void removeGame(Game game) throws BusinessException{
        
        for (Rent rent : rentList){
            if (rent.getGameCopy() == game && !rent.isEnded()){
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
}
