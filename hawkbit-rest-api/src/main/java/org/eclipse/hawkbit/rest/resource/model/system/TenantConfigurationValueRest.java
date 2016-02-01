package org.eclipse.hawkbit.rest.resource.model.system;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TenantConfigurationValueRest extends ResourceSupport {

    @JsonInclude(Include.ALWAYS)
    private Object value = null;

    @JsonInclude(Include.ALWAYS)
    private boolean isGlobal = true;

    private Long lastModifiedAt = null;
    private String lastModifiedBy = null;
    private Long createdAt = null;
    private String createdBy = null;

    public Object getValue() {
        return value;
    }

    public void setValue(final Object value) {
        this.value = value;
    }

    public boolean isGlobal() {
        return isGlobal;
    }

    public void setGlobal(final boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public Long getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(final Long lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(final String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }

}
