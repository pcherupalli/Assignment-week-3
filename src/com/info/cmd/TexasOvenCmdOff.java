package com.info.cmd;

public class TexasOvenCmdOff implements Command{

	TexasOven texasOvenOff;

	public TexasOvenCmdOff(TexasOven texasOvenOff) {
		super();
		this.texasOvenOff = texasOvenOff;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		texasOvenOff.off();
	}
	
	
	
	
}
