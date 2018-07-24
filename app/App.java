import java.awt.*;  
public class App  
{  
	App()
	{  
        Frame f= new Frame();  
		TextArea area=new TextArea("Welcome to javatpoint");  
        area.setBounds(50,50,300,10);  
		TextField t1;  
		t1=new TextField("Welcome to Javatpoint.");  
		t1.setBounds(50,100, 200,30); 
		Button b=new Button("Click Here");  
		b.setBounds(50,100,80,30);  
		f.add(t1);  
		f.add(b);
        f.add(area); 
        f.setSize(400,400);  
        f.setLayout(new FlowLayout());  
        f.setVisible(true);
	}  
	public static void main(String args[])  
	{  
		new App();  
	}  
}  
