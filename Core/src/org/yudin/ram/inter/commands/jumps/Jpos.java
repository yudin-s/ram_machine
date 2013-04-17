package org.yudin.ram.inter.commands.jumps;

import org.yudin.ram.inter.CommandEnum;
import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.memory.MemoryManager;
import org.yudin.ram.system.Worker;

public class Jpos implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		MemoryManager manager = MemoryManager.getInstance();
		if (isCubicle) {
			int checkedValue = (int) manager.loadByID(0);
			if (checkedValue > 0) {
				Worker worker = Worker.getInstance();
				return worker.moveToLine(value);
			}
		} else {
			throw new UnsupportedOperationException("Only cubicle");
		}
		return Worker.getInstance().nextLine();
	}

}
