package rooms;

public abstract class Room {

	    private int  x;
	    private int  y;

	    public Room (int x, int y)
	    {
	    	this.x = x;
	    	this.y = y;
	    }
	    public int getX()
	    {
	    	return x;
	    }
	    
	    public int getY()
	    {
	    	return y;
	    }
	    public abstract void print();

}