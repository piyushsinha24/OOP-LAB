import java.applet.*;
import java.awt.*;

/*
<applet code="applet2" width=500 height=1000>
</applet>
*/

public class applet2 extends Applet
{
	@Override
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(100,100,30,100);
		g.setColor(Color.blue);
		g.drawOval(200,200,200,200);
		g.fillOval(200,200,200,200);
		g.setColor(Color.yellow);
		g.drawRect(500,500,200,100);
		g.fillRect(500,500,200,100);
		
		
	}






}