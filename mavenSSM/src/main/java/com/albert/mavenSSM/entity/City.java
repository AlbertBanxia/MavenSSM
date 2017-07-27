package com.albert.mavenSSM.entity;

import java.io.Serializable;

import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(value={"country"})
public class City implements Serializable {
    private Integer id;

    private String name;

    //private String countrycode;
    //@JsonIgnore 

    private String district;

    private Integer population;

    private String countrycode;
    
    
    //@Transient
    private Country country;
    
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }
    
    public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

    public String getDistrict() {
        return district;
    }

	public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", district=" + district + ", population=" + population
				+ ", countrycode=" + countrycode + ", country=" + country + "]";
	}

}