package rooms;

public class Rooms {
	private boolean[] doors;
    private Person[] occupants;
    private Item[] items;
    public boolean explored;
    private int x, y;
    public static final int LEFT = 1;
	public static final int RIGHT = 2;
	public static final int UP = 0;
	public static final int DOWN = 3;
}
