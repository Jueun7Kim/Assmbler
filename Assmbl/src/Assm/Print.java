package Assm;

import javax.swing.JTextArea;

public class Print {
	void printRegisters(JTextArea printArea){
		printArea.append("flags:" + "\n");
		printArea.append("    "+"ZF : " + Main.ZF + "\n");
		printArea.append("    "+"CF : " + Main.CF + "\n");
		
		
		
		printArea.append("\n" + "registers:" + "\n");
		if (Main.registers == null || Main.registers.isEmpty()) {
			printArea.append("    Registers is null" + "\n");
		} else {
		    for (String key : Main.registers.keySet()) {
		    	printArea.append("    " + key + " : " + Main.registers.get(key) + "\n");
		    }
		}
	    
		printArea.append("\n"+"Stack:" + "\n");
        if(Main.stack.size() == 0) {
        	printArea.append("    Stack is Null" + "\n");
        }
        else {
	        for (int i = Main.stack.size() - 1; i >= 0; i--) {
	        	printArea.append("    -------------" + "\n");
	        	printArea.append("    | "+i + " |  " + Main.stack.get(i) + "\n");
	        }
	        printArea.append("    -------------" + "\n");
        }
	}
}
