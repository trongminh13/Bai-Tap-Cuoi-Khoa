package finalfile.model;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Datum {

    @SerializedName("level1_id")
    @Expose
    private String level1Id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("level2s")
    @Expose
    private List<Level2> level2s = null;

    /**
     * No constructor for use in serialization
     *
     */
    public Datum() {
    }

    /**
     *
     * @param name
     * @param level1Id
     * @param type
     * @param level2s
     */
    public Datum(String level1Id, String name, String type, List<Level2> level2s) {
        super();
        this.level1Id = level1Id;
        this.name = name;
        this.type = type;
        this.level2s = level2s;
    }

    public String getLevel1Id() {
        return level1Id;
    }

    public void setLevel1Id(String level1Id) {
        this.level1Id = level1Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Level2> getLevel2s() {
        return level2s;
    }

    public void setLevel2s(List<Level2> level2s) {
        this.level2s = level2s;
    }

}
