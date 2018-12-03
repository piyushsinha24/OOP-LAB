/* <applet code="appletphase" height=100 width=300> </applet> */

import java.awt.*;
import java.applet.*;

public class appletphase extends Applet 
{
      
      public void init()
      {
        System.out.println("init() called");
      }
     
      public void start()
      {
          System.out.println("start() called");
       }
       public void paint(Graphics g)
       {

          System.out.println("paint() called");
              g.drawString("paint() called",20,30);
        }
        public void stop()
        {
            System.out.println("stop() called");
        }
      public void destroy()
      {
       System.out.println("destroy() called");
      }

}
