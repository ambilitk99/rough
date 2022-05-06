/* 1. Create interfaces Student and Sports. 
Create a class Result implements Student and Sports.Display the academic and sports score of a student.*/


interface student
{
	int score=30;
	void displayscore();
}

interface sports
{
	int score=50;
	void displaysportsscore();
}

class Result implements student,sports
{
	public void displayscore()
	{
		System.out.println("Score : "+student.score);
	}
	public void displaysportsscore()
	{
		System.out.println("Sports score : "+sports.score);
	}

}

public class StudentResult1
{
	public static void main(String args[])
	{
		Result r = new Result();
		r.displayscore();
		r.displaysportsscore();
	}
}


/*

OUTPUT

Score : 30
Sports score : 50

*/
