package org.Api.test;

import Utilities.APIResources;
import Utilities.Base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.DataProviders.DataProviders;
import org.Payload.SearchResultPayload;
import org.Pojo.SearchResultsPojo;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SearchResultAPITest extends Base {
    SearchResultsPojo pj;
    RequestSpecification req;
    Response res;
    List<String> gpo_list;
    List<String> hin_list;

    @Test(priority = 0, dataProvider = "getGPOData", dataProviderClass = DataProviders.class)
    public void getGPOList(String gpo[]) {
        gpo_list = Arrays.asList(gpo);

    }


    @Test(priority = 1, dataProvider = "getHINData", dataProviderClass = DataProviders.class)
    public void getHINList(String hin[]) {
        hin_list = Arrays.asList(hin);
        pj = SearchResultPayload.getPojo(gpo_list, hin_list);
    }


    @Test(priority = 2)
    public void setRequestParameters() throws FileNotFoundException {
        req = given().spec(get_Request_Specifications_For_SearchResultsAPI());


    }

    @Test(priority = 3)
    public void load_Request_Body_on_API() {
        String APIResource = APIResources.valueOf("SearchResultsAPI").getResource();
        res = req.when().body(pj).post(APIResource);


    }

    @Test(priority = 4)
    public void get_API_Response() {
        System.out.println(res.getBody().asString());

    }

    @Test(priority = 5)
    public void Validate_Status_Code() {
        res.then().assertThat().statusCode(200);
    }

    @Test(priority = 6)
    public void getHeaders() {
        System.out.println(res.getHeaders());
    }

    @Test(priority = 7)
    public void deserailise_response() {
        SearchResultsPojo responsePojo = res.getBody().as(SearchResultsPojo.class);/// deserialise
        System.out.println(responsePojo.getStatus());
        System.out.println(responsePojo.getResult().getTotal_parity_id());
        System.out.println(responsePojo.getResult().getTotal_records());
        System.out.println(responsePojo.getResult().getGrid_data());


    }


}
