package eu.gloria.gen.rtd;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDFocuserInterface;

public class FocuserRTD extends DeviceRTD implements RTDFocuserInterface {

	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public FocuserRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public String focGetCamera() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean focIsAbsolute() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double focGetStepSize() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long focGetMaxIncrement() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long focGetMaxStep() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long focGetPosition() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean focIsTempCompAvailable() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double focGetTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void focSetTempComp(boolean trackingMode) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void focHalt() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void focMove(long position) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
