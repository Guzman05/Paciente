public class Paciente {
    private String name;
    private Double wight;
    private Double height;
    private int Age;
    private char Sex;



    public Paciente(String name, double wight, double height, int Age, char Sex) {
        this.name = name;
        this.wight = wight;
        this.height = height;
        this.Age = Age;
        this.Sex = Sex;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWight() {
        return wight;
    }

    public void setWight(Double wight) {
        this.wight = wight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char sex) {
        Sex = sex;
    }

    public void datos() {
        double imc = getWight() / getHeight() * getHeight();

        if(imc < 18.5){
            System.out.println("Esta por debajo del peso normal");


        }else if (imc>18.5 || imc <25){
            System.out.println("esta en peso noral");


        }else if (imc >=25 || imc < 30){

            System.out.println("Estas en sorepeso");
        }
    }


}
