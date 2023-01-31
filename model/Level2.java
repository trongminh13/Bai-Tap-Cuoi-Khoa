
package finalfile.model;

import java.util.List;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Level2 {

    @SerializedName("level2_id")
    @Expose
    private String level2Id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("level3s")
    @Expose
    private List<Level3> level3s = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Level2() {
    }

    /**
     * 
     * @param level2Id
     * @param name
     * @param type
     * @param level3s
     */
    public Level2(String level2Id, String name, String type, List<Level3> level3s) {
        super();
        this.level2Id = level2Id;
        this.name = name;
        this.type = type;
        this.level3s = level3s;
    }

    public String getLevel2Id() {
        return level2Id;
    }

    public void setLevel2Id(String level2Id) {
        this.level2Id = level2Id;
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

    public List<Level3> getLevel3s() {
        return level3s;
    }

    public void setLevel3s(List<Level3> level3s) {
        this.level3s = level3s;
    }

}
