/*
Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers.
Implement using threads. (Thread class)
*/


import java.util.*;

public class Mythread
{

     public static void main(String args[])
     {

	 Scanner in=new Scanner(System.in);
	 System.out.println("Prime Numbers from 1 to 10 and Multiplication of 5");
	 System.out.println("---------------------------------------------------");
       
	 Runnable r = new Prime();
	 Thread t = new Thread(r);
	 t.start();
       
	 Runnable r2 = new Multi();
	 Thread t2 = new Thread(r2);
	 t2.start();
       
    }
}

class Multi implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("Multiplication table of 5 * "+i+" = "+i*5);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}  
	}
}

class Prime implements Runnable
{
	public void run()
	{
		try
		{
			int i, j, c;
			
			for(i=2; i<=10; i++)
			{
				c= 0;
				for(j=2; j<i; j++)
				{
					if(i%j==0)
					{
						c++;
						break;
					}
				}
				if(c==0)
				{
					System.out.println(i+" is a prime number ");
				}
				else
				{
					System.out.println(i+" is not a prime number ");
				}
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("error:");
		}
	}
}



/*

OUTPUT


Prime Numbers from 1 to 10 and Multiplication of 5
---------------------------------------------------
2 is a prime number 
Multiplication table of 5 * 1 = 5
Multiplication table of 5 * 2 = 10
Multiplication table of 5 * 3 = 15
3 is a prime number 
Multiplication table of 5 * 4 = 20
Multiplication table of 5 * 5 = 25
4 is not a prime number 
Multiplication table of 5 * 6 = 30
Multiplication table of 5 * 7 = 35
Multiplication table of 5 * 8 = 40
5 is a prime number 
Multiplication table of 5 * 9 = 45
6 is not a prime number 
7 is a prime number 
8 is not a prime number 
9 is not a prime number 
10 is not a prime number 


*/

//4. Develop a program to handle Key events.




import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends Frame
implements KeyListener {

String msg = "";
String keyState = "";
public KeyEvents() {
addKeyListener(this);
addWindowListener(new MyWindowAdapter());
}

// Handle a key press.
public void keyPressed(KeyEvent ke) {
keyState = "Key IN";
repaint();
}

// Handle a key release.
public void keyReleased(KeyEvent ke) {
keyState = "Key OUT";
repaint();
}

// Handle key typed.
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}

// Display keystrokes.
public void paint(Graphics g) {
g.drawString(msg, 20, 100);
g.drawString(keyState, 20, 50);
}

public static void main(String[] args) {
KeyEvents appwin = new KeyEvents();

appwin.setSize(new Dimension(200, 150));
appwin.setTitle("SimpleKey");
appwin.setVisible(true);
}
}

// When the close box in the frame is clicked,
// close the window and exit the program.
class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}
