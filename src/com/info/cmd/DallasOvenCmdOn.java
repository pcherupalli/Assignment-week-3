package com.info.cmd;

public class DallasOvenCmdOn implements Command {
	DallasOven dallasOvenOn;

	public DallasOvenCmdOn(DallasOven dallasOvenOn) {
		super();
		this.dallasOvenOn = dallasOvenOn;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dallasOvenOn.on();
	}
}
