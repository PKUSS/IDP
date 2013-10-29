package org.pku.cms.util.exception;

/**
 * @author Rick
 *
 */
public class UnknownFolderException extends Exception {

	private static final long serialVersionUID = 1020107292339519152L;
	private String info = "没有找到选择的文件夹";
	/**
	 * 
	 */
	public UnknownFolderException() {
		// TODO Auto-generated constructor stub
		
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
