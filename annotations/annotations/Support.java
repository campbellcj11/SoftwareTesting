package annotations;

import annotations.Support.type;

public @interface Support {
	
	public enum Type {GENERIC, SPECIFIC, NOT_SELECTED};
	Type type() default Type.NOT_SELECTED;
	

}
