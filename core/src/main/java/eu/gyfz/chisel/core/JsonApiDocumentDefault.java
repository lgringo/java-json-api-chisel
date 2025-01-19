package eu.gyfz.chisel.core;

import java.util.List;
import java.util.Map;

/**
 * Represents a JSON API document.
 * <p>
 * See <a href="https://jsonapi.org/format/#document-top-level">JSON API Document </a>
 * </p>
 * A JSON object <strong>MUST</strong> be at the root of every JSON:API request and response document containing data. This object defines a document’s “top level”.
 * <p>
 * A document <strong>MUST</strong> contain at least one of the following top-level members :
 * <ul>
 *   <li><b>data</b>: the document’s “primary data”</li>
 *   <li><strong>errors</strong>: an array of error objects</li>
 *   <li><strong>meta</strong>: a meta object that contains non-standard meta-information.</li>
 * </ul>
 */
public class JsonApiDocumentDefault {

    /**
     * The document’s “primary data”.
     */
    private JsonApiData data;

    private List<JsonApiError> errors;

    private Map<String, Object> meta;

    public JsonApiDocumentDefault() {
        this.data = null;
        this.errors = null;
        this.meta = null;
    }

    public JsonApiData getData() {
        return data;
    }

    public void setData(final String type, final String id, Map<String, Object> attributes) {
        this.data = new JsonApiData(attributes, type, id);
    }


}
