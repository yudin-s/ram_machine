package org.yudin.ram.inter.commands.memory;

import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.memory.MemoryManager;
import org.yudin.ram.system.Worker;

public class Store implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		MemoryManager instance = MemoryManager.getInstance();
		if (isCubicle) {
			instance.saveToID(value, instance.loadByID(0));
		} else {
			throw new UnsupportedOperationException("Only cubicle value");
		}
		return Worker.getInstance().nextLine();

	}

}
