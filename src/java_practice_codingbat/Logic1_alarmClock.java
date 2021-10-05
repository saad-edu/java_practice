package java_practice_codingbat;

import java.util.Scanner;

//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

public class Logic1_alarmClock {

	public static void main(String[] args) {
		int day;
		boolean vacation;
		Scanner input = new Scanner(System.in);
		System.out.print("Which day? (0 - 6): ");
		day = input.nextInt();
		System.out.print("On vacation? : ");
		vacation = input.nextBoolean();
		System.out.println(alarmClock(day, vacation));

		input.close();
	}

	public static String alarmClock(int day, boolean vacation) {
		return vacation == true ? (day == 6 || day == 0 ? "off" : "10:00") : (day == 6 || day == 0 ? "10:00" : "7:00");
	}

}
