import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Level3 extends JPanel implements ActionListener, KeyListener {
	static JFrame frame = new JFrame("Level3");
	Timer t = new Timer(50,this);
	//gamePieces
	int gpy = 50; int gpx = 290;
	int gpy1 = 50; int gpx1 = 290;
	int gpy2 = 50; int gpx2 = 390;
	int gpy3 = 220; int gpx3 = 390; 
	int gpy4 = 220; int gpx4 = 440;
	int gpy5 = 270; int gpx5 = 440;
	int gpy6 = 270; int gpx6 = 490;
	int gpy7 = 320; int gpx7 = 490;
	int gpy8 = 320; int gpx8 = 540;
	int gpy9 = 220; int gpx9 = 245;
	int gpy10 = 220; int gpx10 = 245;
	int gpy11 = 270; int gpx11 = 200;
	int gpy12 = 270; int gpx12 = 200;
	int gpy13 = 315; int gpx13 = 150;
	int gpy14 = 315; int gpx14 = 150;
	int gpy15 = 365; int gpx15 = 35;
	int gpy16 = 365; int gpx16 = 35;
	int gpy17 = 445; int gpx17 = 35;
	int gpy18 = 445; int gpx18 = 150;
	int gpy19 = 495; int gpx19 = 150;
	int gpy20 = 495; int gpx20 = 200;
	int gpy21 = 545; int gpx21 = 200;
	int gpy22 = 545; int gpx22 = 250;
	int gpy23 = 595; int gpx23 = 250;
	int gpy24 = 550; int gpx24 = 435;
	int gpy25 = 550; int gpx25 = 435;
	int gpy26 = 505; int gpx26 = 485;
	int gpy27 = 505; int gpx27 = 485;
	
	//ball obstacles
	int box = 335; int boy = 240;
	int box2 = 335; int boy2 = 560;
	int box3 = 165; int boy3 = 400;
	int box4 = 495; int boy4 = 400;
	int box5 = 335; int boy5 = 280;
	int box6 = 335; int boy6 = 320;
	int box7 = 335; int boy7 = 360;
	int box8 = 335; int boy8 = 440;
	int box9 = 335; int boy9 = 480;
	int box10 = 335; int boy10 = 520;
	int box11 = 375; int boy11 = 400;
	int box12 = 415; int boy12 = 400;
	int box13 = 455; int boy13 = 400;
	int box14 = 210; int boy14 = 400;
	int box15 = 250; int boy15 = 400;
	int box16 = 295; int boy16 = 400;
	
	
	int boxv = 2; int boyv = 2; 
	int boxv2 = -10; int boyv2 = -2; 
	/*
	int boxv3 = 2; int boyv3 = 2; 
	int boxv4 = 2; int boyv4 = 2; 
	int boxv5 = 2; int boyv5 = 2; 
	int boxv6 = 2; int boyv6 = 2; 
	int boxv7 = 2; int boyv7 = 2; 
	int boxv8 = 2; int boyv8 = 2; 
	int boxv9 = 2; int boyv9 = 2; 
	int boxv10 = 2; int boyv10 = 2; 
	int boxv11 = 2; int boyv11 = 2; 
	int boxv12 = 2; int boyv12 = 2; 
	int boxv13 = 2; int boyv13 = 2; 
	int boxv14 = 2; int boyv14 = 2; 
	int boxv15 = 2; int boyv15 = 2; 
	int boxv16 = 2; int boyv16 = 2; 
	*/
	
	public Level3(){
		t.start();
		 addKeyListener(this);  //Add this key listener
	       setFocusable(true);     // Sets the focus to this so I can use KeyListener
	        setFocusTraversalKeysEnabled(false); //Allows keys to act normal
	}
	
	
	public void paintComponent (Graphics g) { 
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		//gp = game piece
		g2.setColor(Color.WHITE);
		Rectangle2D gp = new Rectangle2D.Double(gpx,gpy,100,5);
		g2.fill(gp);
		Rectangle2D gp1 = new Rectangle2D.Double(gpx1,gpy1, 5,170);
		g2.fill(gp1);
		Rectangle2D gp2 = new Rectangle2D.Double(gpx2,gpy2,5,170);
		g2.fill(gp2);
		Rectangle2D gp3 = new Rectangle2D.Double(gpx3,gpy3,50,5);
		g2.fill(gp3);
		Rectangle2D gp4 = new Rectangle2D.Double(gpx4,gpy4,5,50);
		g2.fill(gp4);
		Rectangle2D gp5 = new Rectangle2D.Double(gpx5,gpy5,50,5);
		g2.fill(gp5);
		Rectangle2D gp6 = new Rectangle2D.Double(gpx6,gpy6,5,50);
		g2.fill(gp6);
		Rectangle2D gp7 = new Rectangle2D.Double(gpx7,gpy7,50,5);
		g2.fill(gp7);
		Rectangle2D gp8 = new Rectangle2D.Double(gpx8,gpy8,5,190);
		g2.fill(gp8);
		Rectangle2D gp9 = new Rectangle2D.Double(gpx9,gpy9,50,5);
		g2.fill(gp9);
		Rectangle2D gp10 = new Rectangle2D.Double(gpx10,gpy10,5,50);
		g2.fill(gp10);
		Rectangle2D gp11 = new Rectangle2D.Double(gpx11,gpy11,50,5);
		g2.fill(gp11);
		Rectangle2D gp12 = new Rectangle2D.Double(gpx12,gpy12,5,50);
		g2.fill(gp12);
		Rectangle2D gp13 = new Rectangle2D.Double(gpx13,gpy13,50,5);
		g2.fill(gp13);
		Rectangle2D gp14 = new Rectangle2D.Double(gpx14,gpy14,5, 50);
		g2.fill(gp14);
		Rectangle2D gp15 = new Rectangle2D.Double(gpx15,gpy15,120, 5);
		g2.fill(gp15);
		Rectangle2D gp16 = new Rectangle2D.Double(gpx16,gpy16,5, 80);
		g2.fill(gp16);
		Rectangle2D gp17 = new Rectangle2D.Double(gpx17,gpy17,120, 5);
		g2.fill(gp17);
		Rectangle2D gp18 = new Rectangle2D.Double(gpx18,gpy18,5, 50);
		g2.fill(gp18);
		Rectangle2D gp19 = new Rectangle2D.Double(gpx19,gpy19,50, 5);
		g2.fill(gp19);
		Rectangle2D gp20 = new Rectangle2D.Double(gpx20,gpy20,5, 50);
		g2.fill(gp20);
		Rectangle2D gp21 = new Rectangle2D.Double(gpx21,gpy21,50, 5);
		g2.fill(gp21);
		Rectangle2D gp22 = new Rectangle2D.Double(gpx22,gpy22,5, 50);
		g2.fill(gp22);
		Rectangle2D gp23 = new Rectangle2D.Double(gpx23,gpy23,190, 5);
		g2.fill(gp23);
		Rectangle2D gp24 = new Rectangle2D.Double(gpx24,gpy24,5, 50);
		g2.fill(gp24);
		Rectangle2D gp25 = new Rectangle2D.Double(gpx25,gpy25,50, 5);
		g2.fill(gp25);
		Rectangle2D gp26 = new Rectangle2D.Double(gpx26,gpy26,5, 50);
		g2.fill(gp26);
		Rectangle2D gp27 = new Rectangle2D.Double(gpx27,gpy27,55, 5);
		g2.fill(gp27);
		
		//bo = ball obstacle
		g2.setColor(Color.MAGENTA);
		Ellipse2D bo = new Ellipse2D.Double(box,boy,15,15);
		g2.fill(bo);
		g2.setColor(Color.CYAN);
		Ellipse2D bo1 = new Ellipse2D.Double(335,400,15,15);
		g2.fill(bo1);
		g2.setColor(Color.MAGENTA);
		Ellipse2D bo2 = new Ellipse2D.Double(box2,boy2,15,15);
		g2.fill(bo2);
		Ellipse2D bo3 = new Ellipse2D.Double(box3,boy3,15,15);
		g2.fill(bo3);
		Ellipse2D bo4 = new Ellipse2D.Double(box4,boy4,15,15);
		g2.fill(bo4);
		Ellipse2D bo5 = new Ellipse2D.Double(box5,boy5,15,15);
		g2.fill(bo5);
		Ellipse2D bo6 = new Ellipse2D.Double(box6,boy6,15,15);
		g2.fill(bo6);
		Ellipse2D bo7 = new Ellipse2D.Double(box7,boy7,15,15);
		g2.fill(bo7);
		Ellipse2D bo8 = new Ellipse2D.Double(box8,boy8,15,15);
		g2.fill(bo8);
		Ellipse2D bo9 = new Ellipse2D.Double(box9,boy9,15,15);
		g2.fill(bo9);
		Ellipse2D bo10 = new Ellipse2D.Double(box10,boy10,15,15);
		g2.fill(bo10);
		Ellipse2D bo11 = new Ellipse2D.Double(box11,boy11,15,15);
		g2.fill(bo11);
		Ellipse2D bo12 = new Ellipse2D.Double(box12,boy12,15,15);
		g2.fill(bo12);
		Ellipse2D bo13 = new Ellipse2D.Double(box13,boy13,15,15);
		g2.fill(bo13);
		Ellipse2D bo14 = new Ellipse2D.Double(box14,boy14,15,15);
		g2.fill(bo14);
		Ellipse2D bo15 = new Ellipse2D.Double(box15,boy15,15,15);
		g2.fill(bo15);
		Ellipse2D bo16 = new Ellipse2D.Double(box16,boy16,15,15);
		g2.fill(bo16);
		
		//Start position
		g2.setColor(Color.GREEN);
		Rectangle2D start = new Rectangle2D.Double(295,55,95,170);
		g2.fill(start);
		
		//End position
		g2.setColor(Color.RED);
		Rectangle2D end = new Rectangle2D.Double(40,370,115,75);
		g2.fill(end);
		
		if(box >= 335 && boy >= 400){
			boxv = -2; boyv = 2;
		}
		if(box >= 335 && boy >=560){
			boxv = -2; boyv = -2;
		}
		if(box < 166 && boy < 391){
			boxv = 2; boyv = -2;
		}
		if(box >= 335 && boy<=240){
			boxv = 2; boyv = 2;
		}
		
		if(box2 >= 335 & boy2 >= 560){
			boxv2 = -2; boyv2 = -2;
		}
		
	}
	
	public void actionPerformed (ActionEvent e ) { 
		box += boxv;
		boy += boyv;
		box2 += boxv2;
		box2 += boyv2;
		
		repaint();
		
	}
	
	
	
	
	
	public void keyPressed(KeyEvent e){
	}
	
	
	
	
	
	
	
	public static void main(String[] args){
	Level3 a = new Level3();
	
	frame.dispose();
	
	frame.getContentPane().add(a);
	
	frame.setVisible(true);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.setSize(700,700);
	
	frame.setBackground(Color.BLACK);
	
	frame.setResizable(false);
}


	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
