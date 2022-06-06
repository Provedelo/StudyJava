package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class ProgramMain {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("wow thats awesome!");

		Post p1 = new Post(sdf.parse("27/05/2022 18:54:22"), "Travels Ze", "Visitins this wonderva place,", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1.toString());
	}

}