import javax.swing.*;
import util.ShowInFrame;

public class SimpleButton extends JPanel {
JButton b=new JButton("Hochz�hlen");
JButton c=new JButton("Runterz�hlen");
JButton d=new JButton("Null setzen");
JLabel l= new JLabel("000");
SimpleButton(){
	add(b);
	add(c);
	add(d);
	add(l);
}
	
	
	public static void main(String[] args) {
		ShowInFrame.show(new SimpleButton());
	}

}

