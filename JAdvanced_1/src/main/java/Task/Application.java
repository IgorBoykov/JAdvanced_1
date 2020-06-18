package Task;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Cinema cinema = new Cinema(new Time(10, 00), new Time(22, 00));

		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			String str = sc.next();
			switch (str) {
			case "1":
				System.out.println("������ ����� ������:");
				String name = sc.next();
				System.out.println("������ ������ ����� ����� �����:");
				int hour = sc.nextInt();
				System.out.println("������ ������ ������ ����� �����:");
				int min = sc.nextInt();
				Time timeDuration = new Time(hour, min);
				Movie mov = new Movie(name, timeDuration);
				cinema.addMovie(mov);
				System.out.println("Գ��� ������!");
				break;

			case "2":
				System.out.println("����� ������ ������ � ����������:");
				int index = sc.nextInt();
				System.out.println("���� ������ �����? ���:");
				int hour2 = sc.nextInt();
				System.out.println("���� ������ �����? ��:");
				int min2 = sc.nextInt();
				System.out.println("� ���� ���� ������? (������� ����������)?");
				String day = sc.next();
				Time startTime = new Time(hour2, min2);
				Seance seans = new Seance(cinema.moviesLibrary.get(index), startTime);
				cinema.addSeance(seans, day);
				System.out.println("����� ������!");
				break;

			case "3":
				System.out.println("������ ������ ������:");
				int index3 = sc.nextInt();
				cinema.removeMovie(cinema.moviesLibrary.get(index3));
				break;

			case "4":
				System.out.println("� ���� ���� ��������� �������� ����� (������� ����������)?");
				String day3 = sc.next();
				System.out.println("����� ��������");
				break;

			case "5":
				System.out.println("Monday: " + cinema.schedules.get(Days.MONDAY));
				System.out.println("Tuesday: " + cinema.schedules.get(Days.TUESDAY));
				System.out.println("Wednesday: " + cinema.schedules.get(Days.WEDNESDAY));
				System.out.println("Thursday: " + cinema.schedules.get(Days.THURSDAY));
				System.out.println("Friday: " + cinema.schedules.get(Days.FRIDAY));
				System.out.println("Saturday: " + cinema.schedules.get(Days.SATURDAY));
				System.out.println("Sunday: " + cinema.schedules.get(Days.SUNDAY));
				break;

			case "0":
				System.exit(0);
			}
		}

	}

	private static void menu() {
		System.out.println("������ 1, ��� ������ ����� � ����������");
		System.out.println("������ 2, ��� ������ ����� � ������� �� ���������� ����");
		System.out.println("������ 3, ��� �������� ����� � ����������");
		System.out.println("������ 4, ��� �������� ����� � ���������� ����");
		System.out.println("������ 5, ��� ������� �������");
		System.out.println("������ 0, ��� �����");
		System.out.println();

	}
}
