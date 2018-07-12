package org.cargoo.ocs.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 
 * @author SHEN HONG
 * @since 2018.05.14
 * @version 1.0.0
 *
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	/**
	 * 国家、省、市、区县、邮编 地址1、地址2
	 */
	private String country;
	private String province;
	private String city;
	private String county;
	private String zipcode;
	private String address1;
	private String address2;

}

/**
 * @Entity
 * @Table
 * @Id
 * @GenericGenerator(name="uuid", strategy="uuid2") 
 * @GeneratedValue(generator="uuid")
 * private String id;
 * 
 */
