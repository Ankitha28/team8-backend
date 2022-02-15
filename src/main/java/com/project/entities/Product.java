package com.project.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name =" products ")
@Getter
@Setter
@ToString
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private Long id;
	
	@Column(name = " p_name")
	private String name;
	
	@Column(name = "p_description")
	private String description;
	
	@Column(name = " p_image")
	private String image;
	
	@Column(name = " p_price")
	private BigDecimal price;
	
	
	//@ManyToOne
	//@JoinColumn(name = "category_id")
	//@NotNull
	//private Category category;


	public Product(Long id, String name, String description, String image, BigDecimal price,
			@NotNull Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		//this.category = category;
	}


	public Product() {
		}
	
	

}

