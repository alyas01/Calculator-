
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComponent; 

class ui {
  public static void main(String[] args) {
  Frame frm =new Frame("Distance Formula");

  frm.setSize(350,200);
  frm.setVisible(true);
 frm.addWindowListener(new WindowAdapter(){ 
  public void windowClosing(WindowEvent e){
 System.exit(0);
 }
 });
  Panel p = new Panel();
  Panel p1 = new Panel();
  
  Label jx2 = new Label("X2");
  TextField lx2 = new TextField(10);
  Label jx1 =new Label("X1");
  TextField lx1 =new TextField(10);

  Label jy2 = new Label("Y2");
  TextField ly2 = new TextField(10);
  Label jy1 =new Label("Y1");
  TextField ly1 =new TextField(10);


  p.add(jx2);
  p.add(lx2);

  p.add(jx1);
  p.add(lx1);

  p.add(jy2);
  p.add(ly2);

  p.add(jy1);
  p.add(ly1);


  Button Submit=new Button("Submit");
  p.add(Submit);
  p1.add(p);
  frm.add(p1,BorderLayout.NORTH);
  }
}