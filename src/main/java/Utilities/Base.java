package Utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Base {

    public static String baseURI = "https://api-cce-brd.dev.zsservices.com";
    public static String cookieValue="";
    public static RequestSpecification get_Request_Specifications_For_SearchResultsAPI() throws FileNotFoundException {

        PrintStream log = new PrintStream(new FileOutputStream("LOGGING_FOR_SEARCH_RESULTS.txt"));

        RequestSpecification req = new RequestSpecBuilder()
                .setBaseUri(baseURI)
                .setContentType(ContentType.JSON)
                .addHeader("Cookie", cookieValue)
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .build();

        return req;

    }
}
