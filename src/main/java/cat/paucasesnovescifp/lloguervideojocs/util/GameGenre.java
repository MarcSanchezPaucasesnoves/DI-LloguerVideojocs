/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.paucasesnovescifp.lloguervideojocs.util;

/**
 *
 * @author marc
 */
public enum GameGenre {
    ACTION("Action"),
    ACTION_ADVENTURE("Action Adventure"),
    FIGHTING("Fighting"),
    BEAT_EM_UP("Beat Em Up"),
    FIRST_PERSON_SHOOTER("First Person Shooter"),
    THIRD_PERSON_SHOOTER("Third Person Shooter"),
    BATTLE_ROYALE("Battle Royale"),
    ROLE_PLAYING_GAME("Role Playing Game"),
    TACTICAL_RPG("Tactical RPG"),
    STRATEGY("Strategy"),
    REAL_TIME_STRATEGY("Real Time Strategy"),
    SIMULATION("Simulation"),
    SPORTS("Sports"),
    RACING("Racing"),
    ADVENTURE("Adventure"),
    PLATFORMER("Platformer"),
    PUZZLE("Puzzle"),
    SURVIVAL("Survival"),
    SURVIVAL_HORROR("Survival Horror"),
    MMORPG("MMORPG");
    
    private final String displayName;

    private GameGenre(String formatedName) {
        this.displayName = formatedName;
    }
    
    public String getFormatedName() {
        return displayName;
    }
    
}
