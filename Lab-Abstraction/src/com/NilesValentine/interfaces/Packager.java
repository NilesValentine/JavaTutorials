package com.NilesValentine.interfaces;

import com.NilesValentine.model.Content;

public interface Packager {
	public Package assemblePackage() {
		
		 Content content = generateContent();
		    Color color = generateColor();
		    Dimension dimension = generateDimension();

		    return new Package(content, color, dimension);
	}
}
