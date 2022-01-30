import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculate implements ActionListener
{
  JFrame f1;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
  JTextField t1;
  
  Calculate ()
  { 
    f1=new JFrame("Calculator");
	f1.setSize(450,500);
	f1.setLayout(null);
	
	b1=new JButton("7");
	b1.setBounds(50,100,50,50);
	f1.add(b1);
	
	b2=new JButton("8");
	b2.setBounds(120,100,50,50);
	f1.add(b2);
	
	b3=new JButton("9");
	b3.setBounds(190,100,50,50);
	f1.add(b3);
	
	b4=new JButton("/");
	b4.setBounds(260,100,50,50);
	f1.add(b4);
	
	b5=new JButton('\u221A'+"");
	b5.setBounds(330,100,50,50);
	f1.add(b5);
	
	b6=new JButton("4");
	b6.setBounds(50,170,50,50);
	f1.add(b6);
	
	b7=new JButton("5");
	b7.setBounds(120,170,50,50);
	f1.add(b7);
	
	b8=new JButton("6");
	b8.setBounds(190,170,50,50);
	f1.add(b8);
	
	b9=new JButton("*");
	b9.setBounds(260,170,50,50);
	f1.add(b9);
	
	b10=new JButton("%");
	b10.setBounds(330,170,50,50);
	f1.add(b10);
	
	b11=new JButton("1");
	b11.setBounds(50,240,50,50);
	f1.add(b11);
	
	b12=new JButton("2");
	b12.setBounds(120,240,50,50);
	f1.add(b12);
	
   	b13=new JButton("3");
	b13.setBounds(190,240,50,50);
	f1.add(b13);
	
   	b14=new JButton("+");
	b14.setBounds(260,240,50,120);
	f1.add(b14);
	
	b15=new JButton("-");
	b15.setBounds(330,240,50,50);
	f1.add(b15);
	
  	b16=new JButton("0");
	b16.setBounds(50,310,50,50);
	f1.add(b16);
	
  	b17=new JButton("00");
	b17.setBounds(120,310,50,50);
	f1.add(b17);
	
   	b18=new JButton(".");
	b18.setBounds(190,310,50,50);
	f1.add(b18);
	
  	b19=new JButton("=");
	b19.setBounds(330,310,50,50);
	f1.add(b19);

    b20=new JButton("CE");
    b20.setBounds(50,380,50,50);
    f1.add(b20);	
	
	t1=new JTextField(Label.RIGHT);
	t1.setBounds(50,50,250,50);
	f1.add(t1);
	//t1.setAlignment(Label.LEFT);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
	b17.addActionListener(this);
	b18.addActionListener(this);
	b19.addActionListener(this);
	b20.addActionListener(this);
	f1.setVisible(true);
	
  }
  
	public static void main(String s[])
	{
		Calculate c=new Calculate();
	}
	int num1;
	int num2;
	int op;
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t1.setText(t1.getText()+"7");
		}
		
		if(e.getSource()==b2)
		{
			t1.setText(t1.getText()+"8");
		}
		
		if(e.getSource()==b3)
		{
			t1.setText(t1.getText()+"9");
		}
		
		if(e.getSource()==b4)
		{
			num1=Integer.parseInt(t1.getText());
			 op=6;
			t1.setText(""); 
			//t1.setText(Math.div(num1)+"");
		}
		if(e.getSource()==b5)
		{
			num1=Integer.parseInt(t1.getText());
			t1.setText(Math.sqrt(num1)+"");
			//t1.setText("");
		}
		if(e.getSource()==b6)
		{
			t1.setText(t1.getText()+"4");
		}
		if(e.getSource()==b7)
		{
		   t1.setText(t1.getText()+"5");
		}
		if(e.getSource()==b8)
		{
			t1.setText(t1.getText()+"6");
		}
		if(e.getSource()==b9)
		{
			num1= Integer.parseInt(t1.getText());
			op=2;
			t1.setText("");
		}
		if(e.getSource()==b10)
		{
			num1=Integer.parseInt(t1.getText());
			op=4;
			t1.setText("");
		}
		if(e.getSource()==b11)
		{
			t1.setText(t1.getText()+"1");
		}
		if(e.getSource()==b12)
		{
			t1.setText("2");
		}
		if(e.getSource()==b13)
		{
			t1.setText("3");
		}
		if(e.getSource()==b14)
		{
			num1=Integer.parseInt(t1.getText());
			op=1;
			t1.setText("");
			
		}
		if(e.getSource()==b15)
		{
			num1=Integer.parseInt(t1.getText());
			op=3;
			t1.setText("");
		}
		if(e.getSource()==b16)
		{
			t1.setText("0");
		}
		if(e.getSource()==b17)
		{
			t1.setText("00");
		}
		if(e.getSource()==b18)
		{
			t1.setText(".");
		}
		
		if(e.getSource()==b20)
		{
			t1.setText("");
		}
		
		if(e.getSource()==b19)
		{
			num2=Integer.parseInt(t1.getText());
			if(op==1)
				t1.setText(num1+num2+"");
			
			else if(op==2)
				t1.setText(num1*num2+"");
			
			else if(op==3)
				t1.setText(num1-num2+"");
			
			else if(op==4)
				t1.setText(num1%num2+"");
			
		/* 	else if(op==7)
				t1.setText(num""num2+""); */
		
	//			else if(op==5)
		//		t1.setText(num1√num2+"");
			
			else if(op==6)
				t1.setText((num1/num2)+""); 
			
		}
		
		
	}
}

   