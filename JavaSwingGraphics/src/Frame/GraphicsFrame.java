package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Logger;

public class GraphicsFrame extends JFrame {
    public JRadioButton redRB,yellowRB,blueRB,blackRB,whiteRB;
    public JButton lineBT,rectBT,ellipseBT,curve_lineBT;
    private ArrayList<Integer> colorids=new ArrayList<>();
    private ArrayList<Integer> shapeids=new ArrayList<>();
    private int point_x;
    private int point_y;
    private int time;
    private int colorid;
    private int shapeid;
    private JTextField inputXTB,inputYTB;

    private DrowPanel drowPanel=new DrowPanel();
    public JPanel panel=new JPanel();
    public GraphicsFrame(){
        time=0;
        lineBT=new JButton("직선 생성");
        rectBT=new JButton("직사각형 생성");
        ellipseBT=new JButton("타원 생성");
        curve_lineBT=new JButton("곡선 생성");
        //버튼입력시 모양 생성
        lineBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setShapeid(0);//shapeid지정
                try {
                    setPoint_x(Integer.parseInt(inputXTB.getText()));//x,y값 최종 대입
                    setPoint_y(Integer.parseInt(inputYTB.getText()));
                }
                catch(Exception exception){
                    setPoint_x(0);
                    setPoint_y(0);
                }
                colorids.add(colorid);//색깔 최종 생성
                shapeids.add(shapeid);//모양 최종 생성
                time++;
            }
        });
        rectBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setShapeid(1);//shapeid지정

                try {
                    setPoint_x(Integer.parseInt(inputXTB.getText()));//x,y값 최종 대입
                    setPoint_y(Integer.parseInt(inputYTB.getText()));
                }
                catch(Exception exception){
                    setPoint_x(0);
                    setPoint_y(0);
                }

                colorids.add(colorid);//색깔 최종 생성
                shapeids.add(shapeid);//모양 최종 생성
                time++;
            }
        });
        ellipseBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setShapeid(2);//shapeid지정

                try {
                    setPoint_x(Integer.parseInt(inputXTB.getText()));//x,y값 최종 대입
                    setPoint_y(Integer.parseInt(inputYTB.getText()));
                }
                catch(Exception exception){
                    setPoint_x(0);
                    setPoint_y(0);
                }
                colorids.add(colorid);//색깔 최종 생성
                shapeids.add(shapeid);//모양 최종 생성
                time++;
            }
        });
        curve_lineBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setShapeid(3);//shapeid지정

                try {
                    setPoint_x(Integer.parseInt(inputXTB.getText()));//x,y값 최종 대입
                    setPoint_y(Integer.parseInt(inputYTB.getText()));
                }
                catch(Exception exception){
                    setPoint_x(0);
                    setPoint_y(0);
                }
                colorids.add(colorid);//색깔 최종 생성
                shapeids.add(shapeid);//모양 최종 생성
                time++;
            }
        });
        //색깔 설정 라디오버튼 생성
        whiteRB=new JRadioButton("White");
        redRB=new JRadioButton("Red");
        yellowRB=new JRadioButton("Yellow");
        blueRB=new JRadioButton("Blue");
        blackRB=new JRadioButton("Black");
        //색깔 설정 이벤트 설정
        whiteRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setColorid(0);
            }
        });
        redRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setColorid(1);
            }
        });
        yellowRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setColorid(2);
            }
        });

        blueRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setColorid(3);
            }
        });
        blackRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setColorid(4);
            }
        });
        //x,y값 입력하는 텍스트필드
        inputXTB=new JTextField("x값 입력");
        inputYTB=new JTextField("y값 입력");
        //container에 순서대로 저장
        Container container=new Container();
        //화면에 최종 추가
        container.setLayout(new FlowLayout());
        container.add(lineBT);
        container.add(rectBT);
        container.add(ellipseBT);
        container.add(curve_lineBT);
        container.add(whiteRB);
        container.add(redRB);
        container.add(yellowRB);
        container.add(blueRB);
        container.add(blackRB);
        container.add(inputXTB);
        container.add(inputYTB);
        drowPanel.add(container);
        this.setContentPane(drowPanel);
        this.setTitle("이미지 편집");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1600/2,900/2);
        this.setLocationRelativeTo(null);
    }

    class DrowPanel extends JPanel{
        ImageIcon imageI=new ImageIcon("src/resource/image/cheese.png");
        Image iI=imageI.getImage();
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.drawImage(iI,0,0,null);
            g.setColor(Color.BLACK);
            g.fillRect(getPoint_x(),getPoint_y(),20,30);
            for (int i=0;i<time;i++) {
                setDrawColor(g);
                setDrawShape(g);
            }
        }
        public DrowPanel(){
            this.revalidate();
            this.repaint();
        }

        private void setDrawColor(Graphics g){
            int cid=getColorids().get(time);
            if(cid==0){
                g.setColor(Color.WHITE);
            }
            else if(cid==1){
                g.setColor(Color.RED);
            }
            else if(cid==2){
                g.setColor(Color.YELLOW);
            }
            else if(cid==3){
                g.setColor(Color.BLUE);
            }
            else if(cid==4){
                g.setColor(Color.BLACK);
            }
        }
        private void setDrawShape(Graphics g){
            int shid=getShapeids().get(time);
            if(shid==0){
                g.drawLine(30,30,getPoint_x(),getPoint_y());
            }
            else if(shid==1){
                g.drawRect(30,30,getPoint_x(),getPoint_y());
            }
            else if(shid==2){
                g.drawOval(30,30,getPoint_x(),getPoint_y());
            }
            else if(shid==3){
                double lerp_x=(getPoint_x()-30)/1000;
                double lerp_y=(getPoint_y()-30)/1000;
                for(double i=0;i<1000;i++){
                    g.drawLine((int)(30+Math.cos(180*((i)/1000))*lerp_x*(i)),(int)(30+Math.sin(180*((i)/1000))*lerp_y*(i)),(int)(30+Math.cos(180*((i+1)/1000))*lerp_x*(i+1)),(int)(30+Math.sin(180*((i+1)/1000))*lerp_y*(i+1)));
                }
            }
        }
    }

    public int getPoint_x() {
        return point_x;
    }

    public void setPoint_x(int point_x) {
        this.point_x = point_x;
    }

    public int getPoint_y() {
        return point_y;
    }

    public void setPoint_y(int point_y) {
        this.point_y = point_y;
    }

    public ArrayList<Integer> getColorids() {
        return colorids;
    }
    public ArrayList<Integer> getShapeids() {
        return shapeids;
    }
    public void setColorid(int colorid) {
        this.colorid = colorid;
    }
    public void setShapeid(int shapeid) {
        this.shapeid = shapeid;
    }
}
