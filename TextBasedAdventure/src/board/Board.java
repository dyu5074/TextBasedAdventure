package board;
// made by Derek Yu
import rooms.Rooms;

public class Board {


    private Rooms[][] Gotham;



    public Board(Rooms[][] Gotham)
    {
        this.Gotham = Gotham;
    }

    public void printGotham()
    {


        for(Rooms[] row : Gotham)
        {
            for (Rooms rooms : row)
            {
                rooms.print();
            }
            System.out.println();
        }
    }
    public Rooms[][] getGotham() {
        return Gotham;
    }

    public void setGotham(Rooms[][] Gotham) {
        this.Gotham = Gotham;
    }


}