package com.ireland.travel.entity.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Data;


@Data
@Entity
@Table(name = "report")
@XmlRootElement
public class Report {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    private String name;

    @NotNull
    @Size(max = 700)
    private String description;
    
    @Size(max = 700)
    private String startTime;
    
    @Size(max = 700)
    private String exitTime;
    
    @Size(max = 700)
    private String status;
    
    @Size(max = 700)
    private String provider;
    
    
    public Report(){}
    
	public Report(String name, String description, String startTime, String exitTime, String status, String provider ){
		this.name=name;
		this.description = description;
		this.startTime = startTime;
		this.exitTime=exitTime;
		this.status=status;
		this.provider=provider;
	}
    

	@Override
	public String toString() {
        return this.getName();
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

		
}
