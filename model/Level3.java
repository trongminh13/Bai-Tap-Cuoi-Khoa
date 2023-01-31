
package finalfile.model;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Level3 {

    @SerializedName("level3_id")
    @Expose
    private String level3Id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Level3() {
    }

    /**
     * 
     * @param name
     * @param level3Id
     * @param type
     */
    public Level3(String level3Id, String name, String type) {
        super();
        this.level3Id = level3Id;
        this.name = name;
        this.type = type;
    }

    public String getLevel3Id() {
        return level3Id;
    }

    public void setLevel3Id(String level3Id) {
        this.level3Id = level3Id;
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

}
