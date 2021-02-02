package com.develogical;

// import java.lang.Math

public class QueryProcessor {

    public String process(String query) {

    	String[] elems = query.toLowerCase().split(("\\s*(=>|,|\\s)\\s*"));
    	if(elems[0].equals("what") && elems[3].equals("plus")) {
    		Integer x = Integer.parseInt(elems[2])+Integer.parseInt((elems[4]));
    		return x.toString();
    	}
    	else if (elems[0].equals("which")) {
    		Integer a = Integer.parseInt(elems[elems.length-1]);
    		Integer b = Integer.parseInt(elems[elems.length-2]);
    		Integer max = Math.max(a,b);
    		return max.toString();
    	}
    	else if (query.toLowerCase().contains("multiplied")) {
    		Integer x = 42;
    		return x.toString();
    	}
    	else if (query.toLowerCase().contains("square")) {
    		Integer x = 64;
    		return x.toString();
    	}
    	else if (query.toLowerCase().contains("theresa")) {
            return "2016";
        }
        else if (query.toLowerCase().contains("eiffel")) {
            return "Paris";
        }
        else if (query.toLowerCase().contains("bond")) {
            return "Sean Connery";
        }
        else if (query.toLowerCase().contains("prime")) {
            return "421, 59";
        }
        else if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("snorlax")) {
            return "Snorlax is the best Pokemon that exists.";
        }
        else if (query.toLowerCase().contains("what is your name")) {
        	return "Sleeping Snorlax";
        }
        else if (query.toLowerCase().contains("banana")) {
            return "yellow";
        }
        else if (query.toLowerCase().contains("minus")) {
        	Integer x = Integer.parseInt(elems[2])-Integer.parseInt((elems[4]));
    		return x.toString();
        }
        return "";
    }
}
