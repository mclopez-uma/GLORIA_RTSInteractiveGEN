package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.MeasureUnit;
import eu.gloria.rt.entity.device.SensorStateIntervalDouble;
import eu.gloria.rt.entity.device.SensorStateIntervalLong;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDStormSensorInterface;

public class StormSensorRTD extends DeviceRTD implements
		RTDStormSensorInterface {

	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public StormSensorRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public boolean strIsAvailableOrientation() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public MeasureUnit strGetDistanceMeasureUnit() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long strGetDistanceMeasure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double strGetDegrees() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double strGetAbosoluteDegrees() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void strSetDistanceMeasureStates(List<SensorStateIntervalLong> states)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<SensorStateIntervalLong> strGetDistanceMeasureStates()
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void strSetOrientationMeasureStates(
			List<SensorStateIntervalDouble> states) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<SensorStateIntervalDouble> strGetOrientationMeasureStates()
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
