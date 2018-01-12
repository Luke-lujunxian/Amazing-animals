import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EndFenestra {
    private JFrame bufo;  
    private static JButton b6;
    private static JButton b5;
    public EndFenestra(String n,double k,int b) {
    b6 = new JButton("最终基因型:"+b+"  适应度结果为："+k+"  退出");
    bufo=new JFrame(n);
    bufo.setSize(400,400);
    bufo.setLayout(new FlowLayout());
    bufo.add(b6);
    b6.setSize(150,50);
    bufo.setBackground(Color.green);
    bufo.setVisible(true);
    bufo.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    b6.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
        
            bufo.dispose();
        }
    });
    }
    public EndFenestra(String n,String k) {
    b6 = new JButton("退出");
    b5 = new JButton(k);
    bufo=new JFrame(n);
    bufo.setSize(400,400);
    bufo.setLayout(new FlowLayout());
    bufo.add(b5);
    bufo.add(b6);
    b6.setSize(150,50);
    bufo.setBackground(Color.green);
    bufo.setVisible(true);
    bufo.setDefaultCloseOperation(bufo.EXIT_ON_CLOSE);
    b6.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
    
            bufo.dispose();
        }
    });
    }
}
