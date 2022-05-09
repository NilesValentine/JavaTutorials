package com.NilesValentine.builders;

import com.NilesValentine.interfaces.Packager;
import com.NilesValentine.model.Color;
import com.NilesValentine.model.Content;
import com.NilesValentine.model.Dimension;

public class Assembler implements Packager {
	
	 private final int DIMENSION_MAX = 50;
	    private final int COLOR_MAX = 256;
	    private final int CONTENT_MAX = 100;

	    private Color generateColor() {
	        int red = (int)Math.random() * COLOR_MAX + 1;
	        int green = (int)Math.random() * COLOR_MAX + 1;
	        int blue = (int)Math.random() * COLOR_MAX + 1;

	        return new Color(red, green, blue);
	    }

	    private Content generateContent() {
	        int amount = (int) Math.random() * CONTENT_MAX + 1;
	        String description = "This is a new Package: " + amount;

	        return new Content(amount, description);
	    }

	    private Dimension generateDimension() {
	        double width = Math.random() * DIMENSION_MAX+ 1;
	        double height = Math.random() * DIMENSION_MAX+ 1;
	        double length = Math.random() * DIMENSION_MAX + 1;

	        return new Dimension(width, height, length);
	    }

}
