package org.cargoo.ocs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ROOM")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class RoomInfo {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	private String id;
	private String name;
	private String purpose;
	private String memo;
	private Integer status;
	@Embedded
	private Address address;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "contactId")
	private List<Contact> contacts = new ArrayList<>();

	// private Set<Byte[]> pictures = new HashSet<>();
}

/**
 * @OneToOne(targetEntity = Address.class, cascade =
 *                        CascadeType.ALL,fetch=FetchType.EAGER)
 * @JoinColumn(name = "AddressId", referencedColumnName = "id", unique = true)
 * @PrimaryKeyJoinColumn
 * 
 * @SecondaryTable(name = "ADDRESS", pkJoinColumns= (@PrimaryKeyJoinColumn))
 * 
 */
