package com.grownited.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "league")
public class LeagueEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer leagueId;
	private String leaugeTitle;
	private String location;
	private Integer overs;
	private Integer maxParticipantTeam;
	private String startDate;
	private String endDate;
	private String logoPath;
	private Integer userId;// foreign key
	private String ballType;
	private Boolean active;// allow team to join leauge

	public Integer getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeaugeTitle() {
		return leaugeTitle;
	}

	public void setLeaugeTitle(String leaugeTitle) {
		this.leaugeTitle = leaugeTitle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getOvers() {
		return overs;
	}

	public void setOvers(Integer overs) {
		this.overs = overs;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getBallType() {
		return ballType;
	}

	public void setBallType(String ballType) {
		this.ballType = ballType;
	}

	public Integer getMaxParticipantTeam() {
		return maxParticipantTeam;
	}

	public void setMaxParticipantTeam(Integer maxParticipantTeam) {
		this.maxParticipantTeam = maxParticipantTeam;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
