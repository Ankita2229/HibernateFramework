package DATA_VO;

import java.io.Serializable;

public class VO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long data_Id;
	
	private String u_name;
	private String pass;
		
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getData_Id() {
		return data_Id;
	}
	public void setData_Id(long data_Id) {
		this.data_Id = data_Id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
