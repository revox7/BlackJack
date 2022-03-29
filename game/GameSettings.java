package game;
/**
 * @author (Jannis)
 */
public class GameSettings{

    boolean fiveCardCharlie;
    boolean allowResplit; 
    boolean threeOfSeven; 
    int maxSplits;

    /**
     * define with which rules and how many players you wanna play 
     */
    public GameSettings(boolean fiveCardCharlie, boolean allowResplit, boolean threeOfSeven, int maxSplits){
        this.fiveCardCharlie = fiveCardCharlie;
        this.allowResplit = allowResplit;
        this.threeOfSeven = threeOfSeven;
        this.maxSplits = maxSplits;
    }
    
    public boolean isFiveCardCharlie() {
		return fiveCardCharlie;
	}
    
    public boolean isAllowResplit() {
		return allowResplit;
	}
    
    public boolean isThreeOfSeven() {
		return threeOfSeven;
	}
    
    public int getMaxSplits() {
		return maxSplits;
	}
    
    public static GameSettings defaultSettings() {
    	return new GameSettings(true, true, false, 3);
    }

}

