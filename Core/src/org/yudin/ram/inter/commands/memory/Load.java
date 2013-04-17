package org.yudin.ram.inter.commands.memory;

import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.memory.MemoryManager;
import org.yudin.ram.system.Worker;

public class Load implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		MemoryManager instance = MemoryManager.getInstance();
		if (isCubicle) {
			instance.saveToID(0, instance.loadByID(value));
		} else {
			instance.saveToID(0, (double) value);
		}

		return Worker.getInstance().nextLine();
	}

}
