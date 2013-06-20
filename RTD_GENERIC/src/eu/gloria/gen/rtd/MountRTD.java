package eu.gloria.gen.rtd;

import java.util.Date;
import java.util.List;

import eu.gloria.rt.entity.device.AxisRateType;
import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.MountPointingModel;
import eu.gloria.rt.entity.device.TrackingRateType;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDMountInterface;

public class MountRTD extends DeviceRTD implements RTDMountInterface {

	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public MountRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public Date mntGetUtcClock() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void mntSetUtcClock(Date date) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public double mntGetSiderealDate() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntIsAtHome() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntIsParked() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetTargetRightAscension() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetTargetDeclination() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetTrackingDeclinationRate() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetTrackingAscensionRate() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public TrackingRateType mntGetTrackingRate() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void mntSetTrackingRate(TrackingRateType rate) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public boolean mntGetTracking() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void mntSetTracking(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public double mntGetGuideRateDeclination() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetDeclinationRateRightAscension() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntIsSlewing() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetPosAxis1() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetPosAxis2() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetPosAxis3() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanPulseGuide() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanSetGuideRates() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanSetPark() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void mntSetPark(double ascension, double declination)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public double mntGetALTParkPos() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double mntGetAZParkPos() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanSetTracking() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanSetTrackingRate() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanSlewCoordinates() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanSlewCoordinatesAsync() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}
	
	@Override
	public boolean mntCanSlewObject() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

	@Override
	public boolean mntCanSlewAltAz() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanSlewAzAsync() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean mntCanMoveAzis() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public List<AxisRateType> mntAxisRate() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public List<TrackingRateType> mntTrackingRates() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void mntGoHome() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntPark() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntUnpark() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntSlewToAltAz(double azimuth, double altitude)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntSlewToAltAzAsync(double azimuth, double altitude)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntSlewToCoordinates(double ascension, double declination)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntSlewToCoordinatesAsync(double ascension, double declination)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntMoveAxis(int axisType, double rate) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntPulseGuide(int guideDirection, int duration)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntStopSlew(int axisType) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntStopSlew() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public MountPointingModel mntGetPointingModel() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void mntMoveNorth() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntMoveEast() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntMoveSouth() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntMoveWest() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntSetSlewRate(String rate) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void mntSlewObject(String object) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

	@Override
	public String mntGetSlewRate() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

	@Override
	public boolean mntIsPointingAtObject(String object, double raError,
			double decError) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

	@Override
	public boolean mntIsPointingAtCoordinates(double ra, double dec,
			double raError, double decError) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

}
