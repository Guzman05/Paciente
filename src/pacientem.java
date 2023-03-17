public class pacientem {
    private String name;
    private Integer age;
    private Integer height;
    private Integer weight;
    private char sex;

    public pacientem(){}

    public pacientem(String name, Integer age, Integer height, Integer weight, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    Double imc(Integer Weight, Integer Height ) {
        return (double) weight / (height * height);
    }

    public String compotition(Double imc) {
        if (imc < 18.5) {
            return "UnderWeight";
        } else if (imc >= 18.5 && imc < 25){
            return "Normal";
        } else if (imc >= 25 && imc < 30) {
            return "OverWeight";
        } else {
            return "Obesity";
        }
    }
}
