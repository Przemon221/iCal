package ourMethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JApplet;
import javax.swing.JComboBox;

public class TimeZone {
    private JComboBox<String> cTimezone;
    private JApplet iCal_handle;
    public TimeZone(JApplet iCal)
    {
        iCal_handle=iCal;
    }
    
    public void add_Timezone() throws IOException {
        ArrayList <String> list = new ArrayList<>();
        String time = "";
 
        cTimezone = new JComboBox<String>();
        cTimezone.setBounds(380, 122, 250, 20);
        iCal_handle.add(cTimezone);

        FileReader fileReader = new FileReader("config\\timezone.txt");
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String linia=" "; 
        while ((linia = bufferReader.readLine()) !=null) {
            System.out.println(linia);
            time = (linia+"\n");
            list.add(time);

        }
        fileReader.close();
      
        for(int i=0; i<39;i++)
        {
            cTimezone.addItem(list.get(i));
        }
       
       
      
        
        
        
    }
}
