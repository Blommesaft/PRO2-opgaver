package opgave3Teater;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
				  	  { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
					  { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
					  { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
					  { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
					  { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
					  { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
					  { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
				 	  { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	int[][][] sæder = {
			{       {10, 10, 10},
					{10, 10, 10},
					{10, 10, 10} },
			{					 {10, 10, 10},
								 {10, 10, 10},
					             {10, 10, 10} },
			{                                 {10, 10, 10},
					                          {10, 10, 10},
					                          {10, 10, 10} }
						};

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int seat) {
		// TODO
		int pris = seats[row][seat];
		if (pris != 0) {
			seats[row][seat] = 0;
			return pris;
		}
		return pris;
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */
	public int buySeat(int price) {
		for (int row = 0; row < seats.length; row++) {
			for (int seat = 0; seat < seats[row].length; seat++) {
				int priceOfSeat = seats[row][seat];
				if (priceOfSeat == price) {
					seats[row][seat] = 0;
					return price;
				}
			}
		}
		return 0;
	}

	public void printTheaterFloor() {
		// TODO
		System.out.println("   Sæde : 1   2   3   4   5   6   7   8   9   10");
		System.out.println("          --------------------------------------");
		for (int row = 0; row < seats.length; row++) {
			System.out.print("Række " + row + " : ");

			for (int seat = 0; seat < seats[row].length; seat++) {
				System.out.print(seats[row][seat] + ", ");
			}
			System.out.println();
		}
	}
}
