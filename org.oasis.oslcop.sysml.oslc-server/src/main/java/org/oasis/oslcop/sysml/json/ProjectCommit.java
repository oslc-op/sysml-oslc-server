package org.oasis.oslcop.sysml.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@type",
    "owningProject",
    "@id",
    "previousCommit",
    "timestamp"
})
public class ProjectCommit {

    @JsonProperty("@type")
    private String type;
    @JsonProperty("owningProject")
    private Project owningProject;
    @JsonProperty("@id")
    private String id;
    @JsonProperty("previousCommit")
    private ProjectCommit previousCommit;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("owningProject")
    public Project getOwningProject() {
        return owningProject;
    }

    @JsonProperty("owningProject")
    public void setOwningProject(Project owningProject) {
        this.owningProject = owningProject;
    }

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("previousCommit")
    public ProjectCommit getPreviousCommit() {
        return previousCommit;
    }

    @JsonProperty("previousCommit")
    public void setPreviousCommit(ProjectCommit previousCommit) {
        this.previousCommit = previousCommit;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
