package Panel;
import javax.swing.*;
import java.awt.*;

public class DrawFacePanel extends JPanel{
	public DrawFacePanel() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(10,10,10+100,10);
		g.drawLine(210,10,210+100,10);
		g.drawOval(10,50,40,40);
		g.drawOval(210,50,40,40);
		g.drawLine(150,70,110,370);
		g.drawLine(110,370,150,370);
		g.drawLine(90,400,290,400);
		g.drawLine(90,450,290,450);
	}
}
