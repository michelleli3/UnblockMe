//Ramen Shop StartDisplay 08/03/2011 Commented WITH TAIPEI!
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
  public class StartPanel extends JPanel
 {
     /**
         The StartPanel is the panel that shows up at the beginning of the game,
         as soon as the driver is run. Instructions are shown near the top,
         underneath the title of the game. There are four buttons near the bottom
         of the screen that will start the game in four different scenarios. The
         offscreen button is a placeholder so that the driver can use a while
         loop to wait for the player to press a button.
     */
  
     //These integers let a later method confirm whether or not their corresponding
     //buttons were pressed or not.
    private int clickTokyo, clickTaipei, clickParis, clickSeoul;
     //These JLabels include the name of the game on the top of the screen and the instructions.
    private JLabel titleScreen;       
     //The constructor
     public StartPanel()
    {
       setLayout(new BorderLayout());
       setBackground(Color.BLACK);
     
         //This subpanel contains the buttons for different levels
       JPanel subpanel = new JPanel();
       subpanel.setLayout(new FlowLayout());
     
         //This subpanel contains the instructions
       JPanel other = new JPanel();
       other.setLayout(new GridLayout(1,1));
         
         //These instantiate the buttons for each city level
       JButton tokyo = new JButton(new ImageIcon("tokyo.PNG"));
       tokyo.addActionListener(new tokyoListener());
       subpanel.add(tokyo);
       JButton paris = new JButton(new ImageIcon("paris.PNG"));
       paris.addActionListener(new parisListener());
       subpanel.add(paris);
       JButton seoul = new JButton(new ImageIcon("seoul.PNG"));
       seoul.addActionListener(new seoulListener());
       subpanel.add(seoul);
       JButton taipei = new JButton(new ImageIcon("taipei.PNG"));
       taipei.addActionListener(new taipeiListener());
       subpanel.add(taipei);
       JButton offscreenbutton = new JButton(new ImageIcon("mexico.PNG"));
       offscreenbutton.addActionListener(new offscreenListener());
       subpanel.add(offscreenbutton);
     
         //The title and instructions JLabels
       titleScreen = new JLabel(new ImageIcon("titlescreen.PNG"));
       other.add(titleScreen);
     
       add(other);
       add(subpanel, BorderLayout.SOUTH);
    }
  
     //The listeners for each of the buttons makes the ints for each button equal one
     //so that later methods can check if they were pressed or not.
     private class tokyoListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
       {
          clickTokyo = 1;
       }
    }
     private class parisListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
       {
          clickParis = 1;
       }
    }
     private class seoulListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
       {
          clickSeoul = 1;
       }
    }
     private class taipeiListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
       {
          clickTaipei = 1;
       }
    }
     private class offscreenListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
       {
       //lalala this is our offscreenbuddy :D
       }
    }
  
     //The methods that return true if the button was pressed, and
     //false if they were not.
     public boolean getTokyo()
    {
       if(clickTokyo == 1)
          return true;
       return false;
    }
     public boolean getParis()
    {
       if(clickParis ==1)
          return true;
       return false;
    }
     public boolean getSeoul()
    {
       if(clickSeoul == 1)
          return true;
       return false;
    }
     public boolean getTaipei()
    {
       if(clickTaipei == 1)
          return true;
       return false;
    }
     
     
     //These methods allow the driver to set these values to zero so that the start screen
     //doesn't start flashing because it still thinks the player has clicked the corresponding
     //button.
     public void setTokyo()
     {
         clickTokyo = 0;
     }
     public void setParis()
     {
         clickParis = 0;
     }
     public void setSeoul()
     {
         clickSeoul = 0;
     }
     public void setTaipei()
     {
         clickTaipei = 0;
     }  

  
     //Our offScreenButton is not supposed to be pressed.
     public boolean getOffScreenBuddy()
    {
       return false;
    }
 }