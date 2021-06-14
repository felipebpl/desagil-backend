package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
//		this.ratings = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}

	public void setRatings(Map<String, Integer> ratings) {
		this.ratings = ratings;
	}
	
	public void addTrack (Track track) {
		this.tracks.add(track);		
	}

	
	public void putRatig(String nome, int avaliacao) {
		this.ratings.put(nome, avaliacao); 
	}
	

	
	public double averageRatings() {
		double average = 0;
		for (String nome: this.ratings.keySet()) {
			average += this.ratings.get(nome);
		}
		int i = (int) average;
		double d = average - i;
		if (d < 0.26){
			d = 0.0;
		}
		else if (d >= 0.74){
			d = 1.0;		
		}
		d = 0.5;
		return i + d;
	}
	
}
