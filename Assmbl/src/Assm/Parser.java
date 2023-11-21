package Assm;

public class Parser{
	 
	 
	Print Pri = new Print();
	void pr(){
		Pri.printRegisters();
	}
	
	void assmparser(String assmline){
		String[] parts = assmline.split("\\s+");
		
		switch(parts[0]) {
		// 제어
		case "exi":
			System.out.println("exit");
			System.exit(0);
			break;
			
		case "pri":
			Pri.printRegisters();
			break;
			
			
		// 명령어
		case "mov":
			Mov Mov = new Mov(assmline);
			Mov.execute();
			pr();
			break;
		case "lea":
			Lea Lea = new Lea(assmline);
			Lea.execute();
			pr();
			break;
			
			
			
		case "add":
			Add Add = new Add(assmline);
			Add.execute();
			pr();
			break;
		case "sub":
			Sub Sub = new Sub(assmline);
			Sub.execute();
			pr();
			break;
		case "mul":
			Mul Mul = new Mul(assmline);
			Mul.execute();
			pr();
			break;
		case "div":
			Div Div = new Div(assmline);
			Div.execute();
			pr();
			break;
		case "and":
			And And = new And(assmline);
			And.execute();
			pr();
			break;
		case "or":
			Or Or = new Or(assmline);
			Or.execute();
			pr();
			break;
		case "not":
			Not Not = new Not(assmline);
			Not.execute();
			pr();
			break;
		case "xor":
			Xor Xor = new Xor(assmline);
			Xor.execute();
			pr();
			break;
			
			
		case "push":
			Main.stack.add(parts[1]);
			pr();
			break;
		case "pop":
	        if(Main.stack.isEmpty()) {
	            System.out.println("error : Stack is empty");
	            System.exit(0);
	        } else {
	        	Main.stack.remove(Main.stack.size() - 1);
	        }
			pr();
			break;
			
			
		case "cmp":
			Cmp Cmp = new Cmp(assmline);
			Cmp.execute();
			pr();
			break;
		}
	}
}