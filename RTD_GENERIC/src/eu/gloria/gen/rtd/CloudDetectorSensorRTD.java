package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.DeviceProperty;
import eu.gloria.rt.entity.device.MeasureUnit;
import eu.gloria.rt.entity.device.SensorStateIntervalDouble;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDCloudDetectorInterface;

public class CloudDetectorSensorRTD extends DeviceRTD implements RTDCloudDetectorInterface {
	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public CloudDetectorSensorRTD(String deviceId){
		super(deviceId);
	}
	

	@Override
	public List<DeviceProperty> devGetDeviceProperties() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public DeviceProperty devGetDeviceProperty(String name) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean devUpdateDeviceProperty(String name, List<String> value)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean devUpdateDevicePropertyAsync(String name, List<String> value)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean devIsConnected() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void devConnect() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void devDisconnect() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public String devGetConfiguration() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean devIsBlocked() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public MeasureUnit cldGetMeasureUnit() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double cldGetMeasure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void cldSetMeasureStates(List<SensorStateIntervalDouble> states)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<SensorStateIntervalDouble> cldGetMeasureStates()
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
