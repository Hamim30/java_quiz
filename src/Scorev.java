import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scorev extends JFrame implements ActionListener {
    Scorev(String name2, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(-10,-10,300,250);
        add(image);

        JLabel heading= new JLabel("Thank you" + name2 + "For Playing");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        JLabel sc= new JLabel("Your score is" +score);
        sc.setBounds(355,200,300,30);
        sc.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(sc);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(){
        new Scorev("User",0);
    }
}
