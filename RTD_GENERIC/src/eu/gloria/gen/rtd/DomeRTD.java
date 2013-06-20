package eu.gloria.gen.rtd;

import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDDomeInterface;

public class DomeRTD extends DeviceRTD implements RTDDomeInterface {
	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public DomeRTD(String deviceId){
		super(deviceId);
	}

	@Override
	public int domGetNumberElement() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean domCanSetAltitude() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean domCanSetAzimuth() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean domCanSetPark() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean domIsAtHome() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean domIsAtPark() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double domGetAltitude() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double domGetAzimuth() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void domOpen(int element) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void domClose(int element) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void domGoHome() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void domSetPark(double altitude, double azimuth) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void domPark() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void domMoveAzimuth(double azimuth) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void domMoveAltitude(double altitude) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void domSetTracking(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public boolean domGetTracking() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void domSlewObject(String object) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
