package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.MeasureUnit;
import eu.gloria.rt.entity.device.SensorStateIntervalDouble;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDWeatherVaneInterface;

public class WeatherVaneRTD extends DeviceRTD implements
		RTDWeatherVaneInterface {

	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public WeatherVaneRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public MeasureUnit wvnGetMeasureUnit() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double wvnGetMeasure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double wvnGetAbosluteDegrees() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void wvnSetMeasureStates(List<SensorStateIntervalDouble> states)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<SensorStateIntervalDouble> wvnGetMeasureStates() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
