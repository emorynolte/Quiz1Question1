package pkgQuiz;

import java.util.Scanner;

public class Stats {
	
	private int AB;
	private int H;
	private int _1B;
	private int _2B;
	private int _3B;
	private int HR;
	private int R;
	private int BB;
	private String playerName;
	
	public Stats()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input the player's name:");
		playerName = scanner.next();
		
		System.out.println("Input the at bats:");
		AB = scanner.nextInt();
		
		System.out.println("Input the hits:");
		H = scanner.nextInt();
		
		System.out.println("Input the doubles:");
		_2B = scanner.nextInt();
				
		System.out.println("Input the triples:");
		_3B = scanner.nextInt();
		
		System.out.println("Input the home runs:");
		HR = scanner.nextInt();
		
		System.out.println("Input the runs:");
		R = scanner.nextInt();
		
		System.out.println("Input the walks:");
		BB = scanner.nextInt();
		
		_1B = (H - _2B - _3B - HR);
		
	}
	
	
	public double battingAverage()
	{
		return ((double) H) / AB;
		
	}
	
	public double onBasePercentage()
	{	
		return (((double) (H + BB)) / AB);	
	}
	
	public double sluggingPercentage()
	{
		return (double) ((_1B) + (_2B * 2) + (_3B * 3) + (HR * 4)) / AB;
	}
	
	public double OBS()
	{
		return (onBasePercentage() + sluggingPercentage());
	}
	
	public int totalBases()
	{
		return ((_1B) + (_2B * 2) + (_3B * 3) + (HR * 4));
	}
	

}
