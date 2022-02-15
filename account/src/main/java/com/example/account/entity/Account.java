package com.example.account.entity;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "email")
	private String email;

    @Column(name = "number")
	private String number;

    @Column(name = "address")
	private String address;

    @Column(name = "password")
	private String password;

	public Account() {

	}

	public Account(String first_name, String last_name, String email, 
            String number, String address, String password) {
        System.out.println("Cons: " + first_name);
        System.out.println("Cons: " + number);
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
        this.number = number;
        this.address = address;
        this.password = password;
	}

	public long getId() {
		return id;
	}

    public String getFirstName() {
		return first_name;
	}

    public String getLastName() {
		return last_name;
	}

    public String getEmail() {
		return email;
	}

    public String getNumber() {
		return email;
	}

    public String getAddress() {
		return address;
	}

    public String getPassword() {
		return password;
	}


	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + " number=" + email + " address=" + address + " password=" + password + "]";
	}

}
