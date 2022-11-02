import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        Container container=new Container();
        container.add(new JLabel("이름"));
        container.add(new JLabel("학번"));
        container.add(new JLabel("수강과목"));
        container.add(new JLabel("학점"));
        container.add(new TextArea());
        container.add(new TextArea());
        container.add(new TextArea());
        container.add(new TextArea());
        container.add(new TextArea());
        container.add(new TextArea());
        container.add(new Button("평점"));
        container.add(new TextArea());
        container.setLayout(new GridLayout(6,2));
        panel.add(container);
        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
