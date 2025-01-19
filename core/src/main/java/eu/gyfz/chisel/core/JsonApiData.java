package eu.gyfz.chisel.core;

import java.util.Collections;
import java.util.Map;

public class JsonApiData {

	private final String type;

	private final String id;

	private final Map<String, Object> attributes;

	public JsonApiData(Map<String, Object> attributes, String type, String id) {
		this.type = type;
		this.id = id;
		this.attributes = attributes;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public Map<String, Object> getAttributes() {
		return Collections.unmodifiableMap(attributes);
	}
}
