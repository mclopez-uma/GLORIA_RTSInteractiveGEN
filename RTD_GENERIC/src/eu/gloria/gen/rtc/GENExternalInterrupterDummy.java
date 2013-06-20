package eu.gloria.gen.rtc;

import eu.gloria.rtc.op.ExtEventResume;
import eu.gloria.rtc.op.ExtExecInterruptionState;
import eu.gloria.rtc.op.ExtRtsInterruptionException;
import eu.gloria.rtc.op.ExtRtsInterruptionInfo;
import eu.gloria.rtc.op.IRtsExternalInterrupter;
import eu.gloria.tools.configuration.Config;

public class GENExternalInterrupterDummy implements IRtsExternalInterrupter {

	private ExtRtsInterruptionInfo info;
	
	
	public GENExternalInterrupterDummy(){				
		
		info = new ExtRtsInterruptionInfo();
		info.setInterruptable(true);
		info.setState(ExtExecInterruptionState.RESUMED);
	}
	
	@Override
	public void interrupt() throws ExtRtsInterruptionException {
		
		if (info.getState() == ExtExecInterruptionState.INTERRUPTED){		
			throw new ExtRtsInterruptionException("Already INTERRUPTED.");		
		}
		
		info.setInterruptable(false);
		info.setState(ExtExecInterruptionState.INTERRUPTED);
		info.setUnInterruptableReason("Already INTERRUPTED.");

	}

	@Override
	public void resume() throws ExtRtsInterruptionException {

		switch(info.getState()){
		
		case RESUMED:
			
			info.setInterruptable(true);
			info.setState(ExtExecInterruptionState.RESUMED);
			info.setUnInterruptableReason("");
			
			break;	
		
			
		case INTERRUPTED:
				
				info.setInterruptable(true);
				info.setState(ExtExecInterruptionState.RESUMED);
				info.setUnInterruptableReason("");
		
			break;	
		}

	}

	@Override
	public ExtRtsInterruptionInfo getInterruptionInfo() {
		
		return info;
	}

	@Override
	public ExtEventResume getEventResume() {
		// TODO Auto-generated method stub
		return null;
	}

}
