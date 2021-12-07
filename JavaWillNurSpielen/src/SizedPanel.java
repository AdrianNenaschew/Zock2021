import javax.swing.*;

import util.ShowInFrame;

import java.awt.Dimension;

public class SizedPanel extends JPanel {
	int preferredWidth = 1500;
	int preferredHeight = 1000;


	public SizedPanel(int w, int h){
		int preferredWidth = w;
		int prefferedHeight = h;
	}

	public SizedPanel() {}
	
	@Override 
	public Dimension getPreferredSize() {
		return new Dimension (preferredWidth,preferredHeight);
	}
	
	public static void main (String[] args) {
		ShowInFrame.show(new SizedPanel());
	}
}