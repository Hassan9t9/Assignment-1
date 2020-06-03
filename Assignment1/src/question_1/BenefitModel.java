package question_1;

public class BenefitModel {
    private int id;
    private String benefit;
    private String tag;

    public BenefitModel(int id, String benefit, String tag) {
        this.id = id;
        this.benefit = benefit;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
