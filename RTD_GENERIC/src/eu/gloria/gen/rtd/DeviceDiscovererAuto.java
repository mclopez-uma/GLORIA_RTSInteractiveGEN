package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtc.DeviceDiscovererInterface;
import eu.gloria.rtd.RTDDeviceInterface;

/**
 * Custom  Device Discoverer.
 * 
 * @author jcabello
 *
 */
public class DeviceDiscovererAuto implements DeviceDiscovererInterface {

	@Override
	public List<String> getDeviceIds() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public List<Device> getDevices(boolean allProperties) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device getDevice(String deviceId, boolean allProperties)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device getDevice(String deviceId, List<String> propertyNames)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public RTDDeviceInterface getRTD(String deviceId) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

}
