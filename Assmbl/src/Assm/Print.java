package Assm;

public class Print {
	void printRegisters(){
		System.out.println("===================");
		
		System.out.println("flags:");
		System.out.println("    "+"ZF : "+Main.ZF);
		System.out.println("    "+"CF : "+Main.CF);
		
		
		System.out.println("registers:");
	    for (String key : Main.registers.keySet()) {
	        System.out.println("    "+key + " : " + Main.registers.get(key));
	    }
	    
        System.out.println("Stack:");
        for (int i = Main.stack.size() - 1; i >= 0; i--) {
            System.out.println(i + " : " + Main.stack.get(i));
        }
        System.out.println("===================");
	}
}
