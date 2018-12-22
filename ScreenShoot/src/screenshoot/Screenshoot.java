/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenshoot;

/**
 *
 * @author MAURYA
 */
// Java Program to Capture full 
// Image of Screen 
import java.awt.AWTException; 
import java.awt.Rectangle; 
import java.awt.Toolkit; 
import java.awt.Robot; 
import java.awt.image.BufferedImage; 
import java.io.IOException; 
import java.io.File; 
import javax.imageio.ImageIO; 
import javax.swing.JOptionPane;

public class Screenshoot { 
	//public static final long serialVersionUID = 1L; 
	public  void Screenshoot() 
	{ 
		try {   
                        Home obj = new Home();
			Thread.sleep(120); 
			Robot r = new Robot(); 
                        
                        String name = System.getProperty("user.home") + "\\Desktop";
                        String  filename="\\Shoot"+Integer.toString((int) (Math.random()*100+1))+".jpg";
			String path = name+filename; 
                        // Used to get ScreenSize and capture image 
			Rectangle capture = 
			new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
			BufferedImage Image = r.createScreenCapture(capture); 
			ImageIO.write(Image, "jpg", new File(path)); 
                       
                        System.out.println(name);
                        JOptionPane.showMessageDialog(null,"Screenshot saved Location : "+path,"",JOptionPane.PLAIN_MESSAGE);     
			System.out.println("Screenshot saved Location : "+path); 
                        
		} 
		catch (AWTException | IOException | InterruptedException ex) { 
			System.out.println(ex); 
		} 
	} 
} 

