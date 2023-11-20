package Assm;


class Cmp{
	String command;
	Cmp(String command) {
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		if (ca1 - ca2 == 0) {
			Main.ZF = 1;
		} else {
			Main.ZF = 0;
		}
		if (ca1 < ca2) {
			Main.CF = 1;
		}
		else {
			Main.CF = 0;
		}
	}
}
