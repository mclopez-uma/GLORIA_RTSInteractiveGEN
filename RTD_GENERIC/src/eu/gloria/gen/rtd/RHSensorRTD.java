package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.MeasureUnit;
import eu.gloria.rt.entity.device.SensorStateIntervalDouble;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDRHSensorInterface;

public class RHSensorRTD extends DeviceRTD implements RTDRHSensorInterface {

	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public RHSensorRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public MeasureUnit rhsGetMeasureUnit() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double rhsGetMeasure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void rhsSetMeasureStates(List<SensorStateIntervalDouble> states)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<SensorStateIntervalDouble> rhsGetMeasureStates()
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
