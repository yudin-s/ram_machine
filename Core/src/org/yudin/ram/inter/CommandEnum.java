package org.yudin.ram.inter;

import org.yudin.ram.inter.commands.Halt;
import org.yudin.ram.inter.commands.Rst;
import org.yudin.ram.inter.commands.jumps.Jgtz;
import org.yudin.ram.inter.commands.jumps.Jneg;
import org.yudin.ram.inter.commands.jumps.Jump;
import org.yudin.ram.inter.commands.jumps.Jzero;
import org.yudin.ram.inter.commands.math.Add;
import org.yudin.ram.inter.commands.math.Div;
import org.yudin.ram.inter.commands.math.Mult;
import org.yudin.ram.inter.commands.math.Subt;
import org.yudin.ram.inter.commands.memory.Load;
import org.yudin.ram.inter.commands.memory.Read;
import org.yudin.ram.inter.commands.memory.Store;
import org.yudin.ram.inter.commands.memory.Write;

public enum CommandEnum {
	LOAD(new Load(), CommandInt.LOAD), 
	STORE(new Store(), CommandInt.STORE),
	READ(new Read(), CommandInt.READ),
	WRITE(new Write(), CommandInt.WRITE),
	JUMP(new Jump(), CommandInt.JUMP),
	JGTZ(new Jgtz(), CommandInt.JGTZ),
	JZERO(new Jzero(), CommandInt.JZERO),
	JNEG(new Jneg(), CommandInt.JNEG),
	ADD(new Add(), CommandInt.ADD),
	DIV(new Div(), CommandInt.DIV),
	SUBT(new Subt(), CommandInt.SUBT),
	MULT(new Mult(), CommandInt.MULT),
	HALT(new Halt(),CommandInt.HALT),
	RST(new Rst(), CommandInt.REST);
	
	private CommandEnum(IRunnerComand runner, int equal) {
		this.runner = runner;
		intEqual = equal;
	}
	
	public final IRunnerComand runner;
	public final int intEqual;
	
}
