package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.DeviceProperty;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtc.environment.config.device.ConfigDeviceManager;
import eu.gloria.rtd.RTDDeviceInterface;
import eu.gloria.tools.cache.CacheManager;
import eu.gloria.tools.log.LogUtil;

/***
 * GENERIC - Device - RTD.
 * 
 * It's an abstract class. All future RTD must inherit from this class.
 * 
 * @author jcabello
 *
 */
public abstract class DeviceRTD implements RTDDeviceInterface {
		
	
	/**
	 * Device configuration list manager.
	 */
	protected static ConfigDeviceManager configDeviceManager;
	
	
	static{	
		
		try{
			
			configDeviceManager = new ConfigDeviceManager();
			
		}catch(Exception ex){
			LogUtil.severe(null, "DeviceRTD. static initialization. Error loading the device list XML." + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * Device identifier.
	 */
	private String deviceId = null;
	
	/**
	 * Constructor
	 * @param deviceId
	 */
	public DeviceRTD(String deviceId){
		this.deviceId = deviceId;
	}
	

	/**
	 * Return the Device information.
	 * @param allProperties false if it is not needed all properties (performance purpose).
	 * @return Device information.
	 * @throws RTException In error case.
	 */
	public abstract Device devGetDevice(boolean allProperties)  throws RTException;
	
	/**
	 * Access method
	 * @return
	 */
	@Override
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * Access method
	 * @return 
	 */
	@Override
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

}
