package mvcapp.AppV2.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import mvcapp.AppV2.models.CommonEntity;

/**
 * CategoryModel
 */
@Entity
@Table(name = CategoryModel.TABLE_NAME)
public class CategoryModel extends CommonEntity {
  public static final String TABLE_NAME = "tb_m_category";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "category_id")
  private Integer catgoryId;

  @Column(name = "category_name", nullable = false)
  private String categoryName;

  

}