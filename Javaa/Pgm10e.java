/*Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square and 
circle.Draw the corresponding shapes for given parameters as per user’s choice. */


import java.awt.*;
import java.awt.event.*;

class ChoiceDemo extends Frame implements ItemListener 
{
	Choice shapes;
	String msg = "";

	public ChoiceDemo() 
	{
	setLayout(new FlowLayout());           // Use a flow layout.                     
	shapes = new Choice();                 // Create choice lists.

	shapes.add("Rectangle");               // Add items to browser list.
	shapes.add("Triangle");
	shapes.add("Square");
	shapes.add("Circle");
                                
	add(shapes);                           // Add choice lists to window.
               
	shapes.addItemListener(this);          // Add item listeners

	
	addWindowListener(new WindowAdapter() 
	{
		public void windowClosing(WindowEvent we) 
		{
		System.exit(0);
		}
	});
	}

	
	public void itemStateChanged(ItemEvent ie) 
	{
        msg=shapes.getSelectedItem();
        repaint();
    }


	public void paint(Graphics g)                  // Display current selections
	{
    	if(msg.equals("Rectangle"))
    	{
        	g.setColor(Color.green);
            g.fillRect(100,100,300,200);           //drawing rectangle
    	}
   		else if(msg.equals("Square"))
   		{
        	g.setColor(Color.blue); 
            g.fillRect(100,100,250,250);           //drawing square
		}
  		else if(msg.equals("Triangle"))
  		{
         	int xpoints[]={100,690,380};
            int ypoints[]={400,400,300};
            g.setColor(Color.pink);
            g.fillPolygon(xpoints,ypoints,3);    //drawing triangle
   		}
  		else if(msg.equals("Circle"))
  		{
          	g.setColor(Color.yellow);
          	g.fillOval(100,100,140,140);           //drawing circle
		}
		else
		{ }
	}	
	
	
	public static void main(String[] args) 
	{
      	ChoiceDemo appwin = new ChoiceDemo();      //setting frame properties
      	
    	appwin.setSize(new Dimension(500, 500));
    	appwin.setTitle("ChoiceDemo");
    	appwin.setVisible(true);
  	}		
}

class MyWindowAdapter extends WindowAdapter 
{
	public void windowClosing(WindowEvent we) 
	{
	System.exit(0);
	} 
}


        
