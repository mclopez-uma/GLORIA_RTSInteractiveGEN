package eu.gloria.gen.rtc;

import eu.gloria.rtc.op.ExtEventResume;
import eu.gloria.rtc.op.ExtRtsInterruptionException;
import eu.gloria.rtc.op.ExtRtsInterruptionInfo;
import eu.gloria.rtc.op.IRtsExternalInterrupter;

public class GENExternalInterrupter implements IRtsExternalInterrupter {

		
	@Override
	public void interrupt() throws ExtRtsInterruptionException {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() throws ExtRtsInterruptionException {
		// TODO Auto-generated method stub

	}

	@Override
	public ExtRtsInterruptionInfo getInterruptionInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExtEventResume getEventResume() {
		// TODO Auto-generated method stub
		return null;
	}

}
