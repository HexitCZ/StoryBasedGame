package Characters;

import Core.Main;

public class Character
{
	public Line[] lines = new Line[3];

	public void Start()
	{

		lines[0] = new Line("s1", "Hello!");
		lines[1] = new Line("p1", "This is our park!");
		lines[2] = new Line("p2", "I know c:");

	}

	public class Line
	{
		public String requiredStatus;
		public String line;

		public Line(String reqSt, String li)
		{
			requiredStatus = reqSt;
			line = li;
		}

	}

	public void Talk()
	{
		for (int i = 0; i < lines.length; i++)
		{

			if (lines[i].requiredStatus.compareTo(Main.status) == 0)
			{
				System.out.println(lines[i].line);
				break;
			}
		}

	}

}
