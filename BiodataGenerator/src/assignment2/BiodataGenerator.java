package assignment2;

import java.awt.*;
import javax.swing.*; 
import java.awt.event.*; 
import javax.swing.filechooser.*; 
import java.sql.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class BiodataGenerator extends Frame implements ActionListener,ItemListener
{
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    Choice c1,c2,c3;
    Checkbox cb1,cb2,cb3;
    CheckboxGroup cbg;
    Button b,b1,b2;
    
    
    
    BiodataGenerator()
    {
    	super("BioData");
    	
    	//object for Labels
    	l1 = new Label("First Name");       
    	l2 = new Label("Last Name");
    	l3 = new Label("Date of Birth(yyyy/mm/dd)");
    	l4 = new Label("Father Name");
    	l5 = new Label("Mother Name");
    	l6 = new Label("City");
    	l7 = new Label("District");
    	l8 = new Label("State");
    	l9 = new Label("Country"); 
    	l10 = new Label("Gender");
    	l11 = new Label("Qualification");
    	l12 = new Label("Occupation");
    	l13 = new Label("Contact No");
    	l14 = new Label("Email ID");
    	
    	////object for TextBox
    	t1 = new TextField();               
    	t2 = new TextField();
    	t3 = new TextField();
    	t4 = new TextField();
    	t5 = new TextField();
    	t6 = new TextField();
    	t7 = new TextField();
    	t8 = new TextField();
    	t9 = new TextField();
    	t10 = new TextField(); 
    	t11 = new TextField("No file is selected");
    	
    	// object for buttons
    	b = new Button("Submit");
    	b1 = new Button("Upload Image");
    	b2 = new Button("Download in pdf");
    	
    	//objects of choice to get the district,state,country 
    	c1 = new Choice();
    	c2 = new Choice();
    	c3 = new Choice();
    	
    	//checkbox for gender
    	cbg = new CheckboxGroup();
    	cb1 = new Checkbox("Male",false,cbg);
    	cb2 = new Checkbox("Female",false,cbg);
    	cb3 = new Checkbox("Other",false,cbg);
    	
    	//setting bounds for buttons
    	b.setBounds(650,330,100,50);
    	b1.setBounds(760,85,100,20);
    	b2.setBounds(630,180,150,30);
    	
    	//setting bounds for labels
    	l1.setBounds(40,30,150,30);
    	l2.setBounds(40,80,150,30);
    	l3.setBounds(40,130,150,30);
    	l10.setBounds(40,180,150,30);
    	l4.setBounds(40,230,150,30);
    	l5.setBounds(40,280,150,30);
    	l6.setBounds(40,330,150,30);
    	l7.setBounds(40,380,150,30);
    	l8.setBounds(40,430,150,30);
    	l9.setBounds(40,480,150,30);
    	l11.setBounds(40,530,150,30);
    	l12.setBounds(40,580,150,30);
    	l13.setBounds(40,630,150,30);
    	l14.setBounds(40,680,150,30);
    	
    	//setting bounds for textfield
    	t1.setBounds(220,30,250,30);
    	t2.setBounds(220,80,250,30);
    	t3.setBounds(220,130,250,30);
    	t4.setBounds(220,230,250,30);
    	t5.setBounds(220,280,250,30);
    	t6.setBounds(220,330,250,30);
    	t7.setBounds(220,530,250,30);
    	t8.setBounds(220,580,250,30);
    	t9.setBounds(220,630,250,30);
    	t10.setBounds(220,680,250,30);
    	t11.setBounds(600,80,150,30);
    	
    	//setting bounds for choices
        c1.setBounds(220,380,250,30);
        c2.setBounds(220,430,250,30);
        c3.setBounds(220,480,150,30);
    	
        //setting bounds for checkboxes
        cb1.setBounds(220,180,70,30);
        cb2.setBounds(300,180,70,30);
        cb3.setBounds(380,180,70,30);
    	
        //set layout to null
    	setLayout(null);
    	
    	//adding items to the choice district(c1)
    	c1.add("Ariyalur");
    	c1.add("Chengalpattu");
    	c1.add("Chennai");
    	c1.add("Coimbatore");
    	c1.add("Cuddalore");
    	c1.add("Dharmapuri");
    	c1.add("Dindigul");
    	c1.add("Erode");
    	c1.add("Kallakurichi");
    	c1.add("Kanchipuram");
    	c1.add("Kanniyakumari");
    	c1.add("Karur");
    	c1.add("Krishnagiri");
    	c1.add("Madurai");
    	c1.add("Mayiladuthurai");
    	c1.add("Nagapattinam");
    	c1.add("Namakkal");
    	c1.add("Nilgiris");
    	c1.add("Perambalur");
    	c1.add("Pudukkottai");
    	c1.add("Ramanathapuram");
    	c1.add("Ranipet");
    	c1.add("Salem");
    	c1.add("Sivagangai");
    	c1.add("Tenkasi");
    	c1.add("Thanjavur");
    	c1.add("Theni");
    	c1.add("Thoothukudi");
    	c1.add("Tiruchirappalli");
    	c1.add("Tirunelveli");
    	c1.add("Tirupattur");
    	c1.add("Tiruvarur");
    	c1.add("Tiruppur");
    	c1.add("Tiruvallur");
    	c1.add("Tiruvannamalai");
    	c1.add("Vellore");
    	c1.add("Viluppuram");
    	c1.add("Virudhunagar");
    	
    	//adding items to the choice state(c2)
    	c2.add("Andhra Pradesh");
    	c2.add("Arunachal Pradesh");
    	c2.add("Assam");
    	c2.add("Bihar");
    	c2.add("Chattisgarh");
    	c2.add("Goa");
    	c2.add("Gujarat");
    	c2.add("Haryana");
    	c2.add("Himachal Pradesh");
    	c2.add("Jharkhand");
    	c2.add("Karnataka");
    	c2.add("Kerala");
    	c2.add("Madhya Pradesh");
    	c2.add("Maharashtra");
    	c2.add("Manipur");
    	c2.add("Meghalaya");
    	c2.add("Mizoram");
    	c2.add("Nagaland");
    	c2.add("Odisha");
    	c2.add("Punjab");
    	c2.add("Rajasthan");
    	c2.add("Sikkim");
    	c2.add("Tamil Nadu");
    	c2.add("Telangana");
    	c2.add("Tripura");
    	c2.add("Uttar Pradesh");
    	c2.add("Uttarakhand");
    	c2.add("West Bengal");
    	
    	//adding items to the choice country(c3)
    	c3.add("India");
    	c3.add("Other");
    	
    	
    	//add the labels to the frame
    	add(l1);
    	add(l2);
    	add(l3);
    	add(l4);
    	add(l5);
    	add(l6);
    	add(l7);
    	add(l8);
    	add(l9);
    	add(l10);
    	add(l11);
    	add(l12);
    	add(l13);
    	add(l14);
    	
    	//add the textfields to the frame
    	add(t1);
    	add(t2);
    	add(t3);
    	add(t4);
    	add(t5);
    	add(t6);
    	add(t7);
    	add(t8);
    	add(t9);
    	add(t10);
    	add(t11);
    	
    	//add the choices to the frame
    	add(c1);
    	add(c2);
    	add(c3);
    	
    	//add the checkboxes to the frame
    	add(cb1);
    	add(cb2);
    	add(cb3);
    	
    	//add the buttons to the frame
    	add(b);
    	add(b1);
    	add(b2);
    	
    	//registering the event happened in the checkbox in selecting gender
    	cb1.addItemListener(this);
    	cb2.addItemListener(this);
    	
    	//registering the event happened in the choices in selecting district,state,country
    	c1.addItemListener(this);
    	c2.addItemListener(this);
    	c3.addItemListener(this);
    	
    	//registering the event happened in the button 
    	b.addActionListener(this);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	
    	//Listener to close the frame
    	addWindowListener(new WindowAdapter()
    			{
    		       public void windowClosing(WindowEvent we)
    		       {
    		    	   dispose();
    		       }
    			});
    	
    }
    
    String gender="",district="",state="",country="";  
    
    //event handled by the ItemListener
	public void itemStateChanged(ItemEvent e) 
	{
		
		//selecting the gender
		if(cb1.getState())
    	{
    		 gender = cb1.getLabel();
    	}
    	if(cb2.getState())
    	{
    		gender = cb2.getLabel();
    	}
    	if(cb3.getState())
    	{
    		gender = cb3.getLabel();
    	}
    	
    	//selecting district
    	if(e.getSource()==c1)
    	{
    		district = c1.getSelectedItem();
    	}
    	
    	//selecting the state
    	if(e.getSource()==c2)
    	{
    		state = c2.getSelectedItem();
    	}
    	
    	//selecting the country
    	if(e.getSource()==c3)
    	{
    		country = c3.getSelectedItem();
    	}
		
	}

	//event handled by the ActionListener
    public void actionPerformed(ActionEvent e)
    {    	
    	
    	String imgurl="";
    	InputStream in=null;
    	
    	//b1 -> uploading image
    	if(e.getSource()==b1)
    	{
    		
    		//JFileChooser to choose the images from the system device
    	      JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    	      j.setAcceptAllFileFilterUsed(false);
    	      j.setDialogTitle("Select JPG images");
    	      
    	      //making filter in selecting only the jpg images
    	      FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .jpg files", "jpg"); 
              j.addChoosableFileFilter(restrict); 
              
              //Open the dialog box
    	      int r = j.showOpenDialog(null);
    	      
    	      //selecting the file image
    	      if( r == JFileChooser.APPROVE_OPTION)
    	      {
    		          t11.setText(j.getSelectedFile().getName());
    	              imgurl = j.getSelectedFile().getAbsolutePath();
    		 
    	      }
    	      else
    	      {
    		          t11.setText("No file is selected");
    	      }
    	
    	
    	
    	      try
    	      {
		 	          in = new FileInputStream(imgurl);
		      }  
    	      catch (FileNotFoundException e2) 
    	      {
			         e2.printStackTrace();
		      }
    	}
    	
    	//b2->downloading the pdf
    	if(e.getSource()==b2);
		{
			
			String name = "images.jpg";
		
			//creating the pdf document
			Document doc = new Document();
  	        
  	        try
  	        {
  	        	//to write the contents in the specified location of created pdf
  	        	 PdfWriter pw = PdfWriter.getInstance(doc,new FileOutputStream("E:\\Java\\Assignment\\Biodata.pdf"));
  	        	 doc.open();
  	        	 
  	        	 //creating a Paragraph object
  	        	 Paragraph para = new Paragraph("BioData");
  	        	 
  	        	 
      	        
  	        	 //adding the fields that is been got from the biodata form
  	        	 doc.add(para); 
  	        	 doc.add(new Paragraph("   "));
  	             doc.add(new Paragraph("   "));
            	 doc.add(new Paragraph("First Name    :"+t1.getText()));
            	 doc.add(new Paragraph("Last Name     :"+t2.getText()));
            	 doc.add(new Paragraph("Date of Birth :"+t3.getText()));
            	 doc.add(new Paragraph("Gender        :"+gender));
            	 doc.add(new Paragraph("Father Name   :"+t4.getText()));
            	 doc.add(new Paragraph("Mother Name   :"+t5.getText()));
            	 doc.add(new Paragraph("City          :"+t6.getText()));
            	 doc.add(new Paragraph("District      :"+district));
            	 doc.add(new Paragraph("State         :"+state));
            	 doc.add(new Paragraph("Country       :"+country));
            	 doc.add(new Paragraph("Qualification :"+t7.getText()));
            	 doc.add(new Paragraph("Occupation    :"+t8.getText()));
            	 doc.add(new Paragraph("Contact Number:"+t9.getText()));
            	 doc.add(new Paragraph("Email ID      :"+t10.getText()));
            	 
            	 
  	        	 //close the pdf document 
  	        	 doc.close();
  	        	 pw.close();  //close the PdfWriter
  	        }
  	        catch(Exception e3)
  	        {
  	        	e3.printStackTrace();
  	        }
  	        
  	        
  	        
		}
    	
    	//b-> submit the data get from the biodata form in the MySql database
    	if(e.getSource()==b)
        {
        try 
		{
        	//giving connection to the Database
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biodatabase","root","Tommy@123");
			
			//implementing the query
			PreparedStatement st = con.prepareStatement("Insert into biodata values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			//inserting the data get from the query to the database
			st.setString(1, t1.getText());
			st.setString(2, t2.getText());
			st.setString(3, t3.getText());
			st.setString(4, gender);
			st.setString(5, t4.getText());
			st.setString(6, t5.getText());
			st.setString(7, t6.getText());
			st.setString(8, district);
			st.setString(9,state);
			st.setString(10,country);
			st.setString(11, t7.getText() );
			st.setString(12, t8.getText());
			st.setString(13, t9.getText() );
			st.setString(14, t10.getText());
			st.setBlob(15, in);
			
			//execute the insert query 
			st.execute();
			
            //close the connection
            con.close(); 
		}
		catch (Exception e1)
		{
			
			e1.printStackTrace();
		}
		finally    // after submiting the data to the database ,set all fields to null
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
			
		}
    	}
		
	}

    //main method 
    
	public static void main(String[] args) 
	{
		BiodataGenerator bd = new BiodataGenerator();
		bd.setSize(1000,1000);
		bd.setVisible(true);
	}


	
	
}
