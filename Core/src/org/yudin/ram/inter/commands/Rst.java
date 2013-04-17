package org.yudin.ram.inter.commands;

import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.system.Worker;

public class Rst implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		Worker.getInstance().reset();
		return false;
	}

}
