package buttons;

import java.awt.TextArea;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import windowIcal.IcalWindow;

public class LoadButton extends JFrame{

	 JTextArea textArea=new JTextArea();
	JFileChooser fileChooser=new JFileChooser();
	StringBuilder sb=new StringBuilder();
	
	
	IcalWindow icalWindow=new IcalWindow();
	public LoadButton(IcalWindow icalWindowRef) throws Exception
	{
		icalWindow=icalWindowRef;
		
	chooseFile();
		
		
	}
	
	private void  print(){
		
		
	}
	private void chooseFile() throws Exception{
		
		if(fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
		java.io.File file=fileChooser.getSelectedFile();
		Scanner input= new Scanner(file);
		while (input.hasNext()){
			sb.append(input.hasNextLine());
			sb.append("\n");
			System.out.println(input.nextLine());
			
		}
		input.close();
	}
		else
	{
		sb.append("No file wos selected");
	}
		
}
	private void open() throws Exception{
		chooseFile();
		
		
	}
	
	
	
	

	
	
	
}
