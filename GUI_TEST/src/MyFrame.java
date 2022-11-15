import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame{
	private JCheckBox[] fruits=new JCheckBox[3];
	private String[] names={"사과","배","귤"};
	private JLabel sumLabel;
	public MyFrame() {
		setTitle("세개의 과일이 나오는 체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		container.add(new JLabel("사과 100원, 배 500원, 굴 2000원"));
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
						
						sumLabel.setText("현재"+sum+"원입니다.");
					}
				}
			});
		}
		sumLabel = new  JLabel("현재 0원입니다.");
		container.add(sumLabel);
		setVisible(true);
	}
	
}
