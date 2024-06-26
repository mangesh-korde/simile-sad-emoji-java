import java.applet.*;
import java.awt.*;
public class Apdemo2 extends Applet
{
  public void paint(Graphics g)
  {  
    g.setColor(Color.yellow); 
   g.fillArc(200,200,200,200,0,360);
   g.setColor(Color.red);
   g.fillArc(240,240,20,20,0,360);
   g.fillArc(330,240,20,20,0,360);
    g.setColor(Color.red);
   g.drawArc(230,225,120,120,180,180);
  
  g.setColor(Color.yellow); 
   g.fillArc(600,200,200,200,0,360);
   g.setColor(Color.red);
   g.fillArc(640,240,20,20,0,360);
   g.fillArc(730,240,20,20,0,360);
    g.setColor(Color.red);
   g.drawArc(640,280,120,120,0,180);
}
}
/* <applet code="Apdemo2",width="500",height="400">
   </applet>*/
