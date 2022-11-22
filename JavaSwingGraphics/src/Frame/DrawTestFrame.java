package Frame;
import javax.swing.*;
import Panel.*;

public class DrawTestFrame extends JFrame{
	public DrawTestFrame() {
		DrawFacePanel drawpanel=new DrawFacePanel();
		DrawFillShapePanel drawfillP=new DrawFillShapePanel();
		this.setContentPane(drawfillP);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1600/2,900/2);
        this.setLocationRelativeTo(null);
	}
}
