
package finalfile.model;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Stats {

    @SerializedName("elapsed_time")
    @Expose
    private double elapsedTime;
    @SerializedName("level1_count")
    @Expose
    private int level1Count;
    @SerializedName("level2_count")
    @Expose
    private int level2Count;
    @SerializedName("level3_count")
    @Expose
    private int level3Count;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stats() {
    }

    /**
     * 
     * @param level3Count
     * @param level1Count
     * @param elapsedTime
     * @param level2Count
     */
    public Stats(double elapsedTime, int level1Count, int level2Count, int level3Count) {
        super();
        this.elapsedTime = elapsedTime;
        this.level1Count = level1Count;
        this.level2Count = level2Count;
        this.level3Count = level3Count;
    }

    public double getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public int getLevel1Count() {
        return level1Count;
    }

    public void setLevel1Count(int level1Count) {
        this.level1Count = level1Count;
    }

    public int getLevel2Count() {
        return level2Count;
    }

    public void setLevel2Count(int level2Count) {
        this.level2Count = level2Count;
    }

    public int getLevel3Count() {
        return level3Count;
    }

    public void setLevel3Count(int level3Count) {
        this.level3Count = level3Count;
    }

}
