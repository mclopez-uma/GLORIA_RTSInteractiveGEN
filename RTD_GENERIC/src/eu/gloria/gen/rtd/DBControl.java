package eu.gloria.gen.rtd;

import java.util.List;

import eu.gloria.rt.entity.device.DbFileInfo;
import eu.gloria.rt.entity.device.DbFileMetadata;
import eu.gloria.rt.entity.device.DbFileSystemInfo;
import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDDBInterface;

public class DBControl extends DeviceRTD implements RTDDBInterface {
	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public DBControl(String deviceId){
		super(deviceId);
	}

	@Override
	public boolean dbIsAvailableDirectAccess() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean dbIsAvailableChunkAccess() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean dbIsAvailableURIAccess() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public DbFileInfo dbGetFileInfo(String folder, String fileName)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public List<Byte> dbGetFileContent(String folder, String fileName)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public List<Byte> dbGetFileChunk(String fileName, long offset, long size)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String dbGetFileURI(String fileName) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void dbWriteFile(String fileName, List<Byte> content, List<DbFileMetadata> metadata) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public List<DbFileMetadata>  dbGetMetadata(String fileName) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public DbFileSystemInfo dbGetFileSystemInfo() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void dbRenameFile(String currentFileName, String newFileName)
			throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public void dbDeleteFile(String fileName) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");

	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

}
