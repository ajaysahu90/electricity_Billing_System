import javax.swing.*;
import java.awt.event.*;


public class Paytm extends JFrame implements ActionListener {
    String meter;
    JButton back;
    Paytm(String meter){
        setSize(800,600);
        setLocation(400,150);

        this.meter = meter;
        JEditorPane j = new JEditorPane();
        j.setEditable(false);

        try {
           j.setPage("https://paytm.com/online-payments");
        }catch (Exception e ){
            j.setContentType("text/html");
            j.setText("<html> <b>Page could not load.....<b><html>");


        }
        JScrollPane pane = new JScrollPane(j);
        add(pane);

        back = new JButton("Back");
        back.setBounds(640,20,80,30);
        back.addActionListener(this);
        j.add(back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new paybiill(meter);
    }
    public static void main(String[] args) {
        new  Paytm("");
    }
}
