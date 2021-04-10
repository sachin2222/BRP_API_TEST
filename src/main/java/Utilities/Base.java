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
    public static String cookieValue = ".ZS.AWSStg.Merck.99=E1517726D0DDFB8E9DC5C9CC95FEE8FE0B81CF14CE4E3F6DBF49B9D73A4A9DE2E5FE89AF984B680877430F298D635685AB2A57805D247B3A38707B251B108C10B323C2D67C3CFF4B4833CAB39B7998C962BF670DFFCDB8E48265C9BEE6B9B3ACAFF4F6F4B957844C760DA7D9CC8AF08D179D83EAA4DAD77A17B39C70C2B16FB9B0DC2255B53A46338F02DFDA2CA62B9EB69B50333A9431138EE85B2DBF5F5552A0FCDD31C7596477E169136690930B1188CBD23F7CD92409D7BE1227956915E0DAC9D6DAB9D283E33737D08D1A59963FF01722511FE01204DB333E3E99C8CB11E4CB3F6E55680C8F5926FDE7159427C6155A8C09EEEE63A8CBF0594A7124046D64DC5096B17AEFD83A4A1EF75FC481C5E4A6585F; .AWS.IdentityManager.IDM.OAuth=refreshToken=Spmwt3kBpr0nqUH2BL5OuVoEZNS70HvBLnPDQs4xCRpPA7VnG2F9FXmOUfb5bMXw&initializationVector=vncb7xuRHKJBJSALWw+OQw==; session=.eJyrVkpKTM5OzUtRslJygrDiDQwMlXSU0ory80ogEm5B_n4hrn4uYJlaAKoGD7k.YHGjgA.6QG_Sk2uS1cPmDZ1DgtxyMdHXdw";


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
