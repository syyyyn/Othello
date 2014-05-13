package othello.Othello;
/**
 * Created by pmunoz on 01/04/14.
 * Updated by aeap and jgeorge on 05/05/14.
 * Updated by zwodnik on 09/05/14.
 */
public class Cell {
    public static final char BLACK = 'X'; //
    public static final char WHITE = 'O'; // 
    
    public static final char CANSELECT = '?';

    public boolean empty; //
    public boolean white;
    public boolean black;
    public boolean canselect;
    
    public int value; // 0 - white, 1 - black, -1 - empty

    public Cell() {
        this.empty = true;
        this.value = -1;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public void placeChip( int player ) {
        this.empty = false;
        this.value = player;
        
        if(player == 0){
        	this.white = true;
        	this.black = false;
        }
        
        else{
        	this.black = true;
        	this.white = false;
        }
    }

    public void changeChip() {
        placeChip((value+1)%2);
    }

    public boolean isWhite(){
    	return this.white;
    }
    
    public boolean isBlack(){
    	return this.black;
    }
    
    public boolean canSelect() {
        return this.canselect;
    }

    public void unselect() {
        this.canselect = false;
    }

    public int getPlayer() {
        return this.value;
    }

    public void setSelect() {
        this.canselect = true;
    }

    public void display() {
        if (this.isEmpty())
        {
            if(this.canselect)
                System.out.print("[ " + CANSELECT + " ]");
            else
                System.out.print("[ " + " " + " ]");
        }
        else {
            char content = BLACK;
            if (this.value == 0)
                content = WHITE;
            System.out.print("[ " + content + " ]");
        }
    }
}
