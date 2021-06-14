package br.edu.insper.desagil.backend.model;

import java.util.List;


public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}

	@Override
	public String getFullArtistName() {
		String artistFullName = this.getFullArtistName();
		String collaborators = null;
		for (Artist artist : this.collaborators) {
			 collaborators = artist.getName();
		}
//		String.join(",", collaborators);
		return artistFullName + "feat" + "(" +  collaborators + ")";
	
	}

}
