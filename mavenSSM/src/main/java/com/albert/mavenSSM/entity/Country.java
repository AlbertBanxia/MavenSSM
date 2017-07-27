package com.albert.mavenSSM.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
//@JsonIgnoreProperties(value={"cityList"})
public class Country implements Serializable {
    private String code;

    private String name;

    private String continent;

    private String region;

    private Float surfacearea;

    private Short indepyear;

    private Integer population;

    private Float lifeexpectancy;

    private Float gnp;

    private Float gnpold;

    private String localname;

    private String governmentform;

    private String headofstate;

    private Integer capital;

    private String code2;
    //@JsonIgnore
    //@Transient
    private List<City> cityList;
    
    public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Float getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(Float surfacearea) {
        this.surfacearea = surfacearea;
    }

    public Short getIndepyear() {
        return indepyear;
    }

    public void setIndepyear(Short indepyear) {
        this.indepyear = indepyear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Float getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(Float lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    public Float getGnp() {
        return gnp;
    }

    public void setGnp(Float gnp) {
        this.gnp = gnp;
    }

    public Float getGnpold() {
        return gnpold;
    }

    public void setGnpold(Float gnpold) {
        this.gnpold = gnpold;
    }

    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname == null ? null : localname.trim();
    }

    public String getGovernmentform() {
        return governmentform;
    }

    public void setGovernmentform(String governmentform) {
        this.governmentform = governmentform == null ? null : governmentform.trim();
    }

    public String getHeadofstate() {
        return headofstate;
    }

    public void setHeadofstate(String headofstate) {
        this.headofstate = headofstate == null ? null : headofstate.trim();
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2 == null ? null : code2.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Country other = (Country) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getContinent() == null ? other.getContinent() == null : this.getContinent().equals(other.getContinent()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getSurfacearea() == null ? other.getSurfacearea() == null : this.getSurfacearea().equals(other.getSurfacearea()))
            && (this.getIndepyear() == null ? other.getIndepyear() == null : this.getIndepyear().equals(other.getIndepyear()))
            && (this.getPopulation() == null ? other.getPopulation() == null : this.getPopulation().equals(other.getPopulation()))
            && (this.getLifeexpectancy() == null ? other.getLifeexpectancy() == null : this.getLifeexpectancy().equals(other.getLifeexpectancy()))
            && (this.getGnp() == null ? other.getGnp() == null : this.getGnp().equals(other.getGnp()))
            && (this.getGnpold() == null ? other.getGnpold() == null : this.getGnpold().equals(other.getGnpold()))
            && (this.getLocalname() == null ? other.getLocalname() == null : this.getLocalname().equals(other.getLocalname()))
            && (this.getGovernmentform() == null ? other.getGovernmentform() == null : this.getGovernmentform().equals(other.getGovernmentform()))
            && (this.getHeadofstate() == null ? other.getHeadofstate() == null : this.getHeadofstate().equals(other.getHeadofstate()))
            && (this.getCapital() == null ? other.getCapital() == null : this.getCapital().equals(other.getCapital()))
            && (this.getCode2() == null ? other.getCode2() == null : this.getCode2().equals(other.getCode2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getContinent() == null) ? 0 : getContinent().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getSurfacearea() == null) ? 0 : getSurfacearea().hashCode());
        result = prime * result + ((getIndepyear() == null) ? 0 : getIndepyear().hashCode());
        result = prime * result + ((getPopulation() == null) ? 0 : getPopulation().hashCode());
        result = prime * result + ((getLifeexpectancy() == null) ? 0 : getLifeexpectancy().hashCode());
        result = prime * result + ((getGnp() == null) ? 0 : getGnp().hashCode());
        result = prime * result + ((getGnpold() == null) ? 0 : getGnpold().hashCode());
        result = prime * result + ((getLocalname() == null) ? 0 : getLocalname().hashCode());
        result = prime * result + ((getGovernmentform() == null) ? 0 : getGovernmentform().hashCode());
        result = prime * result + ((getHeadofstate() == null) ? 0 : getHeadofstate().hashCode());
        result = prime * result + ((getCapital() == null) ? 0 : getCapital().hashCode());
        result = prime * result + ((getCode2() == null) ? 0 : getCode2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", continent=").append(continent);
        sb.append(", region=").append(region);
        sb.append(", surfacearea=").append(surfacearea);
        sb.append(", indepyear=").append(indepyear);
        sb.append(", population=").append(population);
        sb.append(", lifeexpectancy=").append(lifeexpectancy);
        sb.append(", gnp=").append(gnp);
        sb.append(", gnpold=").append(gnpold);
        sb.append(", localname=").append(localname);
        sb.append(", governmentform=").append(governmentform);
        sb.append(", headofstate=").append(headofstate);
        sb.append(", capital=").append(capital);
        sb.append(", code2=").append(code2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}