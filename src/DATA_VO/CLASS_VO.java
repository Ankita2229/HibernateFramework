package DATA_VO;

import java.io.Serializable;

public class CLASS_VO implements Serializable{
	
	
	private long data_Id;
	
	private String ur_name;
	private int ph_no;
	private String h_ad;
	private String elec_id;
	private String item;
	private int quos;
	private String money;
	
	
	
	public long getData_Id() {
		return data_Id;
	}
	public void setData_Id(long data_Id) {
		this.data_Id = data_Id;
	}
	public String getUr_name() {
		return ur_name;
	}
	public void setUr_name(String ur_name) {
		this.ur_name = ur_name;
	}
	public int getPh_no() {
		return ph_no;
	}
	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}
	public String getH_ad() {
		return h_ad;
	}
	public void setH_ad(String h_ad) {
		this.h_ad = h_ad;
	}
	public String getElec_id() {
		return elec_id;
	}
	public void setElec_id(String elec_id) {
		this.elec_id = elec_id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuos() {
		return quos;
	}
	public void setQuos(int quos) {
		this.quos = quos;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
	
	
	

}
