package opgave3Teater;

import java.io.IOError;
import java.util.Scanner;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		// TODO
		theater.printTheaterFloor();
        System.out.println();
        System.out.println();

		theater.buySeat(50);
		theater.buySeat(1,1);

		theater.printTheaterFloor();
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to buy a seat? (Y or N) ");
        String s = input.nextLine();

        if (s.trim().equalsIgnoreCase("y")) {
            theater.printTheaterFloor();
            System.out.println();
            System.out.println("What row and seat do you want?");
            int row = input.nextInt();
            int seat = input.nextInt();
            int price = theater.buySeat(row, seat);
            if(price == 0) {
                System.out.println("Seat taken, start over");
                input.close();
            } else {
                System.out.println("Ticket bought for: " + price);
                input.close();
            }
        }
	}
}
