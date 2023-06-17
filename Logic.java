package portas;

		/*Logical Gates
		Logic Gate AND -> 1.1 = 1; 1.0 = 0; 0.1 = 0; 0.0 = 0; symbol that represents ->  &
		Logic Gate OR  -> 1+1 = 1; 1+0 = 1; 0+1 = 1; 0+0 = 0; symbol that represents -> |
		Logic Gate XOR -> 1+1 = 0; 1+0 = 1; 0+1 = 1; 0+0 = 0; symbol that represents -> ^
		Logic Gate NAND -> Negated AND;	symbol that represents -> ~&
		Logic Gate NOR  -> Negated OR;	symbol that represents -> ~|
		Logic Gate NXOR -> Negated XOR;	symbol that represents -> ~^					*/

import java.util.Scanner;
														//Class Value = Asks the Values.
class Value{
	int num;
	Scanner type_it = new Scanner(System.in);
	public int Type() {
		do {											//A Loop Just for the User to Type Right.
		System.out.print("Enter a value (1 or 0): ");	num = type_it.nextInt();	
		}while(num != 1 && num != 0);
		return num;
	}
	public void CloseScan() {
		type_it.close();
	}
}
														//Class Option = Asks the Operation.

class Option{
	int choice;
	Scanner type_it = new Scanner(System.in);
	public int Type() {										//Other Loop Just for the User to Type Right.
		do {												
			System.out.println();							//Informs the Valid Options.
			System.out.println("Enter which Gate you want to use:\n 1 - And --- 4 - Nand\n 2 - Or  --- 5 - Nor\n 3 - Xor --- 6 - Nxor");
			System.out.print("Enter your choice: "); choice = type_it.nextInt();	
		}while(choice < 1 || choice > 6);
		return choice;
	}
	public void CloseScan() {
		type_it.close();
	}
}
														//Class Choice = Do the Chosen Logic.
														
class Choice{
	public void Action(int number1, int number2, int choice) {
		
		//Java's Own Command
		int ResultAnd = number1 & number2;			
		int ResultOr = number1 | number2;			
		int ResultXor = number1 ^ number2;			
		int ResultNand = ~(number1 & number2) & 1;	
		int ResultNor = ~(number1 | number2) & 1;	
		int ResultNxor = ~(number1 ^ number2) & 1;	
		
		//A Switch Case for Selecting the Chosen Operation.
		switch (choice) {
		case 1:
			System.out.println("Result of Gate AND: " + ResultAnd);		break;	
		case 2:
			System.out.println("Result of Gate OR: " + ResultOr);		break;
		case 3:
			System.out.println("Result of Gate XOR: " + ResultXor);		break;
		case 4:
			System.out.println("Result of Gate NAND: " + ResultNand);	break;
		case 5:
			System.out.println("Result of Gate NOR: " + ResultNor);		break;
		case 6:
			System.out.println("Result of Gate NXOR: " + ResultNxor);	break;
		}
	}
}

														//Class Logic = Run Program.
public class Logic {
	public static void main(String[] args) {
		Start();												//Organize the Execution.
		}
	
	public static void Start() {
		Value num = new Value();
		int numb1 = num.Type();
		int numb2 = num.Type();
		num.CloseScan();
		
		Option op = new Option();						//Call the Classes.
		int choice = op.Type(); 
		op.CloseScan();
		
		Choice play = new Choice();
		play.Action(numb1, numb2, choice);				//Appends the Value to a Variable.
	}
}
