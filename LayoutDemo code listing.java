import javax.swing.*;
import java.awt.*;

    public class layout Demo extends JFrame
    {
        public Layout Demo()
        {
            setTitle("Layout Manager Demo");
            setSize(400,250);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            //creating a tabbed pane with five different 
            }=
            \\
            \
            \
            \

            
            //demonstrating the various layout managers
            JTabbedPane tp =newJTabbedPane();
            tp.addTab("Intro,"new Intropanel());
            tp.addTab("Flow,"new Flowpanel());
            tp.addTab("Border,"new Borderpanel());
            tp.addTab("Grid,"new Gridpanel());
            tp.addTab("Box,"new Boxpanel());

            Container cpane=getContentPane();
            cpane.add(tp);

            setVisible(true);

        }
        public static void main(String [] args)
        {
            LayooutDemo 1Demo=new LayoutDemo();
        }
    }