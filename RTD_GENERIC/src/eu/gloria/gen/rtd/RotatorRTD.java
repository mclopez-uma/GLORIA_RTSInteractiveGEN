package eu.gloria.gen.rtd;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDRotatorInterface;

public class RotatorRTD extends DeviceRTD implements RTDRotatorInterface {

	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public RotatorRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public double rttGetCurrentPosition() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void rttSetTargetPosition(double position) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
