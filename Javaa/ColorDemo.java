import java.awt.*;
import java.awt.event.*;

public class ColorDemo extends Frame {

public ColorDemo() {
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

// Draw in different colors.
public void paint(Graphics g)
 {




g.setColor(Color.yellow);
g.fillRect(60, 200, 200, 120);



g.setColor(Color.blue);
g.fillRect(140, 270, 50, 50);



}

public static void main(String[] args) {
ColorDemo appwin = new ColorDemo();

appwin.setSize(new Dimension(340, 260));
appwin.setTitle("ColorDemo");
appwin.setVisible(true);
}
}
