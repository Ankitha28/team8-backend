package com.project.entities;


//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table( name = "categories")
@Getter
@Setter
@ToString
public class Category {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "c_id")
	private Long categoryId;
	
	@Column(name = "c_name")
	private String categoryName;
	
	//@OneToMany(mappedBy = "category")
	//private Set<Product> products;

}
