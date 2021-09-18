package com.info.cmd;

public class TexasOvenCmdOn implements Command{

	TexasOven texasOvenOn;

	public TexasOvenCmdOn(TexasOven texasOvenOn) {
		super();
		this.texasOvenOn = texasOvenOn;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		texasOvenOn.on();
	}
}
