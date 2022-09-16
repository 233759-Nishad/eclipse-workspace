package awtreg;
import java.awt.*; 

public class regfrm extends Frame{
	regfrm() {  
		  
	 Frame f = new Frame();  
	  
     // creating a Label  
     Label l = new Label("Employee no:");   
     Label a = new Label("Employee name:");  
     Label c = new Label("contact no:");  
     // creating a Button  
     Button b = new Button("Submit");  
 
     // creating a TextField  
     TextField t = new TextField();  
     TextField p = new TextField();  
     TextField q = new TextField();  
 
     // setting position of above components in the frame  
     l.setBounds(60, 100, 100, 30);  
     t.setBounds(200, 100, 170, 20);  
      
     a.setBounds(60, 120, 100, 30);  
     p.setBounds(200, 120, 170, 20);   
    
     c.setBounds(60, 140, 100, 30);  
     q.setBounds(200, 140, 170, 20);  
   
     b.setBounds(150, 160, 80, 30);
     
 
     // adding components into frame    
     f.add(b);  
     f.add(l);  
     f.add(t);  
     f.add(a);  
     f.add(c);  
     f.add(p);
     f.add(q);
 
     // frame size 300 width and 300 height    
     f.setSize(900,1000);  
 
     // setting the title of frame  
     f.setTitle("Basic Reg Form");   
         
     // no layout  
     f.setLayout(null);   
 
     // setting visibility of frame  
     f.setVisible(true);  
}    

	  
	// main method  
	public static void main(String args[]) {   
	  
	// creating instance of Frame class   
		regfrm f = new regfrm();    
		regfrm awt_obj = new regfrm(); 
	  
	}  
	  
	}    

