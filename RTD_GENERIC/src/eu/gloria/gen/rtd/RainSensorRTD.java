package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.MeasureUnit;
import eu.gloria.rt.entity.device.SensorStateIntervalDouble;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDRainDetectorInterface;

public class RainSensorRTD extends DeviceRTD implements
		RTDRainDetectorInterface {

	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public RainSensorRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public MeasureUnit rndGetMeasureUnit() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double rndGetMeasure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void rndSetMeasureStates(List<SensorStateIntervalDouble> states)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<SensorStateIntervalDouble> rndGetMeasureStates()
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean rndIsRaining() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
