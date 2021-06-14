package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Artist a;
	private Artist b;
	private Artist s;
	private Artist l;
	private Track t;
	private List<Artist> c;
	
	@BeforeEach
	void setUp() {
		a = new Artist("Anitta");
		b = new Artist("Becky G");
		s = new Artist("Snoop Dog");
		l = new Artist("Ludmilla");
//		List<Artist> c = new ArrayList<>();
	}

	@Test
	void testZeroSeconds() {
		t = new Track(a, "Atencion", 0);
		assertEquals("0:00", t.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		t = new Track(a, "Atencion", 5);
		assertEquals("0:05", t.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		t = new Track(a, "Atencion", 25);
		assertEquals("0:25", t.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		t = new Track(a, "Atencion", 60);
		assertEquals("1:00", t.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		t = new Track(a, "Atencion", 65);
		assertEquals("1:05", t.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		t = new Track(a, "Atencion", 75);
		assertEquals("1:25", t.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		t = new Track(a, "Atencion", 120);
		assertEquals("2:00", t.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		t = new Track(a, "Atencion", 125);
		assertEquals("2:25", t.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		t = new Track(a, "Atencion", 145);
		assertEquals("2:25", t.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		c.add(b);
		t = new CollaborationTrack(a, "Atencion", 145, c);
		assertEquals("Anitta (feat. Becky G)", t.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		c.add(l);
		c.add(s);
		t = new CollaborationTrack(a, "Atencion", 145, c);
		assertEquals("Anitta (feat. Becky G, )", t.getFullArtistName());
	}
}
