package Assm;

import javax.swing.JTextArea;

public class Parser{
	 
	Print Pri = new Print();
	void pr(JTextArea printArea){
		Pri.printRegisters(printArea);
	}
	
	void assmparser(String assmline, JTextArea lineArea, JTextArea printArea ){
		
		lineArea.append("line > " + assmline + "\n");
		
		String[] parts = assmline.split("\\s+");
		
		switch(parts[0]) {
		// 제어
		case "exi":
			lineArea.append("exit");
			System.exit(0);
			break;
			
			
		// 명령어
		case "mov":
			Mov Mov = new Mov(assmline);
			Mov.execute();
			pr(printArea);
			break;
		case "lea":
			Lea Lea = new Lea(assmline);
			Lea.execute();
			pr(printArea);
			break;
			
			
			
		case "add":
			Add Add = new Add(assmline);
			Add.execute();
			pr(printArea);
			break;
		case "sub":
			Sub Sub = new Sub(assmline);
			Sub.execute();
			pr(printArea);
			break;
		case "mul":
			Mul Mul = new Mul(assmline);
			Mul.execute();
			pr(printArea);
			break;
		case "div":
			Div Div = new Div(assmline);
			Div.execute();
			pr(printArea);
			break;
		case "and":
			And And = new And(assmline);
			And.execute();
			pr(printArea);
			break;
		case "or":
			Or Or = new Or(assmline);
			Or.execute();
			pr(printArea);
			break;
		case "not":
			Not Not = new Not(assmline);
			Not.execute();
			pr(printArea);
			break;
		case "xor":
			Xor Xor = new Xor(assmline);
			Xor.execute();
			pr(printArea);
			break;
			
			
		case "push":
		    String itemToPush = parts[1];
		    if (!Main.stack.contains(itemToPush)) {
		    	if(!Main.registers.containsKey(itemToPush)) {
		    		Main.registers.put(itemToPush, "Null");
		    	}
		        Main.stack.add(itemToPush);
		        pr(printArea);
		    } else {
		        // 스택에 이미 존재하는 경우에 대한 처리 (예: 오류 메시지 출력 등)
		    	lineArea.append("already exists \n");
		    }
		    break;
		case "pop":
	        if(Main.stack.isEmpty()) {
	        	lineArea.append("error : Stack is empty \n");
	        } else {
	        	Main.stack.remove(Main.stack.size() - 1);
	        }
			pr(printArea);
			break;
			
			
		case "cmp":
			Cmp Cmp = new Cmp(assmline);
			Cmp.execute();
			pr(printArea);
			break;
			
		default:
			lineArea.append("Command Error! \n");
			break;
		}
	}

}