import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class project extends JFrame implements ActionListener {

    String atype , meter;
    project(String atype , String meter){
        this.atype = atype;
        this.meter = meter;

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =  new JLabel(i3);
        add(image);

        JMenuBar mb  = new JMenuBar();
        setJMenuBar(mb);


        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);

        setLayout(new FlowLayout());

        JMenuItem newcustomer  = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,12));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.addActionListener(this);
        newcustomer.setIcon(new ImageIcon(image1));
        master.add(newcustomer);

        JMenuItem customerdetails  = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        customerdetails.setBackground(Color.WHITE);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.addActionListener(this);
        master.add(customerdetails);


        JMenuItem depositdetails  = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        depositdetails.setBackground(Color.WHITE);
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(image3));
        depositdetails.addActionListener(this);
        master.add(depositdetails);

        JMenuItem calculatebill  = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,12));
        calculatebill.setBackground(Color.WHITE);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image4 = icon4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.addActionListener(this);
        master.add(calculatebill);


        JMenu info = new JMenu("Information");
        info.setForeground(Color.RED);


        JMenuItem updateInformation  = new JMenuItem("Update Information");
        updateInformation.setFont(new Font("monospaced",Font.PLAIN,12));
        updateInformation.setBackground(Color.WHITE);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5 = icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        updateInformation.setIcon(new ImageIcon(image5));
        updateInformation.addActionListener(this);
        info.add(updateInformation);

        JMenuItem viewInformation  = new JMenuItem("View Information");
        viewInformation.setFont(new Font("monospaced",Font.PLAIN,12));
        viewInformation.setBackground(Color.WHITE);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewInformation.setIcon(new ImageIcon(image6));
        viewInformation.addActionListener(this);
        info.add(viewInformation);

        JMenu user = new JMenu("User");
        user.setForeground(Color.BLACK);


        JMenuItem paybill  = new JMenuItem("Pay Bill");
        paybill .setFont(new Font("monospaced",Font.PLAIN,12));
        paybill .setBackground(Color.WHITE);
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image7 = icon7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.addActionListener(this);
        user.add(paybill);

        JMenuItem billdetails  = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        billdetails.setBackground(Color.WHITE);
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image8 = icon8.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.addActionListener(this);
        billdetails.setIcon(new ImageIcon(image8));
        user.add(billdetails);

        JMenu report = new JMenu("Report");
        report.setForeground(Color.RED);


        JMenuItem generateBill  = new JMenuItem("Generate Bill");
        generateBill .setFont(new Font("monospaced",Font.PLAIN,12));
        generateBill .setBackground(Color.WHITE);
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image9 = icon9.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        generateBill.setIcon(new ImageIcon(image9));
        generateBill.addActionListener(this);
        report.add(generateBill);

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);

        JMenuItem notepad  = new JMenuItem("Notepad");
        notepad .setFont(new Font("monospaced",Font.PLAIN,12));
        notepad .setBackground(Color.WHITE);
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image10 = icon10.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(image10));
        notepad.addActionListener(this);
        utility.add(notepad);


        JMenuItem calculator  = new JMenuItem("Calculator");
        calculator .setFont(new Font("monospaced",Font.PLAIN,12));
        calculator .setBackground(Color.WHITE);
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image11 = icon11.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenu mexit = new JMenu("Exit");
        mexit.setForeground(Color.BLUE);


        JMenuItem exit  = new JMenuItem("Exit");
        exit .setFont(new Font("monospaced",Font.PLAIN,12));
        exit .setBackground(Color.WHITE);
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image12 = icon12.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image12));
        exit.addActionListener(this);
        mexit.add(exit);

        if (atype.equals("Admin")){
            mb.add(master);
        }else {
            mb.add(info);
            mb.add(user);
            mb.add(report);
        }
        mb.add(utility);
        mb.add(mexit);






        setLayout(new FlowLayout());


        setVisible(true);

    }
    public  void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if (msg.equals("New Customer")){
            new Newcustomer();
        } else if(msg.equals("Customer Details")){
            new CustomerDetails();
        } else if(msg.equals("Deposit Details")){

            new DepositeDetails();

        }else if(msg.equals("Calculate Bill")){
            new calculatebill();
        }else if (msg.equals("View Information")){
            new Viewinformation(meter);
        }else if (msg.equals("Update Information")){
            new Updateinformation(meter);
        }else if (msg.equals("Bill Details")){
            new BillDetails(meter);
        }else if (msg.equals("Notepad")){
            try{
               Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if (msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if (msg.equals("Exit")){
            setVisible(false);
            new Login();
        }else if (msg.equals("Pay Bill")){
            new paybiill(meter);
        }else if (msg.equals("Generate Bill")){
            new generatebill(meter);
        }
    }


    public static void main(String[] args) {
        new project("","");
    }
}
