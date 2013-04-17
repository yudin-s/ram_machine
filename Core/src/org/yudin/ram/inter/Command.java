package org.yudin.ram.inter;

import org.yudin.ram.system.Worker;

public class Command {

	private int command;
	private boolean isCubicle;
	private int parametr;
	private IRunnerComand runner;

	public Command(CommandEnum command, boolean isCubicle, int parametr) {
		this.isCubicle = isCubicle;
		this.parametr = parametr;
		runner = command.runner;
		this.command = command.intEqual;
	}

	public int getCommand() {
		return command;
	}

	public void setCommand(int command) {
		this.command = command;
	}

	public boolean isCubicle() {
		return isCubicle;
	}

	public void setCubicle(boolean isCubicle) {
		this.isCubicle = isCubicle;
	}

	public int getParametr() {
		return parametr;
	}

	public void setParametr(int parametr) {
		this.parametr = parametr;
	}

	public boolean run() {
		Worker worker = Worker.getInstance();
		if (runner.run(isCubicle, parametr)) {
			worker.currentCommand().run();
		}
		return true;
	}
}
