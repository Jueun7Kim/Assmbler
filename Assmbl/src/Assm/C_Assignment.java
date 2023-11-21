package Assm;

class Mov {
	String command;
	Mov(String command) {
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String op1 = parts[1];
		String op2 = parts[2];

		Main.registers.put(op1, op2);

	}
}

class Lea {
	String command;
	Lea(String command) {
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String op1 = new String(parts[1]);
		String op2 = new String(parts[2]);

		Main.registers.put(op1, op2);

	}
}


