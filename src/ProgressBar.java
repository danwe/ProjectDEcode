import javax.swing.JFrame;  
import javax.swing.JPanel;  
import javax.swing.JProgressBar;  
  
public class ProgressBar extends JFrame {  
 JProgressBar current = new JProgressBar(0, 2000);  
 int num = 0;  
  
 public ProgressBar() {  
  //exit button  
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  //create the panel to add the details  
  JPanel pane = new JPanel();  
  current.setValue(0);  
  current.setStringPainted(true);  
  pane.add(current);  
  setContentPane(pane);  
 }  
  
 //to iterate so that it looks like progress bar    
 public void iterate() {  
  while (num < 2000) {  
   current.setValue(num);  
   try {  
    Thread.sleep(1000);  
   } catch (InterruptedException e) {  
   }  
   num += 95;  
  }  
 }}