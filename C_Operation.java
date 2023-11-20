package Assm;

class Add {
	String command;
	Add(String command) {
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		ca1 = ca1 + ca2;
		String res = String.valueOf(ca1);

		Main.registers.put(buf, res);
	}
}

class Sub {
	String command;
	Sub(String command) {
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		ca1 = ca1 - ca2;
		String res = String.valueOf(ca1);

		Main.registers.put(buf, res);
	}
}

class Mul {
	String command;
	Mul(String command) {
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		int re1 = ca1 * ca2;
		String res = String.valueOf(re1);

		Main.registers.put(buf, res);

	}
}

class Div{
	String command;
	Div(String command) {
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		int re1 = ca1 / ca2;
		String res = String.valueOf(re1);

		Main.registers.put(buf, res);

	}
}

class And{
	String command;
	And(String command){
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		int re1 = ca1 & ca2;
		String res = String.valueOf(re1);

		Main.registers.put(buf, res);
	}
}

class Xor{
	String command;
	Xor(String command){
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		int re1 = ca1 ^ ca2;
		String res = String.valueOf(re1);

		Main.registers.put(buf, res);
	}
}

class Or{
	String command;
	Or(String command){
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);
		String op2 = Main.registers.get(parts[2]);

		int ca1 = Integer.parseInt(op1);
		int ca2 = Integer.parseInt(op2);

		int re1 = ca1 | ca2;
		String res = String.valueOf(re1);

		Main.registers.put(buf, res);
	}
}


class Not{
	String command;
	Not(String command){
		this.command = command;
	}
	void execute() {
		String[] parts = command.split("\\s+");
		String opcode = parts[0];
		String buf = parts[1];
		String op1 = Main.registers.get(parts[1]);

		int ca1 = Integer.parseInt(op1);

		int re1 = ~ca1;
		String res = String.valueOf(re1);

		Main.registers.put(buf, res);
	}
}
