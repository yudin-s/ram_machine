package org.yudin.ram.inter.commands.memory;

import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.memory.MemoryManager;
import org.yudin.ram.system.Worker;
import org.yudin.ram.system.Writer;

public class Write implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		if (isCubicle)
			Writer.write((int) MemoryManager.getInstance().loadByID(value));
		else
			Writer.write(value);
		return Worker.getInstance().nextLine();
		
	}

}
