import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.sql.Struct;

public class rules extends JFrame implements ActionListener {
    String name2;
    JButton back, start;

    rules(String name2){
        this.name2 =name2;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel name= new JLabel("Welcome "+ name2+ " to simple minds");
        name.setBounds(30,20,700,30);
        name.setFont(new Font("Times New Roman",Font.BOLD,30));
        name.setForeground(new Color(30,144,254));
        add(name);

        JLabel rls= new JLabel();
        rls.setBounds(20,90,300,350);
        rls.setFont(new Font("Tahoma",Font.PLAIN,16));
        rls.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
        add(rls);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.BLUE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.BLUE);
        back.addActionListener(this);
        add(back);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== start){
            setVisible(false);
            new Quiz(name2);
        }else{
            setVisible(false);
            new login();
        }
    }


    public static void main(String[] args){
        new rules("User");
    }
}
