package Assm;

public class Parser{
	void assmparser(String assmline){
		String[] parts = assmline.split("\\s+");
		
		switch(parts[0]) {
		// 제어
		case "exi":
			System.out.println("exit");
			System.exit(0);
			break;
			
		case "pri":
			Print Pri = new Print();
			Pri.printRegisters();
			break;
			
			
		// 명령어
		case "mov":
			Mov Mov = new Mov(assmline);
			Mov.execute();
			break;
		case "lea":
			Lea Lea = new Lea(assmline);
			Lea.execute();
			break;
			
			
			
		case "add":
			Add Add = new Add(assmline);
			Add.execute();
			break;
		case "sub":
			Sub Sub = new Sub(assmline);
			Sub.execute();
			break;
		case "mul":
			Mul Mul = new Mul(assmline);
			Mul.execute();
			break;
		case "div":
			Div Div = new Div(assmline);
			Div.execute();
			break;
		case "and":
			And And = new And(assmline);
			And.execute();
			break;
		case "or":
			Or Or = new Or(assmline);
			Or.execute();
			break;
		case "not":
			Not Not = new Not(assmline);
			Not.execute();
			break;
		case "xor":
			Xor Xor = new Xor(assmline);
			Xor.execute();
			break;
		case "push":
		case "pop":
			break;
			
			
		case "cmp":
			Cmp Cmp = new Cmp(assmline);
			Cmp.execute();
			break;
		}
	}
}