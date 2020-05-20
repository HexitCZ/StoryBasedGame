package Characters;

import Characters.Character.Line;
import Core.Main;

public class Player
{
	public Anwser[] anwsers = new Anwser[3];

	public Anwser CurAnw;

	public void Start()
	{

		anwsers[0] = new Anwser("s1", "end", "p", "Okay", "Lets go to the park");
		anwsers[1] = new Anwser("p1", "end", "2", "Okay", "So green");
		anwsers[2] = new Anwser("p2", "end", "end", "Okay", "Okay?");
	}

	public class Anwser
	{
		public String requiredStatus;
		public String statusChange;
		public String statusChange2;

		public String anwserOne;
		public String anwserTwo;

		public Anwser(String reqSt, String sChange, String sChange2, String a1, String a2)
		{
			requiredStatus = reqSt;
			statusChange = sChange;
			statusChange2 = sChange2;
			anwserOne = a1;
			anwserTwo = a2;
		}

	}

	public void Talk()
	{
		for (int i = 0; i < anwsers.length; i++)
		{

			if (anwsers[i].requiredStatus.compareTo(Main.status) == 0)
			{
				System.out.print(anwsers[i].anwserOne);
				System.out.print(" (a)");
				System.out.print("  |  ");
				System.out.print(anwsers[i].anwserTwo);
				System.out.print(" (d)");

				CurAnw = anwsers[i];
				break;
			}
		}
	}
}
