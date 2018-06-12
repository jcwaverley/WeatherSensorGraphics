
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Stroke;


public class WeatherSensor extends JPanel {
		
		WeatherSensor() {
			this.setVisible(true);
		}
	
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			// Circle widths
	    	int xCircle = 280;
	    	int yCircle = 280;
	    	int WIDTH = 400;
	    	int HEIGHT = 400;
	    	
	    	Font myFont = new Font ("Courier New", Font.BOLD, 25);
	    	g.setFont(myFont);
	    	g.drawString("THUNDERSTORM SENSOR",80,80);
	    	
			for( int i = 0; i < 2; i = i + 1)
			{
				Graphics2D g9d = (Graphics2D) g.create();
				g9d.setColor(Color.decode("#800080"));
				g9d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
				g9d.drawOval( xCircle + (i * 70) , yCircle + (i * 70) , WIDTH - (i * 140) , HEIGHT - (i * 140) );
				g9d.drawOval( xCircle + (i * 70) , yCircle + (i * 70) , WIDTH - (i * 140) , HEIGHT - (i * 140) );
			}
			
			// Horizontal
			g.setColor(Color.BLACK);
			g.drawLine(100, 480, 750, 480);
			
			// Vertical
			g.setColor(Color.BLACK);
			g.drawLine (480, 805, 480, 165);
			
			// Angular line - 45 deg
			Graphics2D gAngular45 = (Graphics2D) g.create();
			gAngular45.setColor(Color.MAGENTA);
			double x1 = 480;
			double y1 = 480;
			double angleRadians1 = (Math.PI / 180.0) * 45;
			double x2 = x1 + (Math.cos(angleRadians1)) * 300;
			double y2 = y1 + (Math.sin(angleRadians1)) * 300;
			Stroke dashed45 = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
			gAngular45.setStroke(dashed45);
			//g.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			gAngular45.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
			
					
			// Angular line - 135 deg
			Graphics2D gAngular135 = (Graphics2D) g.create();
			gAngular135.setColor(Color.MAGENTA);
			double x3 = 480;
			double y3 = 480;
			double angleRadians2 = (Math.PI / 180.0) * 135;
			double x4 = x3 + (Math.cos(angleRadians2)) * 300;
			double y4 = y3 + (Math.sin(angleRadians2)) * 300;
			Stroke dashed135 = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
			gAngular135.setStroke(dashed135);
			//g.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			gAngular135.drawLine((int)x3, (int)y3, (int)x4, (int)y4);
			
			
			// Angular line - 225 deg
			Graphics2D gAngular225 = (Graphics2D) g.create();
			gAngular225.setColor(Color.MAGENTA);
			double x5 = 480;
			double y5 = 480;
			double angleRadians3 = (Math.PI / 180.0) * 225;
			double x6 = x5 + (Math.cos(angleRadians3)) * 300;
			double y6 = y5 + (Math.sin(angleRadians3)) * 300;
			Stroke dashed225 = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
			gAngular225.setStroke(dashed225);
			//g.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			gAngular225.drawLine((int)x5, (int)y5, (int)x6, (int)y6);
			
			
			// Angular line - 315 deg
			Graphics2D gAngular315 = (Graphics2D) g.create();
			gAngular315.setColor(Color.MAGENTA);
			double x7 = 480;
			double y7 = 480;
			double angleRadians4 = (Math.PI / 180.0) * 315;
			double x8 = x7 + (Math.cos(angleRadians4)) * 300;
			double y8 = y7 + (Math.sin(angleRadians4)) * 300;
			Stroke dashed315 = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
			gAngular315.setStroke(dashed315);
			//g.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			gAngular315.drawLine((int)x7, (int)y7, (int)x8, (int)y8);
			
			
			//----------------------------------------------------------------------
			// 45 - Arrow
			
			Graphics2D g45d = (Graphics2D) g.create();
			g45d.setColor(Color.RED);
			g45d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			g45d.drawLine (692, 268, 550, 197);
			//g45d.drawLine (762, 762, 742, 762);
			//g45d.drawLine (762, 762, 762, 742);
			
			//g45d.drawLine (782, 782, 762, 782);
			//g45d.drawLine (782, 782, 782, 762);
			
			//  ----------------------------------------------------------------------
			
			//----------------------------------------------------------------------
			// 315 - Arrow
			Graphics2D g135d = (Graphics2D) g.create();
			g135d.setColor(Color.RED);
			g135d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			g135d.drawLine (692, 692, 762, 762);
			g135d.drawLine (762, 762, 742, 762);
			g135d.drawLine (762, 762, 762, 742);
			
			g135d.drawLine (782, 782, 762, 782);
			g135d.drawLine (782, 782, 782, 762);
			//  ----------------------------------------------------------------------
			
			// North Arrow
			Graphics2D g1d = (Graphics2D) g.create();
			g1d.setColor(Color.RED);
			g1d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			g1d.drawLine (480, 165, 480, 65);
			g1d.drawLine (850, 480, 830, 460);
			g1d.drawLine (850, 480, 830, 500);
			
			// Southern Arrow
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.RED);
			g2d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			g2d.drawLine (480, 805, 480, 905);
			g2d.drawLine (480, 905, 500, 885);
			g2d.drawLine (480, 905, 460, 885);
			
			// Left Red Arrow
			Graphics2D g3d = (Graphics2D) g.create();
			g3d.setColor(Color.RED);
			g3d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			g3d.drawLine (100, 480, 200, 480);
			g3d.drawLine (100, 480, 120, 460);
			g3d.drawLine (100, 480, 120, 500);
			
			// Right Red Arrow
			Graphics2D g4d = (Graphics2D) g.create();
			g4d.setColor(Color.RED);
			g4d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
			g4d.drawLine (750, 480, 850, 480);
			g4d.drawLine (850, 480, 830, 460);
			g4d.drawLine (850, 480, 830, 500);
			
			//North - text
			g.setColor(Color.decode("#005eff"));
			g.drawString("North", 440, 30);
			
			//South - text
			g.setColor(Color.decode("#005eff"));
			g.drawString("South", 440, 920);
			
			//East text
			g.setColor(Color.decode("#005eff"));
			g.drawString("East", 860, 490);
			
			//West - text
			g.setColor(Color.decode("#005eff"));
			g.drawString("West", 30, 490);
			
			
			// Thunderstorm Image
			// image = new ImageIcon(getClass().getResource("BookShopImage.jpg"));
			// imageLabel = new JLabel(image);
			// imageLabel.setBounds(0, 40, 400, 250);
			// image
			// panel2.add(imageLabel);
			
		}
	}

