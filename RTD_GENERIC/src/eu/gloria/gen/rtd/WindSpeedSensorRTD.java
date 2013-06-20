package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.MeasureUnit;
import eu.gloria.rt.entity.device.SensorStateIntervalDouble;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDWindSpeedInterface;

public class WindSpeedSensorRTD extends DeviceRTD implements
		RTDWindSpeedInterface {
	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public WindSpeedSensorRTD(String deviceId){
		super(deviceId);
	}

	@Override
	public MeasureUnit wspGetMeasureUnit() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double wspGetMeasure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void wspSetMeasureStates(List<SensorStateIntervalDouble> states)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<SensorStateIntervalDouble> wspGetMeasureStates()
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
