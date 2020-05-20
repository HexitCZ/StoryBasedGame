package Core;

import java.util.Scanner;

import Characters.Character;
import Characters.Player;

public class Main
{

	public static String place = "s";
	public static String phrase = "1";
	public static String status = place + phrase;

	public static boolean GameOn = true;

	public static Character testCharak = new Character();

	public static Player player = new Player();

	public static String anwseredChange;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Start.StartM();

		while (GameOn == true)
		{
			status = place + phrase;
			testCharak.Talk();
			player.Talk();
			System.out.println();
			String temp = sc.nextLine();
			if (temp.compareTo("a") == 0)
				Status(player.CurAnw.statusChange, !IsNumber(player.CurAnw.statusChange));
			else if (temp.compareTo("d") == 0)
				Status(player.CurAnw.statusChange2, !IsNumber(player.CurAnw.statusChange2));
			System.out.println();
		}

	}

	public static boolean IsNumber(String s)
	{

		if (s == null)
		{

			return false;
		}
		try
		{
			int d = Integer.parseInt(s);

		} catch (NumberFormatException nfe)
		{

			return false;

		}

		return true;
	}

	public static void Status(String change, boolean isItPlace)
	{
		if (isItPlace)
		{

			switch (change)
			{
			case "p":
				place = "p";
				break;

			case "s":
				place = "s";
				break;

			case "end":
				GameOn = false;
				break;

			}
			status = place + phrase;
		} else
		{
			phrase = change;

		}
	}

}
