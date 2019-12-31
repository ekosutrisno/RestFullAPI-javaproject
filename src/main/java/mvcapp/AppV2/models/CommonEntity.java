package mvcapp.AppV2.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * CommonEntity
 */
@MappedSuperclass
public class CommonEntity {

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_on", nullable = false)
  private Date createdOn;
  @Column(name = "created_by", nullable = false)
  private String createdBy;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "modifed_on", nullable = false)
  private Date modifedOn;
  @Column(name = "modifed_by", nullable = false)
  private String modifedBy;

  @Column(name = "is_delete", nullable = false)
  private Boolean siDelete = false;

  public CommonEntity() {
  }

  public CommonEntity(Date createdOn, String createdBy, Date modifedOn, String modifedBy, Boolean siDelete) {
    this.createdOn = createdOn;
    this.createdBy = createdBy;
    this.modifedOn = modifedOn;
    this.modifedBy = modifedBy;
    this.siDelete = siDelete;
  }

  public Date getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Date getModifedOn() {
    return modifedOn;
  }

  public void setModifedOn(Date modifedOn) {
    this.modifedOn = modifedOn;
  }

  public String getModifedBy() {
    return modifedBy;
  }

  public void setModifedBy(String modifedBy) {
    this.modifedBy = modifedBy;
  }

  public Boolean getSiDelete() {
    return siDelete;
  }

  public void setSiDelete(Boolean siDelete) {
    this.siDelete = siDelete;
  }

}