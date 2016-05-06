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
    

    private JButton bNew,bGenerate,bLoad,bClear,bOptions,bHideDet,b12H,b24H,bDownload,bShowDet;
    private JLabel lHourF,lTitle,lTimezone;
  
    private JTextArea tTitle;
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
        
        bClear = new JButton("Clera");
        bClear.setBounds(400, 20, 100, 50);
        iCal.add(bClear);
        bClear.addActionListener(this);
        
        bOptions = new JButton("Options");
        bOptions.setBounds(510, 20, 100, 50);
        iCal.add(bOptions);
        bOptions.addActionListener(this);
        
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

