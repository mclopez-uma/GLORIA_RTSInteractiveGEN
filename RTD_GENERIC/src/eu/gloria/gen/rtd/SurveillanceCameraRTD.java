package eu.gloria.gen.rtd;

import eu.gloria.rt.entity.device.CameraAcquisitionMode;
import eu.gloria.rt.entity.device.CameraDigitizingMode;
import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.Image;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDSurveillanceCameraInterface;

public class SurveillanceCameraRTD extends DeviceRTD implements RTDSurveillanceCameraInterface{

	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public SurveillanceCameraRTD(String deviceId){
		super(deviceId);
	}
	
	@Override
	public boolean scamHasBrightness() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean scamHasContrast() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraAcquisitionMode scamAcquisitionMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float scamGetFPS() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraDigitizingMode scamGetDigitizingMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean scamIsPTSupported() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean scamIsZoomSupported() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetPanMin() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetPanMax() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetTiltMin() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetTiltMax() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetZoomMax() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double scamGetExposureTime() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamSetExposureTime(double value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean scamIsImageReady() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String scamGetVideoStreamingURL() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamSetBrightness(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long scamGetBrightness() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamSetContrast(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long scamGetContrast() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetPanRotation() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamSetPanRotation(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetTiltRotation() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamSetTiltRotation(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int scamGetZoom() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamSetZoom(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamAbortExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamStartExposure(boolean light) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void scamStopExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Image scamGetImage() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String scamGetImageURL() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
	}

}
