package game;

public class GameRunner 
{
	/*public static void main (String[] args)
	{
		String[][] gotham = new String[5][10];
		for (int j = 0; j<gotham.length; j++)
        {
        	String[] row = gotham[j];
            for (int i = 0; i<row.length;i++)
            {
            	System.out.println(gotham[i][j]);
            }
            System.out.println();
        }
	} */
	public static void main (String[] args)
	{
		int rows = 10;
		int columns = 7;

		int[][] array = new int[rows][columns];

		for(int i = 0; i<rows; i++)
			for(int j = 0; j<columns; j++)
				array[i][j] = 0;

		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
