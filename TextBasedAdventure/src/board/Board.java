package board;

import rooms.Room;

public class Board {


    private Room[][] map1;



    public Board(Room[][] map1)
    {
        this.map1 = map1;
    }

    public void printmap1()
    {


        for(Room[] row : map1)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] getmap1() {
        return map1;
    }

    public void setmap1(Room[][] map1) {
        this.map1 = map1;
    }


}