package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("Type in a random name here.");
String professional = JOptionPane.showInputDialog("Please type in another name here.");
String doAtTheLeague = JOptionPane.showInputDialog("Please enter something that you would do at the League");

if (name .equals("joe")) {
	name = "joe";
}

else if (name .equals("bob")) {
	name = "bob";
}

else if (name .equals("billy")) {
	name = "billy";
}

else {
	name = "fred";
}

if (professional .equals("ted")) {
	professional = "ted";
}

else if (professional .equals("ed")) {
	professional = "ed";
}

else {
	professional = "john";
}

if (doAtTheLeague .equals("collaborating")) {
	doAtTheLeague = "collaborating";
}

else if (doAtTheLeague .equals("building")) {
	doAtTheLeague = "building";
}

else {
	doAtTheLeague = "coding";
}



	
	
	System.out.println("There once was a person named " + name + ". Ever since he was a little child he had always dreamed of a career in code.\n " + 
 "Despite wanting to be a programmer, he was never very hard-working and did not like learning very much.\n " + 
 "As a result, he had virtually no experience with coding until one day a professional programmer named\n " + professional +  
 " from the League advised " + name + " to give it a shot and learn code. He added that the League made learning very fun\n " + 
 "and easy, which was something that truly appealed to his I-don't-like-working-too-hard mindset.\n " +
 "Consequently, " + name + " decided to join the League. Surprisingly, " + name + " did not cry or whine at all while at the League,\n " + 
 "something unlike the last 2345343 times he tried to learn something new. In fact, " + name + " was able to continue learning\n " + 
 "at the League, as he became more and more fond of "+doAtTheLeague+" and learning. By joining the League, " + name + " was able to learn\n " + 
 "a lot about " + doAtTheLeague + " as well develop a much more mature mindset. He went on to rule the world, as expected,\n " +  
 "but who would have thought that such a lazy kid could have turned out so well");
}
}
