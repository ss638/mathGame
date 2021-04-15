package application;

import javafx.scene.control.Label;


public class Question {
	
	public static void getQuestion(Label number1,Label oprerator, Label number2,String numType,String oprSymbol)
	{
		float max=1000;
		float min = 2;
		//float num1 = 0;
		//float num2 = 0;
		//float sum = 0;
		
		
		if(numType.equals("D"))
		{
			int num1 = (int)(Math.random()*(max-min+1)+min);
			int num2 = (int)(Math.random()*(max-min+1)+min);
			if(oprSymbol.equals("sum"))
			{
				number1.setText(String.valueOf(num1));
				oprerator.setText("+");
				number2.setText(String.valueOf(num2));
			}
			if(oprSymbol.equals("sub"))
			{
				if(num1>num2)
				{
				//	expression = num1+" - "+num2;
					number1.setText(String.valueOf(num1));
					oprerator.setText("-");
					number2.setText(String.valueOf(num2));
				}
				else
				{
				//	expression = num2+"-"+num1;
					number1.setText(String.valueOf(num2));
					oprerator.setText("-");
					number2.setText(String.valueOf(num1));
				}
			}
			
			if(oprSymbol.equals("mul"))
			{
				int maximum = 200;
				int minimum = 2;
				int num_1 = (int)(Math.random()*(maximum-minimum+1)+minimum);
				int num_2 = (int)(Math.random()*(maximum-minimum+1)+minimum);
				number1.setText(String.valueOf(num_1));
				oprerator.setText("x");
				number2.setText(String.valueOf(num_2));
			}
			if(oprSymbol.equals("div"))
			{
				int maximum = 2000;
				int minimum = 2;
				int num_1 = (int)(Math.random()*(maximum-minimum+1)+minimum);
				int num_2 = (int)(Math.random()*(maximum-minimum+1)+minimum);
				number1.setText(String.valueOf(num_1));
				oprerator.setText("/");
				number2.setText(String.valueOf(num_2));
			}
			
			
			
		}
		else
		{
			float num1 = (float)(Math.random()*(max-min+1)+min);
			float num2 = (float)(Math.random()*(max-min+1)+min);
			if(oprSymbol.equals("sum"))
			{
				//sum = num1 + num2;
				number1.setText(String.format("%.02f",num1));
				oprerator.setText("+");
				number2.setText(String.format("%.02f",num2));
			}
			if(oprSymbol.equals("sub"))
			{
				if(num1>num2)
				{
				//	expression = num1+" - "+num2;
					number1.setText(String.format("%.02f",num1));
					oprerator.setText("-");
					number2.setText(String.format("%.02f",num2));
				}
				else
				{
				//	expression = num2+"-"+num1;
					number1.setText(String.format("%.02f",num2));
					oprerator.setText("-");
					number2.setText(String.format("%.02f",num1));
				}
			}
			if(oprSymbol.equals("mul"))
			{
				float maximum = 100;
				float minimum = 2;
				float num_1 = (float)(Math.random()*(maximum-minimum+1)+minimum);
				float num_2 = (float)(Math.random()*(maximum-minimum+1)+minimum);
				number1.setText(String.format("%.02f",num_1));
				oprerator.setText("x");
				number2.setText(String.format("%.02f",num_2));
			}
		}
		
		
		
	}

}
