package net.slipp.domain.board;

public class UniqueKey {

	private static int id = 0;

	public static int getId() {
		return id;
	}
	
	public static int plusOneAndGetId() {
		id++;
		return id;
	}
	
}
