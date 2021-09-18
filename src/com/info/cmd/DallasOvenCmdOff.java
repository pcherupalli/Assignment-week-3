package com.info.cmd;

public class DallasOvenCmdOff implements Command {
    DallasOven dallasOvenOff;
    
    
	public DallasOvenCmdOff(DallasOven dallasOvenOff) {
		super();
		this.dallasOvenOff = dallasOvenOff;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dallasOvenOff.off();
	}

	
	
}
