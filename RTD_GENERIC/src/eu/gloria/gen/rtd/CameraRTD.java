package eu.gloria.gen.rtd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import eu.gloria.rt.db.scheduler.ObservingPlanManager;
import eu.gloria.rt.db.util.DBUtil;
import eu.gloria.rt.entity.db.FileContentType;
import eu.gloria.rt.entity.db.FileFormat;
import eu.gloria.rt.entity.db.FileType;
import eu.gloria.rt.entity.db.ObservingPlanOwner;
import eu.gloria.rt.entity.db.ObservingPlanType;
import eu.gloria.rt.entity.device.CameraAcquisitionMode;
import eu.gloria.rt.entity.device.CameraDigitizingMode;
import eu.gloria.rt.entity.device.CameraType;
import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.Image;
import eu.gloria.rt.entity.device.ImageContentType;
import eu.gloria.rt.entity.device.ImageFormat;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtc.op.OpManager;
import eu.gloria.rtd.RTDCameraInterface;
import eu.gloria.rti_db.tools.RTIDBProxyConnection;
import eu.gloria.tools.configuration.Config;
import eu.gloria.tools.log.LogUtil;
import eu.gloria.gen.rtd.DeviceRTD;

public class CameraRTD extends DeviceRTD implements RTDCameraInterface{
	
	private RTIDBProxyConnection dbProxy;
	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public CameraRTD(String deviceId){
		super(deviceId);		
		
	}
	

	@Override
	public String camGetFocuser() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public List<String> camGetFilters() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraType camGetCameraType() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetXsize() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetYSize() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanAbortExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanAsymetricBin() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanGetCoolerPower() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanSetCooler() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanSetCCDTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanControlTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanStopExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetCoolerPower() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camGetElectronsPerADU() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camGetFullWellCapacity() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasShutter() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasBrightness() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasConstrast() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasGain() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasGamma() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasSubframe() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasExposureTime() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camHeatSinkTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camIsPulseGuiding() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetLastError() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camGetLastExposureDuration() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Date camGetLastExposureStart() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetMaxAdu() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetMaxBinX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetMaxBinY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetPixelSizeX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetPixelSizeY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraAcquisitionMode camGetAcquisitionMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetFPS() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraDigitizingMode camGetDigitilizingMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetBinX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBinX(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetBinY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBinY(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camIsCoolerOn() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetCoolerOn(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROINumX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROINumX(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROINumY(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROINumY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROIStartX(int ROIStartX) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROIStartX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROIStartY(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROIStartY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBrightness(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetBrightness() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetContrast(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetContrast() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetGain(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetGain() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetGamma(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetGamma() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetExposureTime(double value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Double camGetExposureTime() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetCCDTemperature(float value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetCCDTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetCCDCurrentTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camAbortExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camPulseGuide(int direction, long duration) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camStartExposure(boolean light) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camStopExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Image camGetImage(ImageFormat format) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camImageReady() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public ImageContentType camGetImageDataType() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetBitDepth() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBitDepth(int bits) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetContinueModeQuality() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetContinueModeQuality(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetOneShotModeQuality() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetOneShotModeQuality(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetContinueModeImagePath() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetOneShotModeImagePath() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camGetAutoGain() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetAutoGain(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camGetAutoExposureTime() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetAutoExposureTime(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camStartContinueMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camStopContinueMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetImageURL(String uid, ImageFormat format) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageFormat> camGetOneShotModeImageFormats() throws RTException {
		return null;
	}
	
	@Override
	public List<ImageFormat> camGetContinueModeImageFormats() throws RTException {
		return null;
	}
	
	
	private void fileToRepository (String path, String UUID) throws RTException{
				
		
		String idOp = OpManager.getOpManager().getExtExecInfo().getUuidOp();
		
		EntityManager em = DBUtil.getEntityManager();
		ObservingPlanManager manager = new ObservingPlanManager();
		
		
		try{
			
			DBUtil.beginTransaction(em);
			

				//DBRepository->Create the Observing Plan
				eu.gloria.rt.entity.db.ObservingPlan repOP = new eu.gloria.rt.entity.db.ObservingPlan();
				repOP.setOwner(ObservingPlanOwner.USER);
				repOP.setType(ObservingPlanType.OBSERVATION);
				repOP.setUser(Config.getProperty("rt_config", "rts_name", "RTS_DEFAULT"));
				repOP.setUuid(idOp);
				
				try{
					String uuid = dbProxy.getProxy().opCreate(repOP);
					repOP = dbProxy.getProxy().opGet(uuid);
					
					LogUtil.info(this, "CameraRTD.fileToRepository(" + idOp + "). DBRepository OP created. UUID= " + uuid);
					
				}catch(Exception ex){
					if (!ex.getMessage().contains("The Observing Plan already exists into the Repository database."))
						throw new RTException("Error registering the Observing Plan into the DBRepository.");
				}
				
				eu.gloria.rt.entity.db.File file = null;
				
				//Resolve the file format.
            	FileFormat fileFormat = FileFormat.FITS;
            	if (path.endsWith("jpg")){
            		fileFormat = FileFormat.JPG;
            	}
            	
				//DBRepository->Create the File information
				try{
						file = new eu.gloria.rt.entity.db.File();
						file.setContentType(FileContentType.OBSERVATION);
						file.setDate(getDate(new Date()));
						file.setType(FileType.IMAGE);
						file.setUuid(UUID);						
						
						dbProxy.getProxy().fileCreate(idOp, file);

						LogUtil.info(this, "CameraRTD.fileToRepository(" + idOp + "). CREATED GLORIA file UUID=" + file.getUuid());

					}catch(Exception ex){
						throw new Exception("Error registering a file into the DBRepository.");
					}
				
				
				
				//Creates the format
            	String urlSource = "file://" + path;
            	            	
            	try{
        			dbProxy.getProxy().fileAddFormat(file.getUuid(), fileFormat, urlSource);
        			
        			LogUtil.info(this, "CameraRTD.fileToRepository(" + idOp + "). UPLOADED file format. url=" + urlSource);
        		}catch(Exception ex){
					throw new Exception("Error adding a file format to a file into the DBRepository. urlSourcefile=" + urlSource);
				}
            	
//			}
			
		} catch (Exception ex) {
			
			DBUtil.rollback(em);
			
			throw new RTException(ex.getMessage());
			
		} finally {
			DBUtil.close(em);
		}
		
	}
	
	private XMLGregorianCalendar getDate(Date date) throws Exception{
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		return xmlCalendar;
	}
	
	private void initialization(){
		String proxyHost = Config.getProperty("rt_config","proxyHost");
		String proxyPort = Config.getProperty("rt_config","proxyPort");
		String proxyAppName = Config.getProperty("rt_config","proxyAppName");
		String proxyUser = Config.getProperty("rt_config","proxyUser");
		String proxyPw = Config.getProperty("rt_config","proxyPw");
		boolean proxyHttps = Config.getPropertyBoolean("rt_config","proxyHttps",false);
		String proxyCertRep = Config.getProperty("rt_config","proxyCertRep");
				
		dbProxy = new RTIDBProxyConnection(proxyHost, proxyPort, proxyAppName, proxyUser, proxyPw, proxyHttps, proxyCertRep);
	}

	private String getImagePathfromServlet(String uid, ImageFormat format) throws RTException{
		
		//check the Image Format
				if (format != ImageFormat.JPG && format != ImageFormat.FITS ){
					throw new UnsupportedOpException ("Unsupported Format:" + format);
				}				

				if (uid == null)
					throw new RTException ("No UUID provided");
				
				eu.gloria.rt.entity.environment.config.device.DeviceProperty publicServletPath = DeviceRTD.configDeviceManager.getProperty(this.getDeviceId(), "PUBLIC_SERVLET_PATH");

				String path = null;

				if (format == ImageFormat.JPG){
					path = publicServletPath.getDefaultValue()+ uid + "&format=JPG";
				}else{
					path = publicServletPath.getDefaultValue()+ uid + "&format=FITS";
				}
					
				try {
					URL url = new URL(path+"&exist=1");
					URLConnection urlConnection = url.openConnection();	
					HttpURLConnection httpUrlConnection = (HttpURLConnection)urlConnection;
					if (httpUrlConnection.getResponseCode() == HttpServletResponse.SC_OK){
						
						return path;
						
					}else{
						throw new RTException("NOT_AVAILABLE");
					}
					
				} catch (MalformedURLException e) {
					e.printStackTrace();
					throw new RTException("NOT_AVAILABLE");
				} catch (IOException e) {
					e.printStackTrace();
					throw new RTException("NOT_AVAILABLE");
				}	
	}
}
