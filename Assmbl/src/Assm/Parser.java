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
		    String itemToPush = parts[1];
		    if (!Main.stack.contains(itemToPush)) {
		    	if(!Main.registers.containsKey(itemToPush)) {
		    		Main.registers.put(itemToPush, "Null");
		    	}
		        Main.stack.add(itemToPush);
		        pr();
		    } else {
		        // 스택에 이미 존재하는 경우에 대한 처리 (예: 오류 메시지 출력 등)
		        System.out.println("already exists");
		    }
		    break;
		case "pop":
	        if(Main.stack.isEmpty()) {
	            System.out.println("error : Stack is empty");
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
			
		default:
			System.out.println("Command Error!");
			break;
		}
	}
}