/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ESTUDIANTES
 */

@Setter
@Getter
@NoArgsConstructor
public class Person {
    private long personId;
    private long cedula;
    private String name;
    private long cellPhone;
    
	public Person(long personId, long cedula, String name, long cellPhone) {
		super();
		this.personId = personId;
		this.cedula = cedula;
		this.name = name;
		this.cellPhone = cellPhone;
	}
    
    
}
