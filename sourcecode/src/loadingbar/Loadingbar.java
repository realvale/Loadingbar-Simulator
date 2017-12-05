package loadingbar;

public class Loadingbar
{
	public static void main(String[] args)
	{
		System.out.println("Loading");

		for (int i = 1; i > 0; i++)
		{
			System.out.print(".");
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{

				e.printStackTrace();
			}

		}

	}

}
