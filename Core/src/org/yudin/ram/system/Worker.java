package org.yudin.ram.system;

import java.util.ArrayList;

import org.yudin.ram.inter.Command;

public class Worker implements ICodeWorker {

	private ArrayList<Command> commandList = new ArrayList<Command>();

	private int current = 0;

	private Worker() {
	}

	private static Worker insWorker = new Worker();

	public static Worker getInstance() {
		return insWorker;
	}

	public Worker(Command array[]) {
		loadCode(array);
	}

	public void loadCode(Command array[]) {
		for (Command el : array) {
			commandList.add(el);
		}
	}

	public void addAndRun(Command command) {
		commandList.add(command);
		current = commandList.indexOf(command);
		command.run();
	}

	public Command[] getCode() {
		return (Command[]) commandList.toArray();
	}

	@Override
	public boolean nextLine() {
		int newVal = current + 1;
		if (newVal < commandList.size()) {
			current = newVal;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int currentLine() {
		return current;
	}

	@Override
	public Command currentCommand() {
		return commandList.get(current);
	}

	public boolean moveToLine(int line) {
		if (checkLine(line)) {
			current = line;
			return true;
		}
		return false;
	}

	private boolean checkLine(int line) {
		return line < commandList.size() && line > -1;
	}

	@Override
	public boolean reset() {
		Writer.write(-1);
		return false;
	}

}
