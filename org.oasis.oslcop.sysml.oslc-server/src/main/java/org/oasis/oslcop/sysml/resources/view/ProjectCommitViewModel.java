package org.oasis.oslcop.sysml.resources.view;

import java.net.URI;
import java.util.List;

public class ProjectCommitViewModel {
    private final String id;
    private final Boolean selected;
    private final String serviceProviderUri;
    private final URI uri;

    public ProjectCommitViewModel(String id, Boolean selected,
                                  String serviceProviderUri, URI uri) {
        this.id = id;
        this.selected = selected;
        this.serviceProviderUri = serviceProviderUri;
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public Boolean isSelected() {
        return selected;
    }

    public String getServiceProviderUri() {
        return serviceProviderUri;
    }

    public URI getUri() {
        return uri;
    }

}
