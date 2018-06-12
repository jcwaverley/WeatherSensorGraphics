import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.geom.*;
import java.math.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import java.awt.*;

public class WeatherSensorPanel {
	
	WeatherSensorPanel()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				WeatherSensorPanel t = new WeatherSensorPanel();
				
				// Construct a subPanel
				JPanel subPanel1 = new WeatherSensor();
				subPanel1.setBorder(BorderFactory.createTitledBorder("Thunderstorm Sensor Panel: Parameters"));
		    	//subPanel1.setBackground(Color.decode("#9bb2f0"));
		    	subPanel1.setBackground(Color.decode("#303030"));
		    	subPanel1.setPreferredSize(new Dimension (960, 960));
		    	subPanel1.setLayout(null);
		    	
		    	ImageIcon image = new ImageIcon("ThunderImage.jpg");
				JLabel imageLabel = new JLabel(image);
				imageLabel.setBounds(490, 200, 100, 150);
				subPanel1.add(imageLabel);
		    	
		    	/* 
		    	// Construct a subPanel
		    	JPanel subPanel1 = new ThunderStormSensor();
				subPanel1.setBorder(BorderFactory.createTitledBorder("Thunderstorm Sensor Parameters"));
		    	subPanel1.setBackground(Color.decode("#9bb2f0"));
		    	subPanel1.setPreferredSize(new Dimension (960, 960));
		    	subPanel1.setLayout(new GridBagLayout());
		    	*/
		    	
		    	//subPanel1.add(new Sensor);
		    	// subPanel1.setLayout(new GridBagLayout());
				
				JFrame jFrame = new JFrame();
				jFrame.setTitle("Main Sensor Panel");
				jFrame.setSize(1100, 1100);
				jFrame.setBackground(Color.decode("#f3c951"));
				jFrame.setVisible(true);
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(new GridBagLayout());
				
				jFrame.add (subPanel1);

	}

}
