package RegisterSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends JFrame implements ActionListener{
	private final String name="이름",belong="소속",age="나이",job="직업",fundo="취미",register="가입";
	private final String[] fundos=new String[]{"게임","요리","운동"};
	
	public RegisterFrame(){
		JLabel nameL=new JLabel(name);
		TextArea nameTA=new TextArea();
		JLabel belongL=new JLabel(belong);
		TextArea belongTA=new TextArea();
		JLabel ageL=new JLabel(age);
		JRadioButton ageRB1=new JRadioButton("10대");
		JRadioButton ageRB2=new JRadioButton("20대");
		JLabel jobL=new JLabel(job);
		JCheckBox jobCB1=new JCheckBox("학생");
		JCheckBox jobCB2=new JCheckBox("회사원");
		JLabel fundoL=new JLabel(fundo);
		JComboBox<String> fundoCB=new JComboBox<String>();
		for(int i=0;i<fundos.length;i++) {
			fundoCB.addItem(fundos[i]);
		}
		JButton registerBt=new JButton(register);
		registerBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		public TextArea alertTA=new TextArea();
		Container container=this.getContentPane();
		container.setLayout(new FlowLayout());
		container.add(nameL);
		container.add(nameTA);
		container.add(belongL);
		container.add(belongTA);
		container.add(ageL);
		container.add(ageRB1);
		container.add(ageRB2);
		container.add(jobL);
		container.add(jobCB1);
		container.add(jobCB2);
		container.add(fundoL);
		container.add(fundoCB);
		container.add(registerBt);
		container.add(alertTA);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
