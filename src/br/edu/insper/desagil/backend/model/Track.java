package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name; 
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		String durationString = "";
		int minutos = 0;
		int segundos = 0;
		 		
		if (this.duration < 10) {
			durationString = "0:0" + this.duration;
			return durationString;
		}
		else if (this.duration < 60){
			durationString = "0:" + this.duration;
			return durationString;
		}
		minutos = (int)(this.duration/60);
		segundos = minutos - 1;
		durationString = minutos + ":" + segundos;
		return durationString;
	}
	
	public String getFullArtistName() {
		String artistFullName = this.artist.getName();
		return artistFullName;	
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	


}
