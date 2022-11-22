package Panel;
import javax.swing.*;
import java.awt.*;

public class DrawFillShapePanel extends JPanel{
	public DrawFillShapePanel() {
		
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(10,10,100,100);
	}
}
