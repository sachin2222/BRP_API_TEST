package Utilities;

public enum APIResources {

    SearchResultsAPI("/api/hfae/searchResults"),
    FetchJobCode("/api/hfae/fetchJobCode");
    private String resource;


    APIResources(String resource) {
        this.resource = resource;

    }

    public String getResource() {

        return resource;

    }

}
