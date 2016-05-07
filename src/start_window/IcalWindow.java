package start_window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import ourMethod.TimeZone;
import ourMethod.Clear;



public class IcalWindow extends JApplet implements ActionListener {
    

    private JButton bNew,bGenerate,bLoad,bClear,bOptions,bHideoptions,bColor,bIcalFile,bCsvFile,bHideDet,b12H,b24H,bDownload,bShowDet;
    private JLabel lHourF,lTitle,lTimezone;
  
    private JTextArea tTitle,tTitleOptions;
    private JTable jtBootom;
    private JApplet iCal= this;
   
    
    boolean val;
    

    
    public void init()
    {   
        //layout
        iCal.setSize(650,400);
        iCal.getContentPane().setBackground(Color.WHITE);
        iCal.setLayout(null);
 
        // Buttons
        bNew = new JButton("New");
        bNew.setBounds(20, 20, 100, 50);       
        iCal.add(bNew);
        bNew.addActionListener(this);
        
        bGenerate = new JButton("Generate iCal");
        bGenerate.setBounds(130, 20, 150, 50);
        iCal.add(bGenerate);
        bGenerate.addActionListener(this);
        
        bLoad = new JButton("Load");
        bLoad.setBounds(290, 20, 100, 50);
        iCal.add(bLoad);
        bLoad.addActionListener(this);
        
        bClear = new JButton("Clear");
        bClear.setBounds(400, 20, 100, 50);
        iCal.add(bClear);
        bClear.addActionListener(this);
        
        bOptions = new JButton("Options");
        bOptions.setBounds(510, 20, 100, 50);
        iCal.add(bOptions);
        bOptions.addActionListener(this);
		
		bHideoptions = new JButton("Hide");
        bHideoptions.setBounds(510, 20, 100, 50);
        iCal.add(bHideoptions);
        bHideoptions.addActionListener(this);
        
        
        bColor = new JButton("Background color");
        bColor.setBounds(100, 300, 200, 50);
        iCal.add(bColor);
        bColor.addActionListener(this);
        bColor.setVisible(false);
        
        bIcalFile  = new JButton(".iCal");
        bIcalFile.setBounds(320, 330, 60, 20);
        iCal.add(bIcalFile);
        bIcalFile.addActionListener(this);
        bIcalFile.setVisible(false);
        
        bCsvFile = new JButton(".CSV");
        bCsvFile.setBounds(390, 330, 70, 20);
        iCal.add(bCsvFile);
        bCsvFile.addActionListener(this);
        bCsvFile.setVisible(false);
        
        bHideDet = new JButton("Hide detail");
        bHideDet.setBounds(20, 80, 100, 20);
        iCal.add(bHideDet);
        bHideDet.addActionListener(this);
        
        b12H = new JButton("12H");
        b12H.setBounds(210, 80, 60, 20);
        b12H.setBackground(Color.LIGHT_GRAY);
        iCal.add(b12H);
        b12H.addActionListener(this);
      
        
        b24H = new JButton("24H");
        b24H.setBounds(270, 80, 60, 20);
        b24H.setBackground(Color.LIGHT_GRAY);
        iCal.add(b24H);
        b24H.addActionListener(this);
        
        bShowDet = new JButton("Show Detail");
        bShowDet.setBounds(20, 80, 100, 20);
        iCal.add(bShowDet);
        bShowDet.addActionListener(this);
        
        
        
        //label
        lHourF = new JLabel("Hour Format:");
        lHourF.setBounds(130, 80, 100, 20);
        iCal.add(lHourF);
        
        lTitle = new JLabel("Title:");
        lTitle.setBounds(20, 120, 100, 20);
        iCal.add(lTitle);
        
        lTimezone = new JLabel("Timezone:");
        lTimezone.setBounds(320, 120, 100, 20);
        iCal.add(lTimezone);
		
		tTitleOptions = new JTextArea("Choice file extension:");
        tTitleOptions.setBounds(333, 300, 130, 20);
        iCal.add(tTitleOptions);
        tTitleOptions.setVisible(false);
        
     
        
        //TextArea
        tTitle = new JTextArea("");
        tTitle.setBackground(Color.LIGHT_GRAY);
        tTitle.setBounds(50, 122, 250, 20);
        iCal.add(tTitle);
        
        //ComboBox
        
        
        TimeZone tz = new TimeZone(iCal);
        try {
            tz.add_Timezone();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
           
        
        
        //Table
        String [] columns = {"Date","Date End","Title"} ;
        String [][] info = {{" "," "," "}};
        jtBootom = new JTable(info,columns);
        jtBootom.setPreferredScrollableViewportSize(new Dimension(450, 63));
        jtBootom.setFillsViewportHeight(true);
        
        
        JScrollPane jps = new JScrollPane(jtBootom);
        jps.setBounds(20,170,400,39);
        iCal.add(jps);
        
     
       
    }
    
    public void start() {}
    public void stop() {}
    public void destry() {}
   

    @Override
    public void actionPerformed(ActionEvent x)
    {
        Object souruce = x.getSource();
        
        
        if (souruce == bNew)
        {
        
        }
        else if (souruce == bGenerate)
        {
            
        }
        else if(souruce == bLoad)
        {
            
        }
        else if(souruce == bClear)
        {
            Clear clr = new Clear(tTitle);
            clr.CleartTitle();
        }
        else if (souruce == bOptions)
        {
        	bOptions.setVisible(false);
        	bHideoptions.setVisible(true);
        	bColor.setVisible(true);
        	tTitleOptions.setVisible(true);
        	bIcalFile.setVisible(true);
        	bCsvFile.setVisible(true);
        	

        }
        else if (souruce == bHideoptions)
        {
        
        	bOptions.setVisible(true);
        	bColor.setVisible(false);
        	tTitleOptions.setVisible(false);
        	bIcalFile.setVisible(false);
        	bCsvFile.setVisible(false);
        	
        }
        
        
        else if (souruce == bColor)
       {
        	
                	
        	
        
        	
       }
        else if (souruce == bIcalFile) 
        {
        	
        	
        	
        }
        else if (souruce == bCsvFile) 
        {
        	
        }
        else if (souruce == bHideDet)
        {   
            bHideDet.setVisible(false);
            bShowDet.setVisible(true);
            lHourF.setVisible(false);
            b12H.setVisible(false);
            b24H.setVisible(false);
     
        }
        else if (souruce == bShowDet)
        {   
     
            bHideDet.setVisible(true);
            bShowDet.setVisible(false);
            lHourF.setVisible(true);
            b12H.setVisible(true);
            b24H.setVisible(true);
        }
        else if(souruce == b12H)
        {
            b12H.setBackground(Color.RED);
            b24H.setBackground(Color.LIGHT_GRAY);
            
        }
        else if(souruce == b24H)
        {
            b24H.setBackground(Color.RED);
            b12H.setBackground(Color.LIGHT_GRAY);
        }
        
    }
   
    
   
    
    
   
}

