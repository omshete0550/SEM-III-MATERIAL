import java.awt.*;
import java.awt.event.*;


class GUI
{
  public static void main(String[] args)
  {
    Frame f = new Frame("GUI");

    Button b1 = new Button("SUBMIT");
    b1.setBounds(170,350,125,50);
    f.add(b1);

    Button b2 = new Button("RESET");
    b2.setBounds(370,350,125,50);
    f.add(b2);
    
    Choice c1 = new Choice();
    c1.setBounds(570,200,75,30);
    f.add(c1);
    c1.add("FE");
    c1.add("SE");
    c1.add("TE");
    c1.add("BE");

    Choice c2 = new Choice();
    c2.setBounds(570,250,75,30);
    f.add(c2);
    c2.add("C1");
    c2.add("C2");
    c2.add("C3");
    
    
    TextField tf = new TextField();
    tf.setBounds(120,105,150,20);
    
    TextArea area = new TextArea("");
    area.setBounds(120,150,300,150);

    Checkbox chk1 = new Checkbox("Male");
    chk1.setBounds(500,120,50,50);
    Checkbox chk2 = new Checkbox("Female");
    chk2.setBounds(600,120,70,50);

        

    
    
    Label l,l1,l2,l3,l4,l5;
    l = new Label("TSEC Registration Form");
    l.setBounds(300, 50, 600, 50);
    f.add(area);
    f.add(tf);
    
    l1 = new Label("Name : ");
    l1.setBounds(50,100,100,30);
    tf.setText("");
    
    l2 = new Label("Address : ");
    l2.setBounds(50,150,100,30);

    l3 = new Label("Gender : ");
    l3.setBounds(500,100,100,30);

    l4 = new Label("Class : ");
    l4.setBounds(500,200,100,30);
       
    

    l5 = new Label("Division : ");
    l5.setBounds(500,250,100,30);
  
    f.add(l);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(chk1);
    f.add(chk2);
   

    
    
    f.setSize(1000,1000);
    f.setLayout(null);
    f.setVisible(true);
    

    

    
    
    
  }
}