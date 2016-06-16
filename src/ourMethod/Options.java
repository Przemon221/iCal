package ourMethod;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import start_window.IcalWindow;

public class Options extends IcalWindow implements ActionListener {

	private static final long serialVersionUID = 1L;
	JApplet iCal = this;
	Color bgColor = Color.WHITE;

	public void setParent(JApplet parent){
		iCal = parent;
	}
	public void start(int hide) {


		if (hide == 1) {
			iCal.setSize(650, 400);




			JFrame frame1 = new JFrame("Background Color");

			// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			final JButton bGreen = new JButton("GREEN");
			// Add action listener to button
			bGreen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object souruce = e.getSource();

					if (souruce == bGreen) {

						if(bgColor == Color.WHITE){
							bgColor = Color.GREEN;
							bGreen.setText("RED");
						} else if(bgColor == Color.GREEN){
							bgColor = Color.RED;
							bGreen.setText("WHITE");
						}else if(bgColor == Color.RED){
							bgColor = Color.WHITE;
							bGreen.setText("GREEN");
						}

						iCal.getContentPane().setBackground(bgColor);
					}
				}
			});

			frame1.getContentPane().add(bGreen);
			frame1.pack();
			frame1.setVisible(true);
		}
	}



}
