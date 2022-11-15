import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame{
	private JCheckBox[] fruits=new JCheckBox[3];
	private String[] names={"���","��","��"};
	private JLabel sumLabel;
	public MyFrame() {
		setTitle("������ ������ ������ üũ�ڽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		container.add(new JLabel("��� 100��, �� 500��, �� 2000��"));
		for(int i=0; i<fruits.length;i++) {
			fruits[i]=new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			container.add(fruits[i]);
			fruits[i].addItemListener(new ItemListener(){
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					int sum=0;
					int is_click_apple=0,is_click_orange=0,is_click_pear=0;
					if(e.getStateChange()==ItemEvent.SELECTED) {
						if(e.getItem()==fruits[0]) {
							is_click_apple+=1;
						}
						if(e.getItem()==fruits[1]) {
							is_click_pear+=1;
						}
						if(e.getItem()==fruits[2]) {
							is_click_orange+=1;
						}
						sum=is_click_apple*100+is_click_pear*500+is_click_orange*2000;
						
						sumLabel.setText("����"+sum+"���Դϴ�.");
					}
				}
			});
		}
		sumLabel = new  JLabel("���� 0���Դϴ�.");
		container.add(sumLabel);
		setVisible(true);
	}
	
}
