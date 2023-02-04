
package bistro;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bistro extends Frame {
    JTextField txtorder,txtcustomer,txtqty,txtrates,txtamount,txtkitoweo,txtdrinkprice,txtpay;
JRadioButton plainrice,pilau,chips,chapati,ugali,spaghetti,bhajia;
JCheckBox chicken ,fish,cabbage,pork,sausage,meatball,soda,delmonte,minutemaid,water;
JButton breceipt,breset,bprint,bshow,bcalc;
JLabel lname,lpay,lorder,lcustomer,lqty,lrates,lamount,ldrinkprice,lkitoweo,lmaindish,lsidedish,lfish,lchicken,lcabbage,lpork,lsausage,lmeatball,ldrinks,lsoda,ldelmonte,lminutemaid,lwater;
Font f1, f2, f3,f4;
JTextArea receipt;
JComboBox pay;

 JFileChooser chooser; 
  
    // Default constructor to 
    // initialize the parameters

Bistro(){
    
    f1 = new Font("DialogInput", Font.BOLD, 30);
         f2 = new Font("SansSerif", Font.ITALIC, 16);
         f3 = new Font("Monospaced", Font.BOLD + Font.ITALIC, 18); 
         f4 = new Font("Monospaced", Font.BOLD, 15);
         
        lname = new JLabel(" VELINDISHES"); 
         lname.setBounds(400, 100, 250, 20); 
         lname.setFont(f1);
         lname.setForeground(Color.yellow);
         
         
         
         lorder = new JLabel( "Order no."); 
        lorder.setBounds(50, 150, 250, 20);
         txtorder = new JTextField(); 
        txtorder.setBounds(150, 150, 250, 20);
        txtorder.setBackground(Color.yellow);
        txtorder.setFont(f2);
        
        
        lcustomer= new JLabel( "Customer Name"); 
        lcustomer.setBounds(50, 200, 250, 20);
         txtcustomer = new JTextField(); 
        txtcustomer.setBounds(150, 200, 250, 20);
        txtcustomer.setBackground(Color.yellow);
         txtcustomer.setFont(f2);
        
        lqty = new JLabel( "Quantity"); 
        lqty.setBounds(50, 250, 250, 20);
        txtqty= new JTextField(); 
        txtqty.setBounds(150, 250, 250, 20);
        txtqty.setBackground(Color.yellow);
         txtqty.setFont(f2);
        
         
        
        lmaindish = new JLabel("MAINDISH");
        lmaindish.setBounds(50,330,250,20);
        lmaindish.setForeground(Color.yellow);
        lmaindish.setFont(f3);
        
        plainrice= new JRadioButton("Plain Rice");
        plainrice.setBounds(50, 350, 100, 30);
        plainrice.setBackground(Color.yellow);
              pilau = new JRadioButton("Pilau");
        pilau.setBounds(50, 400, 100, 30);
        pilau.setBackground(Color.yellow);
       

        chips = new JRadioButton("Chips");
        chips.setBounds(50, 450, 100, 30);
        chips.setBackground(Color.yellow);
       
   
        chapati = new JRadioButton("Chapati");
        chapati.setBounds(50,600,100,30);
        chapati.setBackground(Color.yellow);
       
        
        ugali = new JRadioButton("Ugali");
        ugali.setBounds(50, 500, 100, 30);
        ugali.setBackground(Color.yellow);
      
        
        spaghetti = new JRadioButton("Spaghetti");
        spaghetti.setBounds(50, 550, 100, 30);
        spaghetti.setBackground(Color.yellow);
       
        
         ButtonGroup bg = new ButtonGroup();
        
          bg.add(plainrice);
          bg.add(pilau);
          bg.add(chips);
          bg.add(chapati);
          bg.add(ugali);
          bg.add(spaghetti);
          
         
        
        
        
        
        
        //right hand side of the page
        lrates = new JLabel( "Maindish price"); 
        lrates.setBounds(500, 150, 250, 20);
        txtrates = new JTextField(); 
        txtrates.setBounds(600, 150, 250, 20);
        txtrates.setEditable(false);
        txtrates.setBackground(Color.yellow);
         txtrates.setFont(f2);
        
        ldrinkprice = new JLabel( "Drink Price"); 
        ldrinkprice.setBounds(500, 200, 250, 20);
        txtdrinkprice = new JTextField(); 
        txtdrinkprice.setBounds(600, 200, 250, 20);
        txtdrinkprice.setEditable(false);
         txtdrinkprice.setBackground(Color.yellow);
          txtdrinkprice.setFont(f2);
        
        lkitoweo = new JLabel( "Sidedish"); 
        lkitoweo.setBounds(500, 250, 250, 20);
        txtkitoweo = new JTextField(); 
        txtkitoweo.setBounds(600, 250, 250, 20);
         txtkitoweo.setEditable(false);
         txtkitoweo.setBackground(Color.yellow);
          txtkitoweo.setFont(f2);
          
           lamount = new JLabel( "Total Amount"); 
        lamount.setBounds(900, 150, 250, 20);
        txtamount = new JTextField(); 
        txtamount.setBounds(1000, 150, 250, 20);
         txtamount.setBackground(Color.yellow);
          txtamount.setFont(f2);
          txtamount.setEditable(false);
          
         lpay = new JLabel( "Pay via"); 
        lpay.setBounds(900, 200, 250, 20); 
         
          String payment[] = { " ", "MPESA", "CASH", "CHEQUE" }; 
 
        pay = new JComboBox(payment);
        pay.setBounds(1000, 200, 90, 20);
        pay.setBackground(Color.YELLOW);
        pay.setEnabled(true);
        
        txtpay=new JTextField();
         txtpay.setBounds(1200, 200, 100, 20);
          txtpay.setBackground(Color.YELLOW);
          txtpay.setEditable(false);
        
        pay.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                txtpay.setText((String)pay.getSelectedItem());
            }
    });
         
         lsidedish= new JLabel("SIDEDISH");
         lsidedish.setBounds(300, 330, 250, 20);
        lsidedish.setForeground(Color.yellow);
          lsidedish.setFont(f3);
          
         
                 
         chicken = new JCheckBox("1/4chicken");
        chicken.setBounds(300, 350, 100, 20);
        chicken.setBackground(Color.RED);
        
        
       
        fish = new JCheckBox("Fish");
        fish.setBounds(300, 400, 100, 20);
        fish.setBackground(Color.RED);
        
       
        cabbage = new JCheckBox("Cabbage");
        cabbage.setBounds(300, 450, 100, 20);
        cabbage.setBackground(Color.RED);
        
        
        pork = new JCheckBox("Pork");
        pork.setBounds(300, 500, 100, 20);
        pork.setBackground(Color.RED);
        
       
        sausage = new JCheckBox("Sausage");
        sausage.setBounds(300, 550, 100, 20);
        sausage.setBackground(Color.RED);
        
       
        meatball = new JCheckBox("Meatball");   
        meatball.setBounds(300, 600, 100, 20);
        meatball.setBackground(Color.RED);
        

        
        
        ldrinks= new JLabel("DRINKS");
         ldrinks.setBounds(500, 330, 250, 20);
         ldrinks.setForeground(Color.yellow);
          ldrinks.setFont(f3);
        
      
        soda = new JCheckBox("Soda");   
        soda.setBounds(500, 350, 100, 20);
        soda.setBackground(Color.RED);
        
        
        minutemaid = new JCheckBox("MinuteMaid");   
        minutemaid.setBounds(500, 400, 100, 20);
        minutemaid.setBackground(Color.RED);
        
         
        delmonte = new JCheckBox("Delmonte");   
        delmonte.setBounds(500, 450, 100, 20);
        delmonte.setBackground(Color.RED);
        
         
        
        water= new JCheckBox("Water");   
        water.setBounds(500, 500, 100, 20);
        water.setBackground(Color.RED);
        
        receipt = new JTextArea();
        receipt.setBackground(Color.YELLOW);
        receipt.setBounds(900, 500, 450, 250);
        receipt.setEditable(false);
        receipt.setFont(f2);
        
        breceipt = new JButton("Generate receipt");
        breceipt.setBounds(900, 470, 150, 20);
        breceipt.setBackground(Color.black);
         breceipt.setForeground(Color.RED);
        
        
        
          breset = new JButton("Reset");
        breset.setBounds(1100, 470, 100, 20);
        breset.setBackground(Color.BLACK);
        breset.setFont(f4);
        breset.setForeground(Color.RED);
        
        bprint = new JButton("Print");
        bprint.setBounds(1250, 470, 100, 20);
        bprint.setBackground(Color.BLACK);
        bprint.setFont(f4);
        bprint.setForeground(Color.RED);
        
        bshow = new JButton("show");
         bshow.setBounds(900, 430, 100, 20);
        bshow.setBackground(Color.BLACK);
        bshow.setFont(f4);
        bshow.setForeground(Color.cyan);
        
        
        
          bcalc = new JButton("TOTAL");
         bcalc.setBounds(1250, 430, 100, 20);
        bcalc.setBackground(Color.black);
        bcalc.setFont(f4);
        bcalc.setForeground(Color.cyan);
        
        
        
        
  
        add(lname);  
        add(lorder); 
        add(txtorder); 
        add(lcustomer); 
        add(txtcustomer); 
        add(lqty); 
        add(txtqty); 
        add(lrates); 
        add(txtrates); 
        add(ldrinkprice); 
        add(txtdrinkprice); 
        add(txtamount);
        add(lamount);
        add(lkitoweo);
        add(txtkitoweo);
        
        add(lmaindish);
         add(lsidedish);
         
        add(spaghetti);
        add(plainrice);
        add(pilau);
        add(chips);
        add(chapati);
        add(ugali);
        
        
        add(chicken);
        
        add(fish);
       
        add(cabbage);
        
        add(pork);
        
        add(sausage);
        
        add(meatball);
        
        
         add(ldrinks);
         
         add(soda);
        
         add(delmonte);
         
         add(minutemaid);
         
         add(water);
         
         add(receipt);
         add(breceipt);
         add(breset);
         add(bprint);
         
         add(pay);
         add(lpay);
         add(txtpay);
         add(bshow);
         
         add(bcalc);
         
         
         
         
          
         
         bshow.addActionListener((ActionEvent e) -> {
             
             String qual = " ";
             
            
             if (plainrice.isSelected()) {
                 
                 qual = "200";
             }
             
             else if (pilau.isSelected()) {
                 
                 qual = "300";
             }
             else if (chapati.isSelected()) {
                 
                 qual = "50";
             }
             else if (spaghetti.isSelected()) {
                 
                 qual = "280";
             }
             else if (ugali.isSelected()) {
                 
                 qual = "80";
             }
             else if (chips.isSelected()) {
                 
                 qual = "150";
             }
             
             else  {
                 
                 qual = "0";
             }
             
             // MessageDialog to show information selected radion buttons.
             txtrates.setText(qual);
    } // Anonymous class.
    ); 
         bshow.addActionListener((ActionEvent e) -> {
             // Override Method
             
             // Declaration of String class Objects.
             String qual = " ";
             
             // If condition to check if jRadioButton2 is selected.
             if (chicken.isSelected()) {
                 
                 qual = "250";
             }
             
             else if (fish.isSelected()) {
                 
                 qual = "300";
             }
             else if (pork.isSelected()) {
                 
                 qual = "280";
             }
             else if (cabbage.isSelected()) {
                 
                 qual = "80";
             }
             else if (meatball.isSelected()) {
                 
                 qual = "180";
             }
             else if (sausage.isSelected()) {
                 
                 qual = "50";
             }
             
             else  {
                 
                 qual = "0";
             }
             
             // MessageDialog to show information selected radion buttons.
             txtkitoweo.setText(qual);
    } // Anonymous class.
    ); 
          bshow.addActionListener((ActionEvent e) -> {
              // Override Method
              
              // Declaration of String class Objects.
              String qual = " ";
              
              // If condition to check if jRadioButton2 is selected.
              if (soda.isSelected()) {
                  
                  qual = "240";
              }
              
              else if (water.isSelected()) {
                  
                  qual = "80";
              }
              else if (delmonte.isSelected()) {
                  
                  qual = "280";
              }
              else if (minutemaid.isSelected()) {
                  
                  qual = "280";
              }
              
              
              
              else  {
                  
                  qual = "0";
              }
              
              // MessageDialog to show information selected radion buttons.
              txtdrinkprice.setText(qual);
    } // Anonymous class.
    ); 
         
         bcalc.addActionListener((ActionEvent e) -> {
              int a = Integer.parseInt(txtrates.getText());
              int b=Integer.parseInt(txtkitoweo.getText());
              int c=Integer.parseInt(txtdrinkprice.getText());
              int d =Integer.parseInt(txtqty.getText());
              
              String answer = String.valueOf((a + b + c)* d);
              
              txtamount.setText(answer);
    });  
            
         
          // Reset the text fields 
        breset.addActionListener((ActionEvent e) -> {
            
            receipt.setText("");
            txtorder.setText("");
            txtcustomer.setText("");
            txtrates.setText("");
            txtamount.setText("");
            txtkitoweo.setText("");
            txtqty.setText("");
            txtdrinkprice.setText("");
            
          bg.clearSelection();
            
            fish.setSelected(false);
            pork.setSelected(false);
            meatball.setSelected(false);
            cabbage.setSelected(false);
            sausage.setSelected(false);
            chicken.setSelected(false);
            
            
           
        }); 
        
        
        
                      // Implementing the Print action 
        bprint.addActionListener((ActionEvent e) -> {
            try {
                receipt.print();
            }
            catch (java.awt.print
                    .PrinterException a) {
                System.err.format(
                        "NoPrinter Found",
                        a.getMessage());
            }
        }); 
          // Generating the receipt 
        breceipt.addActionListener((ActionEvent e) -> {
            receipt.setText( 
                    "-------------"
                            + "---VELINDISHES RECEIPT----"
                            + "--------------------------"
                            + "--------------------------"
                            + "-------------------\n");
                             
                            
            
            receipt.setText(receipt.getText()
                    + "Paid via: "
                    + ((String)pay.getSelectedItem())
                    + "\n"); 
            receipt.setText(receipt.getText()
                    + "order no.: "
                    + txtorder.getText()
                    + "\n");
            receipt.setText(receipt.getText()
                    + "Customer: "
                    + txtcustomer.getText()
                    + "\n");
            receipt.setText(receipt.getText()
                    + "Quantity: "
                    + txtqty.getText()
                    + "\n");
            receipt.setText(receipt.getText()
                    + "Maindish price: "
                    + txtrates.getText()
                    + "\n");
            receipt.setText(receipt.getText()
                    + "Sidedish price: "
                    + txtkitoweo.getText()                          
                    + "\n");
            receipt.setText(receipt.getText()
                    + "Drinkprice: "
                    + txtdrinkprice.getText()
                    + "\n");
            
            receipt.setText(receipt.getText()
                    + "Total Amount: "
                    + txtamount.getText()                          
                    + "\n");
             receipt.setText(receipt.getText()
                    +  "ENJOY YOUR MEAL!"                             
                    + "\n"
                     +"WELCOME BACK AGAIN"
                     +"\n"
             );
            
            if (plainrice.isSelected()) {
                receipt.setText(receipt.getText()
                        + "Take "
                        + "Plain rice "
                         );
            }
            if (pilau.isSelected()) {
                receipt.setText(receipt.getText()
                        + "Take "
                        + "pilau "
                        );
            }
            if (ugali.isSelected()) {
                receipt.setText(receipt.getText()
                        + "Take "
                        + "ugali "
                        );
            }
            if (spaghetti.isSelected()) {
                receipt.setText(receipt.getText()
                        + "Take "
                        +"spaghetti "
                        );
            }
            if (chapati.isSelected()) {
                receipt.setText(receipt.getText()
                        + "Take "
                        +"Chapati "
                        );
            }
            if (chips.isSelected()) {
                receipt.setText(receipt.getText()
                        + "Take "
                        +"Chips "
                        );
            }
             if (delmonte.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"Delmonte "
                        );
            }
              if (minutemaid.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"minutemaid "
                        );
            }
               if (water.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"water "
                        );
            }
             if (soda.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"Soda "
                        );
            }
              if (pork.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"Pork "
                        );
            }
               if (cabbage.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and  "
                        +"Cabbage "
                        );
            }
                if (sausage.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"Sausage "
                        );
            }
                 if (meatball.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"Meatball "
                        );
            }
                  if (fish.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"Fish"
                        );
            }
                   if (chicken.isSelected()) {
                receipt.setText(receipt.getText()
                        + "and "
                        +"Chicken "
                        );
            }
                   
                   
      
            
            if (e.getSource() == breceipt) {
                try {
                    try (FileWriter fw = new FileWriter(
                            "java.txt", true)) {
                        fw.write(receipt.getText());
                    }
                }
                catch (IOException ae) {
                    System.out.println(ae);
                }
            }
            
            JOptionPane.showMessageDialog(
                    receipt, "DATA SAVED SUCESSFULLY"); 
        }); 
        addWindowListener( 
            new WindowAdapter() { 
                @Override
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    System.exit(0); 
                } 
            }); 
        
         setSize(800, 800); 
        setLayout(null);
        setVisible(true); 
        setBackground(Color.RED);
        
        
}
public static void main(String[] args) 
    { 
        
        new Bistro(); 
    } 

    
	
}

   

    