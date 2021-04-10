package org.Pojo;

import java.util.List;

public class SearchResultsPojo {
    private int offset;
    private int limit;
    private String user_id;
    private String sort_on;
    private String sort_type;
    private List<String> gpo_id;
    private String cp_ow_id;
    private String account_coalition_id;
    private String buying_group_id;
    private String customer_id;
    private String state_id;
    private String cot_cust_type_id;
    private String service_type_id;
    private String dea_id;
    private List<String> hin_id;


    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getCot_cust_type_id() {
        return cot_cust_type_id;
    }

    public void setCot_cust_type_id(String cot_cust_type_id) {
        this.cot_cust_type_id = cot_cust_type_id;
    }

    public String getService_type_id() {
        return service_type_id;
    }

    public void setService_type_id(String service_type_id) {
        this.service_type_id = service_type_id;
    }

    public String getDea_id() {
        return dea_id;
    }

    public void setDea_id(String dea_id) {
        this.dea_id = dea_id;
    }

    public List<String> getHin_id() {
        return hin_id;
    }

    public void setHin_id(List<String> hin_id) {
        this.hin_id = hin_id;
    }

    public void setBuying_group_id(String buying_group_id) {
        this.buying_group_id = buying_group_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCp_ow_id() {
        return cp_ow_id;
    }

    public void setCp_ow_id(String cp_ow_id) {
        this.cp_ow_id = cp_ow_id;
    }

    public void setAccount_coalition_id(String account_coalition_id) {
        this.account_coalition_id = account_coalition_id;
    }

    public String getAccount_coalition_id() {
        return account_coalition_id;
    }

    public String getBuying_group_id() {
        return buying_group_id;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSort_on() {
        return sort_on;
    }

    public void setSort_on(String sort_on) {
        this.sort_on = sort_on;
    }

    public String getSort_type() {
        return sort_type;
    }

    public void setSort_type(String sort_type) {
        this.sort_type = sort_type;
    }

    public List<String> getGpo_id() {
        return gpo_id;
    }

    public void setGpo_id(List<String> gpo_id) {
        this.gpo_id = gpo_id;
    }


}
