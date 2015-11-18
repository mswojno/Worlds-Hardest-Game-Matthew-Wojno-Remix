

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.EventObject;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;




public class IDK extends JPanel implements ActionListener, KeyListener{
	static JFrame frame = new JFrame("Level1"); 
	
	Timer t = new Timer(50,this);
	int starcount = 0;
	
	
	int cubey1 = 0;
	int cubey2 = 328;
	int cubey3 = 0;
	int cubey4 = 328;
	int cubey5 = 0;
	int cubey6 = 328;
	int cubey7 = 0;
	int cubey8 = 50;
	int cubey9 = 384;
	
	int cubexbottom1 = 150;
	int cubexbottom2 = 300;
	int cubexbottom3 = 450;
	int cubexbottom4 = 600;
	int cubexbottom5 = 765;
	int cubexbottom6 = 925;
	int cubexbottom7 = 1080;
	int cubexbottom8 = 50;
	int cubexbottom9 = 1050;
	
	
	
	
	static Component r ;
	static int y =0;
	int userx = 10;
	int usery = 30;
	int uservx =0;
	int uservy =0;
	int cubev1 = 20;
	int cubev2 = -20;
	int cubev3 = 20;
	int cubev4 = -20;
	int cubev5 = 20;
	int cubev6 = -20;
	int cubev7 = 20;
	int cubev8 = 15; 
	int cubev9 = -15;
	private BufferedImage image;
	private BufferedImage image1;
	private BufferedImage image2;
	private BufferedImage image3;
	private BufferedImage image4;
	private BufferedImage image5;

	boolean cover = false;
	boolean cover1 = false;
	boolean cover2 = false;
	boolean cover3 = false;
	boolean cover4 = false;
	boolean cover5 = false;
	static int counter = 0;
	static int holdCounter = 0;
	
	public IDK() {
			
		t.start();
		
		try {                
	          image = ImageIO.read(new File("GoldStarSmall.JPG"));
	          image1 = ImageIO.read(new File("GoldStarSmall.JPG"));
	          image2 = ImageIO.read(new File("GoldStarSmall.JPG"));
	          image3 = ImageIO.read(new File("GoldStarSmall.JPG"));
	          image4 = ImageIO.read(new File("GoldStarSmall.JPG"));
	          image5 = ImageIO.read(new File("GoldStarSmall.JPG"));
	          
	          
	          
	       } catch (IOException ex) {
	            // handle exception...
	       }
		addKeyListener(this);  
		setFocusable(true);     
        setFocusTraversalKeysEnabled(false);
		
		holdCounter = counter;
		
		
	}

public void paintComponent (Graphics g) { 
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.GREEN);
		Rectangle2D goArea = new Rectangle2D.Double(0,0,50,500);
		g2.fill(goArea);
		Rectangle2D stopArea = new Rectangle2D.Double(1200,0,50,500);
		g2.fill(stopArea);
		Rectangle2D stopBlock = new Rectangle2D.Double(1200,0,5,500);
		g2.fill(stopBlock);
	
		
		g2.setColor(Color.CYAN);
		
		Rectangle2D cube1 = new Rectangle2D.Double(cubexbottom1, cubey1, 20,150);
		g2.fill(cube1);
		
		Rectangle2D cube2 = new Rectangle2D.Double(cubexbottom2, cubey2, 20,150);
		g2.fill(cube2);
	
		Rectangle2D cube3 = new Rectangle2D.Double(cubexbottom3, cubey3, 20,150);
		g2.fill(cube3);
		
		Rectangle2D cube4 = new Rectangle2D.Double(cubexbottom4, cubey4, 20,150);
		g2.fill(cube4);
		
		Rectangle2D cube5 = new Rectangle2D.Double(cubexbottom5, cubey5, 20,150);
		g2.fill(cube5);
		
		Rectangle2D cube6 = new Rectangle2D.Double(cubexbottom6, cubey6, 20,150);
		g2.fill(cube6);
		
		Rectangle2D cube7 = new Rectangle2D.Double(cubexbottom7, cubey7, 20,150);
		g2.fill(cube7);
		
		Rectangle2D cube8 = new Rectangle2D.Double(cubexbottom8, cubey8, 150,20);
		g2.fill(cube8);
		
		Rectangle2D cube9 = new Rectangle2D.Double(cubexbottom9, cubey9, 150,20);
		g2.fill(cube9);
		
		g2.setColor(Color.black);
		
		g2.drawString("Trys: " + counter, 1203,450);
		
		g2.setColor(Color.RED);
		
		g2.drawString("Collect all of the stars to advance", 500,30);
		
		g2.setColor(Color.white);
		
		Rectangle2D starCube = new Rectangle2D.Double(220,230,35,35);
		g2.fill(starCube);
		Rectangle2D starCube1 = new Rectangle2D.Double(375,230,35,35);
		g2.fill(starCube1);
		Rectangle2D starCube2 = new Rectangle2D.Double(520,230,35,35);
		g2.fill(starCube2);
		Rectangle2D starCube3 = new Rectangle2D.Double(670,230,35,35);
		g2.fill(starCube3);
		Rectangle2D starCube4 = new Rectangle2D.Double(830,230,35,35);
		g2.fill(starCube4);
		Rectangle2D starCube5 = new Rectangle2D.Double(1000,230,35,35);
		g2.fill(starCube5);
		
		g2.drawImage(image,220,230, null);
		g2.drawImage(image1,375,230, null);
		g2.drawImage(image2,520,230,null);
		g2.drawImage(image3,670,230,null);
		g2.drawImage(image4,830,230,null);
		g2.drawImage(image5,1000,230,null);
		
		
		Rectangle2D user = new Rectangle2D.Double(userx, usery, 30,30);
		
		g2.setColor(Color.WHITE);
		if(cubey1 > 335){
			cubev1 = -20;
			
		}
		if(cubey1 < 0){
			
			cubev1 = 20;
			
		}
		
			if(cubey3 >335){
			
			cubev3 = -20;
			
		}
			if(cubey3 < 0){
				
				cubev3 = 20;
				
			}
			
			if(cubey5 > 335){
				
				cubev5 = -20;
				
			}
			if(cubey5 < 0){
				
				cubev5 = 20;
				
			}
			
		
			if(cubey7 > 335){
			
			cubev7 = -20;
		}
			if(cubey7 < 0){
				
				cubev7 = 20;
				
			}
	
			
			
			if(cubey2 < 0){
				
				cubev2 = 20;
			
			}
			
			if(cubey2 > 328){
				
				cubev2 = -20;
			}
			
			if(cubey4 < 0){
				
				cubev4 = 20;
			
			}
			
			if(cubey4 > 328){
				
				cubev4 = -20;
			}
			
			if(cubey6 < 0){
				
				cubev6 = 20;
			
			}
			
			if(cubey6 >328){
				
				cubev6 = -20;
			}
			
			if(cubexbottom8 <70){
				cubev8 = 15;
			}
			if(cubexbottom8 >1045){
				cubev8 = -15;
			}
			
			if(cubexbottom9 <70){
				cubev9 = 15;
			}
			if(cubexbottom9 >1045){
				cubev9 = -15;
			}
			
			if(user.intersects(cube1)){
				 userx = 10;
				 usery = 30;
				 counter++;
				 
			}
			
			if(user.intersects(cube2)){
				 userx = 10;
				 usery = 30;
				 counter++;
				 
			}
			if(user.intersects(cube3)){
				 userx = 10;
				 usery = 30;
				 counter++;
				 
			}
			if(user.intersects(cube4)){
				 userx = 10;
				 usery = 30;
				 counter++;
				 
			}
			if(user.intersects(cube5)){
				 userx = 10;
				 usery = 30;
				 counter++;
				
			}
			if(user.intersects(cube6)){
				 userx = 10;
				 usery = 30;
				 counter++;
				
			}
			if(user.intersects(cube7)){
				 userx = 10;
				 usery = 30;
				 counter++;
				
			}
			if(user.intersects(cube8)){
				userx = 10;
				usery = 30;
				counter++;
			}
			if(user.intersects(cube9)){
				userx = 10;
				usery = 30;
				counter++;
			}
			
			if(user.intersects(starCube)){
				cover = true;
				starcount++;
			}
			if(user.intersects(starCube1)){
				cover1 = true;
				starcount++;
			}
			if(user.intersects(starCube2)){
				cover2 = true;
				starcount++;
			}
			if(user.intersects(starCube3)){
				cover3 = true;
				starcount++;
			}
			if(user.intersects(starCube4)){
				cover4 = true;
				starcount++;
			}
			if(user.intersects(starCube5)){
				cover5 = true;
				starcount++;
				
			}
			
			if(cover == true){
				g2.fill(starCube);
			}
			if(cover1 == true){
				g2.fill(starCube1);
			}
			if(cover2 == true){
				g2.fill(starCube2);
			}
			if(cover3 == true){
				g2.fill(starCube3);
			}
			if(cover4 == true){
				g2.fill(starCube4);
			}
			if(cover5 == true){
				g2.fill(starCube5);
			}
			
			if(starcount >= 6){
			
				if(user.intersects(stopBlock)){
				
				
					
					String[] qwe = new String[] {"123"};
				
				Level2.main(qwe, counter);
			
				frame.dispose();
				
				
				
			}
			
			
			}
			
			if(usery<0){
				usery= 0;
			}
			if(usery >445){
				usery = 445;
			}
			if(userx >1245){
			userx = 1245;
			}
			if(userx <0){
				userx = 0;
			}
			
			g2.setColor(Color.DARK_GRAY);
			g2.fill(user);
			
			
			
}

public static int setCounter(){
	holdCounter = counter;
	return counter;
}
	
	public void actionPerformed (ActionEvent e ) { 
	 
		
		
		
		
		
		cubey1 += cubev1;
		cubey2 += cubev2;
		cubey3 += cubev3;
		cubey4 += cubev4;
		cubey5 += cubev5;
		cubey6 += cubev6;
		cubey7 += cubev7;
		cubexbottom8 +=cubev8;
		cubexbottom9 += cubev9;
		
		userx += uservx;
		usery += uservy;
		
		
		
		
		
		
		
		
		
		repaint();
		
		

	}
	 public void left(){  //sets up key to move the object up
         uservx = -5;
        
     }
     
     public void right(){
         uservx = 5;
         
     }
     
     public void up(){
    	 uservy = -5;
    	 
     }
     
     public void down(){
    	 uservy = 5;
    	 
     }
     public void stop(){  //This stops the movement when the key is released
         uservx = 0;
         uservy =0;
     }
	
	public void keyPressed(KeyEvent e){
		
		int code = e.getKeyCode();
	        
         if(code == KeyEvent.VK_RIGHT){
             right();
             
         }
          if(code == KeyEvent.VK_LEFT){
            left();
            
         }
          if(code == KeyEvent.VK_DOWN){
        	  down();
		
          }
          
          if(code == KeyEvent.VK_UP){
        	  up();
        	  
          }
          
          
          
          
	
	}
	public void keyTyped(KeyEvent e){}
    
	 public void keyReleased(KeyEvent e){
		 stop();
    }
	
	public static void main(String arg[]){
		
		
		IDK a = new IDK();
		
	
		frame.dispose();
		
		frame.getContentPane().add(a);
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(1250,500);
		
		frame.setBackground(Color.white);
		
		frame.setResizable(false);
		
		

		
	}
	
	
	
	
	
	
	
}
