package RegisterSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends JFrame implements ActionListener{
	private final String name="�̸�",belong="�Ҽ�",age="����",job="����",fundo="���",register="����";
	private final String[] fundos=new String[]{"����","�丮","�"};
	
	public RegisterFrame(){
		JLabel nameL=new JLabel(name);
		TextArea nameTA=new TextArea();
		JLabel belongL=new JLabel(belong);
		TextArea belongTA=new TextArea();
		JLabel ageL=new JLabel(age);
		JRadioButton ageRB1=new JRadioButton("10��");
		JRadioButton ageRB2=new JRadioButton("20��");
		JLabel jobL=new JLabel(job);
		JCheckBox jobCB1=new JCheckBox("�л�");
		JCheckBox jobCB2=new JCheckBox("ȸ���");
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
