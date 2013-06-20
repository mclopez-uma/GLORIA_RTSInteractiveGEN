package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDFilterWheelInterface;

public class FilterWheelRTD extends DeviceRTD implements
		RTDFilterWheelInterface {
	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public FilterWheelRTD(String deviceId){
		super(deviceId);
	}

	@Override
	public String fwGetCamera() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int fwGetPositionNumber() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int fwGetSpeedSwitching() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float fwGetFilterSize() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String fwGetFilterKind() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean fwIsAtHome() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void fwSetOffset(List<Integer> positions) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void fwSelectFilterKind(String kind) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void fwSelectFilterPosition(int position) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void fwGoHome() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}
	

	@Override
	public List<String> fwGetFilterList() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

}
