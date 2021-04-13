package org.Pojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.testng.collections.Lists;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nested_Result_Pojo {
    private List<Integer> total_parity_id;
    private int total_records;
    private List<Nested_grid_data> grid_data= Lists.newArrayList();

    public List<Nested_grid_data> getGrid_data() {
        return grid_data;
    }

    public void setGrid_data(List<Nested_grid_data> grid_data) {
        this.grid_data = grid_data;
    }





    public List<Integer> getTotal_parity_id() {
        return total_parity_id;
    }

    public void setTotal_parity_id(List<Integer> total_parity_id) {
        this.total_parity_id = total_parity_id;
    }




    public int getTotal_records() {
        return total_records;
    }

    public void setTotal_records(int total_records) {
        this.total_records = total_records;
    }







}
