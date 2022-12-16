package exemplo05;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
	
  
		public class AWTExample1 extends Frame {    

			private static final long serialVersionUID = 1L;

		AWTExample1() {  
			
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			});
   
		   Button b = new Button("Clique aqui!!!");  
		   b.setBounds(30,100,80,30);  
		   add(b);      
		   setSize(300,300);  
		   setTitle("Exemplo01 Frame");   
		   setLayout(null);   
		   setVisible(true);  
		}
		
		public static void main(String args[]) {   
   
		AWTExample1 f = new AWTExample1();    
		System.out.println(f);
		}  

		}    
