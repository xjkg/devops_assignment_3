package com.arcada.devops;

public class App {
	
     public String[] getFriendList(String link) {
	    if(link.equals("https://facebook.com/user1")) {
	    	return new String[] {"Frodo", "Sam", "Gandalf", "Aragorn", "Legolas", 
	    		    "Gimli", "Boromir", "Sauron", "Gollum", "Bilbo", 
	    		    "Galadriel", "Elrond", "Saruman", "Eowyn", "Faramir", 
	    		    "Denethor", "Arwen", "Merry", "Pippin", "Treebeard", 
	    		    "Theoden", "Eomer", "Haldir", "Grima", "Radagast", 
	    		    "Rosie", "Bard", "Smaug", "Beorn", "Dwalin", 
	    		    "Kili", "Fili", "Thorin", "Gloin", "Nori", 
	    		    "Ori", "Dori", "Bifur", "Bofur", "Khamul", 
	    		    "Thranduil", "Azog", "Tauriel", "Lurtz"};
	    }
	    else if (link.equals("https://facebook.com/user2")) {
	    	return new String[] {"John", "Jane"};
	    }
	    else if (link.equals("https://facebook.com/user3")) {
	    	return new String[] {};
	    }
	    else {
	    	return null;
	    }
    }

}
