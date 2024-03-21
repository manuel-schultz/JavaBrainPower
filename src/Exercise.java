import java.util.Random;

public class Exercise {
    // type can be "math" or "rememberstring".
    private String type;
    private Integer level;

    public void setType(String type) {
        if (type.toLowerCase() == "math") {
            this.type = "math";
        } else if (type.toLowerCase() == "rememberstring") {
            this.type = "rememberstring";
        } else {
            System.out.println("ERROR in Excercise.setType(\"" + type + "\"): Not allowed type!");
        }
    }

    public String getType() {
        return type;
    }

    public void setLevel(Integer level) {
        if (level >= 1 && level <= 2) {
            this.level = level;
        } else {
            System.out.println("ERROR in Excercise.setLevel(" + level + "): Not allowed level!");
        }
    }

    public Integer getLevel() {
        return level;
    }

    public Integer generateRandomNumber(Integer min, Integer max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public String chooseRandomString(String[] strings) {
        Integer length = strings.length;
        Integer index = generateRandomNumber(0, length - 1);
        return strings[index];
    }
    
}
