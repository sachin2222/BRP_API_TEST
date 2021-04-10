package org.Payload;

import org.Pojo.SearchResultsPojo;
import java.util.List;

public class SearchResultPayload {

    public static SearchResultsPojo getPojo(List<String> gpo_list,List<String> hin_list) {
        SearchResultsPojo pojo = new SearchResultsPojo();
        pojo.setGpo_id(gpo_list);
        pojo.setBuying_group_id("");
        pojo.setAccount_coalition_id("");
        pojo.setService_type_id("");
        pojo.setCp_ow_id("");
        pojo.setCustomer_id("");
        pojo.setCot_cust_type_id("");
        pojo.setDea_id("");
        pojo.setHin_id(hin_list);
        pojo.setState_id("");


        pojo.setLimit(30);
        pojo.setOffset(0);
        pojo.setSort_type("ascending");
        pojo.setSort_on("name_party_id");
        pojo.setUser_id("zs\\ss26370");

        return pojo;


    }
}
