import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Level2 extends JPanel implements ActionListener, KeyListener  {
	static JFrame frame = new JFrame("Level2");
	Timer t = new Timer(50,this);
		int userx = 230;
		int usery = 250;
		int uservx = 0;
		int uservy = 0;
		
		int circle1x= 150;
		int circle1y= 72;
		int circle17x = 220;
		int circle17y = 72;
		int circle18x = 290;
		int circle18y = 72;
		int circle19x = 360;
		int circle19y = 72;
		int circle20x = 430;
		int circle20y = 72;
		int circle2x = 430;
		int circle2y = 140;
		int circle3x = 150; 
		int circle3y = 410;
		int circle4x = 10;
		int circle4y = 135;
		int circle5x = 430;
		int circle5y = 205;
		int circle6x = 430;
		int circle6y = 275;
		int circle7x = 430;
		int circle7y = 345;
		int circle12x = 430;
		int circle12y = 410;
		int circle8x = 220;
		int circle8y = 410;
		int circle9x = 290;
		int circle9y = 410;
		int circle10x = 360;
		int circle10y = 410;
		int circle11x = 10;
		int circle11y = 205;
		int circle13x = 80;
		int circle13y = 410;
		int circle14x = 10;
		int circle14y = 410;
		int circle15x = 10;
		int circle15y = 340;
		int circle16x = 10;
		int circle16y = 270;
		
		
		int circle1vx=7;
		int circle1vy = 0;
		int circle2vx = 0;
		int circle2vy = 0;
		int circle3vx = 0;
		int circle3vy = 0;
		int circle4vx = 0;
		int circle4vy = 0;
		int circle5vx = 0;
		int circle5vy = 0;
		int circle6vx = 0;
		int circle6vy = 0;
		int circle7vx = 0;
		int circle7vy = 0;
		int circle8vx = 0;
		int circle8vy = 0;
		int circle9vx = 0;
		int circle9vy = 0;
		int circle10vx = 0;
		int circle10vy = 0;
		int circle11vx = 0;
		int circle11vy = 0;
		int circle12vx = 0;
		int circle12vy = 0;
		int circle13vx = 0;
		int circle13vy = 0;
		int circle14vx = 0;
		int circle14vy = 0;
		int circle15vx = 0;
		int circle15vy = 0;
		int circle16vx = 0;
		int circle16vy = 0;
		int circle17vx = 7;
		int circle17vy = 0;
		int circle18vx = 7;
		int circle18vy = 0;
		int circle19vx = 7;
		int circle19vy = 0;
		int circle20vx = 7;
		int circle20vy = 0;
		
		
		
		int stars = 0;
		int stars1 = 0;
		int stars2 = 0;
		int trys,trys1;
		boolean shield = false; 
		boolean shield1 = false;
		boolean shield2 = false;
		
		Rectangle2D user;
		
		private BufferedImage image;
		private BufferedImage image1;
		private BufferedImage image2;
		
		public Level2() {
			t.start();
			
			IDK.setCounter();
			
			
			try{
			image = ImageIO.read(new File("GoldStarSmall.JPG"));
	          image1 = ImageIO.read(new File("GoldStarSmall.JPG"));
	          image2 = ImageIO.read(new File("GoldStarSmall.JPG"));
			}catch (IOException ex) {
	            // handle exception...
	       }
			
			 addKeyListener(this);  //Add this key listener
		       setFocusable(true);     // Sets the focus to this so I can use KeyListener
		        setFocusTraversalKeysEnabled(false); //Allows keys to act normal
		        
		        
		}
		

	public void paintComponent (Graphics g) { 
			
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.CYAN);
			Rectangle2D side1 = new Rectangle2D.Double(0,0,7,500);
			g2.fill(side1);
			Rectangle2D side2 = new Rectangle2D.Double(493,0,7,500);
			g2.fill(side2);
			Rectangle2D bottom = new Rectangle2D.Double(0,473,500,7);
			g2.fill(bottom);
			Rectangle2D top1 = new Rectangle2D.Double(80,0,120,70);
			g2.fill(top1);
			Rectangle2D intersection = new Rectangle2D.Double(80,0,5,70);
			g2.fill(intersection);
			Rectangle2D intersection1 = new Rectangle2D.Double(200,0,5,70);
			g2.fill(intersection1);
			Rectangle2D intersection2 = new Rectangle2D.Double(80,65,120,5);
			g2.fill(intersection2);
			Rectangle2D top2 = new Rectangle2D.Double(305,0,120,70);
			g2.fill(top2);
			Rectangle2D intersection3 = new Rectangle2D.Double(305,0,5,70);
			g2.fill(intersection3);
			Rectangle2D intersection4 = new Rectangle2D.Double(425, 0,5,70);
			g2.fill(intersection4);
			Rectangle2D intersection5 = new Rectangle2D.Double(305,65,120,5);
			g2.fill(intersection5);
			Rectangle2D top3 = new Rectangle2D.Double(0,0,100,7);
			g2.fill(top3);
			Rectangle2D top4 = new Rectangle2D.Double(150,0,350,7);
			g2.fill(top4);
			
			g2.setColor(Color.GREEN);
			Rectangle2D start = new Rectangle2D.Double(75,137,351,271);
			g2.fill(start);
			
			g2.setColor(Color.WHITE);
			Rectangle2D turn = new Rectangle2D.Double(50, 72, 2, 3);
			Rectangle2D cover = new Rectangle2D.Double(20,20,40,40);
			Rectangle2D cover1 = new Rectangle2D.Double(230,20,40,40);
			Rectangle2D cover2 = new Rectangle2D.Double(442,20,40,40);
			g2.fill(turn);
			g2.fill(cover);
			g2.fill(cover1);
			g2.fill(cover2);
			
			
			g2.drawImage(image,20,20, null);
			g2.drawImage(image1,230,20, null);
			g2.drawImage(image2,442,20,null);
						
			
			g2.setColor(Color.MAGENTA);
			Ellipse2D circle1 = new Ellipse2D.Double(circle1x,circle1y,60,60);
			g2.fill(circle1);
			Ellipse2D circle2 = new Ellipse2D.Double(circle2x,circle2y,60,60);
			g2.fill(circle2);
			Ellipse2D circle3 = new Ellipse2D.Double(circle3x,circle3y,60,60);
			g2.fill(circle3);
			Ellipse2D circle4 = new Ellipse2D.Double(circle4x,circle4y,60,60);
			g2.fill(circle4);
			Ellipse2D circle5 = new Ellipse2D.Double(circle5x,circle5y,60,60);
			g2.fill(circle5);
			Ellipse2D circle6 = new Ellipse2D.Double(circle6x,circle6y,60,60);
			g2.fill(circle6);
			Ellipse2D circle7 = new Ellipse2D.Double(circle7x,circle7y,60,60);
			g2.fill(circle7);
			Ellipse2D circle8 = new Ellipse2D.Double(circle8x,circle8y,60,60);
			g2.fill(circle8);
			Ellipse2D circle9 = new Ellipse2D.Double(circle9x,circle9y,60,60);
			g2.fill(circle9);
			Ellipse2D circle10 = new Ellipse2D.Double(circle10x,circle10y,60,60);
			g2.fill(circle10);
			Ellipse2D circle11 = new Ellipse2D.Double(circle11x,circle11y,60,60);
			g2.fill(circle11);
			Ellipse2D circle12 = new Ellipse2D.Double(circle12x,circle12y,60,60);
			g2.fill(circle12);
			Ellipse2D circle13 = new Ellipse2D.Double(circle13x,circle13y,60,60);
			g2.fill(circle13);
			Ellipse2D circle14 = new Ellipse2D.Double(circle14x,circle14y,60,60);
			g2.fill(circle14);
			Ellipse2D circle15 = new Ellipse2D.Double(circle15x,circle15y,60,60);
			g2.fill(circle15);
			Ellipse2D circle16 = new Ellipse2D.Double(circle16x,circle16y,60,60);
			g2.fill(circle16);
			Ellipse2D circle17 = new Ellipse2D.Double(circle17x,circle17y,60,60);
			g2.fill(circle17);
			Ellipse2D circle18 = new Ellipse2D.Double(circle18x,circle18y,60,60);
			g2.fill(circle18);
			Ellipse2D circle19 = new Ellipse2D.Double(circle19x,circle19y,60,60);
			g2.fill(circle19);
			Ellipse2D circle20 = new Ellipse2D.Double(circle20x,circle20y,60,60);
			g2.fill(circle20);
			
			g2.setColor(Color.black);
			g2.drawString("Trys: " + trys, 130,230);
			
			g2.setColor(Color.DARK_GRAY);
			user = new Rectangle2D.Double(userx,usery,30,30);
			
			//------------------------------------------------------//
			// circle movements
			
			if(circle1x == 430){
				circle1vx = 0;
				circle1vy = 7;
			}
			if(circle1y >= 410){
				circle1vx = -7;
				circle1vy = 0;
				
			}
			if(circle1x == 10){
				circle1vx = 0;
				circle1vy = -7;
			}
			
			if(circle1.intersects(turn)){
				circle1vx =7;
				circle1vy = 0;
			}

			//circle2
			
			if(circle2x == 430){
				circle2vx = 0;
				circle2vy = 7;
			}
			if(circle2y >= 410){
				circle2vx = -7;
				circle2vy = 0;
				
			}
			if(circle2x == 10){
				circle2vx = 0;
				circle2vy = -7;
			}
			
			if(circle2.intersects(turn)){
				circle2vx =7;
				circle2vy = 0;
			}
			
			//circle3
			
			if(circle3x == 430){
				circle3vx = 0;
				circle3vy = 7;
			}
			if(circle3y >= 410){
				circle3vx = -7;
				circle3vy = 0;
				
			}
			if(circle3x == 10){
				circle3vx = 0;
				circle3vy = -7;
			}
			
			if(circle3.intersects(turn)){
				circle3vx =7;
				circle3vy = 0;
			}
			
			//circle4 
			
			if(circle4x == 430){
				circle4vx = 0;
				circle4vy = 7;
			}
			if(circle4y >= 410){
				circle4vx = -7;
				circle4vy = 0;
				
			}
			if(circle4x == 10){
				circle4vx = 0;
				circle4vy = -7;
			}
			
			if(circle4.intersects(turn)){
				circle4vx =7;
				circle4vy = 0;
			}
			
			//circle5
			
			if(circle5x == 430){
				circle5vx = 0;
				circle5vy = 7;
			}
			if(circle5y >= 410){
				circle5vx = -7;
				circle5vy = 0;
				
			}
			if(circle5x == 10){
				circle5vx = 0;
				circle5vy = -7;
			}
			
			if(circle5.intersects(turn)){
				circle5vx =7;
				circle5vy = 0;
			}
			
			//circle6
			
			if(circle6x == 430){
				circle6vx = 0;
				circle6vy = 7;
			}
			if(circle6y >= 410){
				circle6vx = -7;
				circle6vy = 0;
				
			}
			if(circle6x == 10){
				circle6vx = 0;
				circle6vy = -7;
			}
			
			if(circle6.intersects(turn)){
				circle6vx =7;
				circle6vy = 0;
			}
			
			//circle 7
			
			if(circle7x == 430){
				circle7vx = 0;
				circle7vy = 7;
			}
			if(circle7y >= 410){
				circle7vx = -7;
				circle7vy = 0;
				
			}
			if(circle7x == 10){
				circle7vx = 0;
				circle7vy = -7;
			}
			
			if(circle7.intersects(turn)){
				circle7vx =7;
				circle7vy = 0;
			}
			
			//circle8
			
			if(circle8x == 430){
				circle8vx = 0;
				circle8vy = 7;
			}
			if(circle8y >= 410){
				circle8vx = -7;
				circle8vy = 0;
				
			}
			if(circle8x == 10){
				circle8vx = 0;
				circle8vy = -7;
			}
			
			if(circle8.intersects(turn)){
				circle8vx =7;
				circle8vy = 0;
			}
			
			//circle 9
			
			if(circle9x == 430){
				circle9vx = 0;
				circle9vy = 7;
			}
			if(circle9y >= 410){
				circle9vx = -7;
				circle9vy = 0;
				
			}
			if(circle9x == 10){
				circle9vx = 0;
				circle9vy = -7;
			}
			
			if(circle9.intersects(turn)){
				circle9vx =7;
				circle9vy = 0;
			}
			
			//circle 10
			
			if(circle10x == 430){
				circle10vx = 0;
				circle10vy = 7;
			}
			if(circle10y >= 410){
				circle10vx = -7;
				circle10vy = 0;
				
			}
			if(circle10x == 10){
				circle10vx = 0;
				circle10vy = -7;
			}
			
			if(circle10.intersects(turn)){
				circle10vx =7;
				circle10vy = 0;
			}
			
			//circle 11
			
			if(circle11x == 430){
				circle11vx = 0;
				circle11vy = 7;
			}
			if(circle11y >= 410){
				circle11vx = -7;
				circle11vy = 0;
				
			}
			if(circle11x == 10){
				circle11vx = 0;
				circle11vy = -7;
			}
			
			if(circle11.intersects(turn)){
				circle11vx = 7;
				circle11vy = 0;
			}
			
			//circle12
			
			if(circle12x == 430){
				circle12vx = 0;
				circle12vy = 7;
			}
			if(circle12y >= 410){
				circle12vx = -7;
				circle12vy = 0;
				
			}
			if(circle12x == 10){
				circle12vx = 0;
				circle12vy = -7;
			}
			
			if(circle12.intersects(turn)){
				circle12vx = 7;
				circle12vy = 0;
			}
			
			//circle 13
			
			if(circle13x == 430){
				circle13vx = 0;
				circle13vy = 7;
			}
			if(circle13y >= 410){
				circle13vx = -7;
				circle13vy = 0;
				
			}
			if(circle13x == 10){
				circle13vx = 0;
				circle13vy = -7;
			}
			
			if(circle13.intersects(turn)){
				circle13vx = 7;
				circle13vy = 0;
			}
			
			//circle 14
			
			if(circle14x == 430){
				circle14vx = 0;
				circle14vy = 7;
			}
			if(circle14y >= 410){
				circle14vx = -7;
				circle14vy = 0;
				
			}
			if(circle14x == 10){
				circle14vx = 0;
				circle14vy = -7;
			}
			
			if(circle14.intersects(turn)){
				circle14vx = 7;
				circle14vy = 0;
			}
			
			//circle 15
			
			if(circle15x == 430){
				circle15vx = 0;
				circle15vy = 7;
			}
			if(circle15y >= 410){
				circle15vx = -7;
				circle15vy = 0;
				
			}
			if(circle15x == 10){
				circle15vx = 0;
				circle15vy = -7;
			}
			
			if(circle15.intersects(turn)){
				circle15vx = 7;
				circle15vy = 0;
			}
			
			//circle 16 
			
			if(circle16x == 430){
				circle16vx = 0;
				circle16vy = 7;
			}
			if(circle16y >= 410){
				circle16vx = -7;
				circle16vy = 0;
				
			}
			if(circle16x == 10){
				circle16vx = 0;
				circle16vy = -7;
			}
			
			if(circle16.intersects(turn)){
				circle16vx = 7;
				circle16vy = 0;
			}
			
			//circle 17
			
			if(circle17x == 430){
				circle17vx = 0;
				circle17vy =  7;
			}
			if(circle17y >= 410){
				circle17vx = -7;
				circle17vy = 0;
				
			}
			if(circle17x == 10){
				circle17vx = 0;
				circle17vy = -7;
			}
			
			if(circle17.intersects(turn)){
				circle17vx = 7;
				circle17vy = 0;
			}
			
			//circle 18
			
			if(circle18x == 430){
				circle18vx = 0;
				circle18vy = 7;
			}
			if(circle18y >= 410){
				circle18vx = -7;
				circle18vy = 0;
				
			}
			if(circle18x == 10){
				circle18vx = 0;
				circle18vy = -7;
			}
			
			if(circle18.intersects(turn)){
				circle18vx = 7;
				circle18vy = 0;
			}
			
			//circle 19
			
			if(circle19x == 430){
				circle19vx = 0;
				circle19vy = 7;
			}
			if(circle19y >= 410){
				circle19vx = -7;
				circle19vy = 0;
				
			}
			if(circle19x == 10){
				circle19vx = 0;
				circle19vy = -7;
			}
			
			if(circle19.intersects(turn)){
				circle19vx = 7;
				circle19vy = 0;
			}
			
			//circle 20
			
			if(circle20x == 430){
				circle20vx = 0;
				circle20vy = 7;
			}
			if(circle20y >= 410){
				circle20vx = -7;
				circle20vy = 0;
				
			}
			if(circle20x == 10){
				circle20vx = 0;
				circle20vy = -7;
			}
			
			if(circle20.intersects(turn)){
				circle20vx = 7;
				circle20vy = 0;
			}
			
			//------------------------------------------------------//
			//Wall Intersections 
			if(user.intersects(side1)){
				userx = 7;
			}
			if(user.intersects(side2)){
				userx=463;
			}
			if(user.intersects(top3)){
				usery = 7;
			}
			if(user.intersects(top4)){
				usery=7;
			}
			if(user.intersects(bottom)){
				usery=443;
			}
			if(user.intersects(intersection)){
				userx = 50;
			}
			if(user.intersects(intersection1)){
				userx = 205;
			}
			if(user.intersects(intersection3)){
				userx = 275;
			}
			if(user.intersects(intersection4)){
				userx = 430;
			}
			if(user.intersects(intersection2) || user.intersects(intersection5)){
				usery = 70;
			}
			//-----------------------------//
			//star intersections
			g2.setColor(Color.WHITE);
			if(user.intersects(cover)){
				stars++;
				shield = true;
			}
			if(user.intersects(cover1)){
				stars1++;
				shield1 = true;
			}
			if(user.intersects(cover2)){
				stars2++;
				shield2 = true;
			}
			if(shield == true){
				g2.fill(cover);
			}
			if(shield1 == true){
				g2.fill(cover1);
			}
			if(shield2 == true){
				g2.fill(cover2);
			}
			//-----------------------------------//
			
			//circle intersections
			
			if(circle1.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle2.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle3.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle4.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle5.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle6.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			}
			if(circle7.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle8.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle9.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle10.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle11.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle12.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle13.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle14.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle15.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle16.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle17.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle18.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle19.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			if(circle20.intersects(user)){
				userx = 230;
			    usery = 250;
			    shield = false;
			    shield1 = false;
			    shield2 = false;
			    trys++;
			    stars = 0;
			    stars1 = 0;
			    stars2 = 0;
			}
			
			//-------------------------------//
			//draw user
			g2.setColor(Color.DARK_GRAY);
			g2.fill(user);
			//-------------------------------//
			//proceed to level three
			
			if(stars > 0 && stars1> 0 && stars2>0){
				if(user.intersects(start)){
					String[] qwe = new String[] {};
					
					Level3.main(qwe);
					
					frame.dispose();
			}
			}
			

				}
	
public void actionPerformed (ActionEvent e ) { 
	

		circle1x += circle1vx;
		circle1y += circle1vy;
		circle2x += circle2vx;
		circle2y += circle2vy;
		circle3x += circle3vx;
		circle3y += circle3vy;
		circle4x += circle4vx;
		circle4y += circle4vy;
		circle5x += circle5vx;
		circle5y += circle5vy;
		circle6x += circle6vx;
		circle6y += circle6vy;
		circle7x += circle7vx;
		circle7y += circle7vy;
		circle8x += circle8vx;
		circle8y += circle8vy;
		circle9x += circle9vx;
		circle9y += circle9vy;
		circle10x += circle10vx;
		circle10y += circle10vy;
		circle11x += circle11vx;
		circle11y += circle11vy;
		circle12x += circle12vx;
		circle12y += circle12vy;
		circle13x += circle13vx;
		circle13y += circle13vy;
		circle14x += circle14vx;
		circle14y += circle14vy;
		circle15x += circle15vx;
		circle15y += circle15vy;
		circle16x += circle16vx;
		circle16y += circle16vy;
		circle17x += circle17vx;
		circle17y += circle17vy;
		circle18x += circle18vx;
		circle18y += circle18vy;
		circle19x += circle19vx;
		circle19y += circle19vy;
		circle20x += circle20vx;
		circle20y += circle20vy;
		
		
		userx += uservx;
		usery += uservy;
		
		repaint();
		
	}
	 public void left(){  //sets up key to move the object up
         uservx = -8;
        
     }
     
     public void right(){
         uservx = 8;
         
     }
     
     public void up(){
    	 uservy = -8;
    	 
     }
     
     public void down(){
    	 uservy = 8;
    	 
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
		
		public static void main(String arg[], int t){
			
			Level2 a = new Level2();
			
			frame.dispose();
			
			frame.getContentPane().add(a);
			
			frame.setVisible(true);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setSize(500,500);
			
			frame.setBackground(Color.WHITE);
			
			frame.setResizable(false);
			
			

			
		}

	
	
}
	
	
	
	
	
	
	
	


	
	
	
	
	
	

