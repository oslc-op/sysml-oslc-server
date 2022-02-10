package org.oasis.oslcop.sysml.resources.view;

import java.net.URI;
import java.util.List;

public class ProjectCommitViewModel {
    private final String id;
    private final Boolean selected;
    private final List<ServiceProviderViewModel> providers;
    private final URI uri;

    public ProjectCommitViewModel(String id, Boolean selected,
                                  List<ServiceProviderViewModel> providers, URI uri) {
        this.id = id;
        this.selected = selected;
        this.providers = providers;
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public Boolean isSelected() {
        return selected;
    }

    public List<ServiceProviderViewModel> getProviders() {
        return providers;
    }

    public URI getUri() {
        return uri;
    }

    public static class ServiceProviderViewModel {
        private final String identifier;

        public String getIdentifier() {
            return identifier;
        }

        public ServiceProviderViewModel(String id) {this.identifier = id;}
    }
}
