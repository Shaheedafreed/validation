package com.marlabs.resource.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Resource_Details")
public class ResourceEntity implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@Column(name="resourceId")
	private String resourceId;
	@Column(name="techId")
	private int techId;
	@Column(name="firstName")
	private String firstName ;
	@Column(name="lastName")
	private String lastName;
	@Column(name="dateOfJoin")
	private String dateOfJoin;
	@Column(name="contactNumber")
	private int contactNumber;
	@Column(name="emailId")
	private String emailId;
	@Column(name="skypeId")
	private String skypeId;
	@Column(name="alternateMobileNumber")
	private int alternateMobileNumber;
	@Column(name="highestQualification")
	private String highestQualification;
	@Column(name="ssc")
	private String ssc;
	@Column(name="diploma")
	private String diploma;
	@Column(name="intermediate")
	private String intermediate;
	@Column(name="ug")
	private String ug;
	@Column(name="pg")
	private String pg;
	@Column(name="emergencyContactNumber")
	private int emergencyContactNumber;
	@Column(name="experienceClaimed")
	private String experienceClaimed;
	@Column(name="currentStatus")
	private String currentStatus;
	@Column(name="resourceDesignation")
	private String resourceDesignation;
	@Column(name="resoucePrimarySkillSet")
	private String resoucePrimarySkillSet;
	@Column(name="uploadUpdatedResume")
	private String uploadUpdatedResume;
	
	public ResourceEntity() {
		super();
		
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public int getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(int alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getSsc() {
		return ssc;
	}

	public void setSsc(String ssc) {
		this.ssc = ssc;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getIntermediate() {
		return intermediate;
	}

	public void setIntermediate(String intermediate) {
		this.intermediate = intermediate;
	}

	public String getUg() {
		return ug;
	}

	public void setUg(String ug) {
		this.ug = ug;
	}

	public String getPg() {
		return pg;
	}

	public void setPg(String pg) {
		this.pg = pg;
	}

	public int getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(int emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getExperienceClaimed() {
		return experienceClaimed;
	}

	public void setExperienceClaimed(String experienceClaimed) {
		this.experienceClaimed = experienceClaimed;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getResourceDesignation() {
		return resourceDesignation;
	}

	public void setResourceDesignation(String resourceDesignation) {
		this.resourceDesignation = resourceDesignation;
	}

	public String getResoucePrimarySkillSet() {
		return resoucePrimarySkillSet;
	}

	public void setResoucePrimarySkillSet(String resoucePrimarySkillSet) {
		this.resoucePrimarySkillSet = resoucePrimarySkillSet;
	}

	public String getUploadUpdatedResume() {
		return uploadUpdatedResume;
	}

	public void setUploadUpdatedResume(String uploadUpdatedResume) {
		this.uploadUpdatedResume = uploadUpdatedResume;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ResourceEntity [resourceId=" + resourceId + ", techId=" + techId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfJoin=" + dateOfJoin + ", contactNumber=" + contactNumber
				+ ", emailId=" + emailId + ", skypeId=" + skypeId + ", alternateMobileNumber=" + alternateMobileNumber
				+ ", highestQualification=" + highestQualification + ", ssc=" + ssc + ", diploma=" + diploma
				+ ", intermediate=" + intermediate + ", ug=" + ug + ", pg=" + pg + ", emergencyContactNumber="
				+ emergencyContactNumber + ", experienceClaimed=" + experienceClaimed + ", currentStatus=" + currentStatus
				+ ", resourceDesignation=" + resourceDesignation + ", resoucePrimarySkillSet=" + resoucePrimarySkillSet
				+ ", uploadUpdatedResume=" + uploadUpdatedResume + "]";
	}
	
	
	

	
}
