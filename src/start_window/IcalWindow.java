package start_window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class IcalWindow extends JApplet implements ActionListener {
    

    JButton bNew,bGenerate,bLoad,bClear,bOptions,bHideDet,b12H,b24H,bDownload,bShowDet;
    JLabel lHourF,lTitle,lTimezone;
    JComboBox cTimezone;
    JTextArea tTitle;
    JTable jtBootom;
    JApplet iCal = this;
   
    
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
        add(bNew);
        bNew.addActionListener(this);
        
        bGenerate = new JButton("Generate iCal");
        bGenerate.setBounds(130, 20, 150, 50);
        add(bGenerate);
        bGenerate.addActionListener(this);
        
        bLoad = new JButton("Load");
        bLoad.setBounds(290, 20, 100, 50);
        add(bLoad);
        bLoad.addActionListener(this);
        
        bClear = new JButton("Clera");
        bClear.setBounds(400, 20, 100, 50);
        add(bClear);
        bClear.addActionListener(this);
        
        bOptions = new JButton("Options");
        bOptions.setBounds(510, 20, 100, 50);
        add(bOptions);
        bOptions.addActionListener(this);
        
        bHideDet = new JButton("Hide detail");
        bHideDet.setBounds(20, 80, 100, 20);
        add(bHideDet);
        bHideDet.addActionListener(this);
        
        b12H = new JButton("12H");
        b12H.setBounds(210, 80, 60, 20);
        b12H.setBackground(Color.LIGHT_GRAY);
        add(b12H);
        b12H.addActionListener(this);
        b12H.addActionListener(this);
        
        
        b24H = new JButton("24H");
        b24H.setBounds(270, 80, 60, 20);
        b24H.setBackground(Color.LIGHT_GRAY);
        add(b24H);
        b24H.addActionListener(this);
        
        bShowDet = new JButton("Show Detail");
        bShowDet.setBounds(20, 80, 100, 20);
        add(bShowDet);
        bShowDet.addActionListener(this);
        
        
        
        //label
        lHourF = new JLabel("Hour Format:");
        lHourF.setBounds(130, 80, 100, 20);
        add(lHourF);
        
        lTitle = new JLabel("Title:");
        lTitle.setBounds(20, 120, 100, 20);
        add(lTitle);
        
        lTimezone = new JLabel("Timezone:");
        lTimezone.setBounds(320, 120, 100, 20);
        add(lTimezone);
        
     
        
        //TextArea
        tTitle = new JTextArea("");
        tTitle.setBackground(Color.LIGHT_GRAY);
        tTitle.setBounds(50, 122, 250, 20);
        add(tTitle);
        
        //ComboBox
        
        cTimezone = new JComboBox();
        cTimezone.setBounds(380, 122, 250, 20);
        cTimezone.addItem("Tu beda strefy ");
        add(cTimezone);
        
        //Table
        String [] columns = {"Date","Date End","Title"} ;
        String [][] info = {{" "," "," "}};
        jtBootom = new JTable(info,columns);
        jtBootom.setPreferredScrollableViewportSize(new Dimension(450, 63));
        jtBootom.setFillsViewportHeight(true);
        
        
        JScrollPane jps = new JScrollPane(jtBootom);
        jps.setBounds(20,170,400,39);
        add(jps);
        
     
       
    }
    

    public void start()
    {
     
    }
    
    public void stop()
    {
        
    }
    
    public void destry()
    {
        
    }
    

    @SuppressWarnings("deprecation")
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
            
        }
        else if (souruce == bOptions)
        {
            
        }
        else if (souruce == bHideDet)
        {   
            bHideDet.hide();
            bShowDet.show();
            lHourF.hide();
            b12H.hide();
            b24H.hide();
      
        }
        else if (souruce == bShowDet)
        {   
            bShowDet.hide();
            bHideDet.show();
            lHourF.show();
            b12H.show();
            b24H.show();
        
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

