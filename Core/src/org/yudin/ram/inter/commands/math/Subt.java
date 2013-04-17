package org.yudin.ram.inter.commands.math;

import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.memory.MemoryManager;
import org.yudin.ram.system.Worker;

public class Subt implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		MemoryManager manager = MemoryManager.getInstance();
		int current = (int) manager.loadByID(0);
		int add = 0;
		if (!isCubicle) {
			add = value;
		} else {
			add = (int) manager.loadByID(value);
		}
		current = current - add;
		manager.saveToID(0, (double) current);
		return Worker.getInstance().nextLine();

	}

}
