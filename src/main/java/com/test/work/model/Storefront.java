package com.test.work.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**   
 * 实体模型  店面表
 * @author corslet 
 * @version   
 *       1.0, 2014年9月19日 上午11:03:08   
 */   
@Entity
@Table(name="storefront")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Storefront 
{
	private String id;
	private String storename;
	private Date createdate;
	private String storeaddress;
	private String storecontacts;
	private String storephonenumber;
//	private Set<Department> department = new HashSet<Department>();
	
	
	@Id
	@Column(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//店面创建时间
	@Column(name="createdate")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	//店面名称
	@Column(name="storename")
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	
	//店面地址
	@Column(name="storeaddress")
	public String getStoreaddress() {
		return storeaddress;
	}
	public void setStoreaddress(String storeaddress) {
		this.storeaddress = storeaddress;
	}
	
	//店面联系人
	@Column(name="storecontacts")
	public String getStorecontacts() {
		return storecontacts;
	}
	public void setStorecontacts(String storecontacts) {
		this.storecontacts = storecontacts;
	}
	
	//店面联系电话
	@Column(name="storephonenumber")
	public String getStorephonenumber() {
		return storephonenumber;
	}
	public void setStorephonenumber(String storephonenumber) {
		this.storephonenumber = storephonenumber;
	}

//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "store_department_list",joinColumns = {@JoinColumn(name = "store_id", nullable = false, updatable = false)},inverseJoinColumns = {@JoinColumn(name = "department_id",nullable = false,updatable = false)})
//	public Set<Department> getDepartment() {
//		return department;
//	}
//	public void setDepartment(Set<Department> department) {
//		this.department = department;
//	}
}
