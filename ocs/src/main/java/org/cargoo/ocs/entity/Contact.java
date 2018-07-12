package org.cargoo.ocs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CONTACT")
@Getter
@Setter
@NoArgsConstructor
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private String mobile;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contactId")
	private RoomInfo room;

	public Contact(String name, String gender, String mobile) {
		this();
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile + "]";
	}

}
