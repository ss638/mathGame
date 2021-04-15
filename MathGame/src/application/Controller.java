package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
	@FXML
	private Label question;
	@FXML
	private TextField answer;
	@FXML
	private Label marks;
	@FXML
	private Label number1;
	@FXML
	private Label operator;
	@FXML
	private Label number2;
	
	
	
	@FXML
	private Label rightMessage;
	@FXML
	private Label wrongMessage;
	
	private String numType = "D";
	private String oprSymbol = "sum";
	@FXML
	private void nextQuestion(ActionEvent event)
	{
		
		//question.setText(Question.getQuestion());
	

		float num1 = Float.parseFloat(number1.getText());
		float num2 = Float.parseFloat(number2.getText());
		String opr = operator.getText();
		float ans = 0;
		float sum = 0;
		if(opr.equals("+") && numType.equals("D") ) {
			sum = (int)(num1 + num2);
			ans = Integer.parseInt(answer.getText());
		}
		else if(opr.equals("+") && numType.equals("F") )
		{
			sum = num1 + num2;
			sum = Float.parseFloat(String.format("%.02f", sum));
			float txt = Float.parseFloat(answer.getText());
			String anss= String.format("%.02f",txt);
			ans = Float.parseFloat(anss);
		}
		if(opr.equals("-") && numType.equals("D"))
		{
			sum = (int)(num1 - num2);
			ans = Integer.parseInt(answer.getText());
		}
		else if(opr.equals("-") && numType.equals("F"))
		{
			sum = num1 - num2;
			sum = Float.parseFloat(String.format("%.02f", sum));
			float txt = Float.parseFloat(answer.getText());
			String anss= String.format("%.02f",txt);
			ans = Float.parseFloat(anss);
		}
		
		if(opr.equals("x") && numType.equals("D"))
		{
			sum = (int)(num1 * num2);
			ans = Integer.parseInt(answer.getText());
		}
		else if(opr.equals("x") && numType.equals("F"))
		{
			sum = num1 * num2;
			sum = Float.parseFloat(String.format("%.02f", sum));
			float txt = Float.parseFloat(answer.getText());
			String anss= String.format("%.02f",txt);
			ans = Float.parseFloat(anss);
		}
		if(opr.equals("/"))
		{
			sum = num1 / num2;
			sum = Float.parseFloat(String.format("%.02f", sum));
			float txt = Float.parseFloat(answer.getText());
			String anss= String.format("%.02f",txt);
			ans = Float.parseFloat(anss);
		}
		
		
		if(sum==ans)
		{
			int previous_score = Integer.parseInt(marks.getText());
			marks.setText(String.valueOf(previous_score + 10 ));
			answer.setText("");
			answer.requestFocus();
			rightMessage.setVisible(true);
			wrongMessage.setVisible(false);
			Question.getQuestion(number1, operator, number2,numType,oprSymbol);
		}
		else
		{
		
			answer.setText("");
			answer.requestFocus();
			rightMessage.setVisible(false);
			wrongMessage.setVisible(true);
			System.out.println(num1 +" "+opr+" "+num2+" = "+ans+" , ans = "+sum);
		}
	}
	public void sumOfDecimalNumbers(ActionEvent event)
	{
		 numType = "D";
		 oprSymbol = "sum";
		 Question.getQuestion(number1, operator, number2,numType,oprSymbol);
	}
	public void sumOfFloatingPointNumbers(ActionEvent event)
	{
		 numType = "F";
		 oprSymbol = "sum";
		 Question.getQuestion(number1, operator, number2,numType,oprSymbol);
	}
	public void subOfDecimalNumbers(ActionEvent event)
	{
		 numType = "D";
		 oprSymbol = "sub";
		 Question.getQuestion(number1, operator, number2,numType,oprSymbol);
	}
	public void subOfFloatingPointNumbers(ActionEvent event)
	{
		 numType = "F";
		 oprSymbol = "sub";
		 Question.getQuestion(number1, operator, number2,numType,oprSymbol);
	}
	
	
	
	public void multiplicationOfDecimalNumbers(ActionEvent event)
	{
		 numType = "D";
		 oprSymbol = "mul";
		 Question.getQuestion(number1, operator, number2,numType,oprSymbol);
	}
	public void multiplicationOfFloatingPointNumbers(ActionEvent event)
	{
		 numType = "F";
		 oprSymbol = "mul";
		 Question.getQuestion(number1, operator, number2,numType,oprSymbol);
	}
	public void divisonOfDecimalNumbers()
	{
		 numType = "D";
		 oprSymbol = "div";
		 Question.getQuestion(number1, operator, number2,numType,oprSymbol);
	}
}
