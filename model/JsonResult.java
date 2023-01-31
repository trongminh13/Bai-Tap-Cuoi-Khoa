
package finalfile.model;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class JsonResult {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("data_date")
    @Expose
    private String dataDate;
    @SerializedName("generate_date")
    @Expose
    private int generateDate;
    @SerializedName("stats")
    @Expose
    private Stats stats;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JsonResult() {
    }

    /**
     * 
     * @param dataDate
     * @param data
     * @param generateDate
     * @param stats
     */
    public JsonResult(List<Datum> data, String dataDate, int generateDate, Stats stats) {
        super();
        this.data = data;
        this.dataDate = dataDate;
        this.generateDate = generateDate;
        this.stats = stats;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public int getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(int generateDate) {
        this.generateDate = generateDate;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
