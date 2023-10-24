public class Animal {

    private String name;
    private String tipe;
    private String color;
    private String gender;
    private int age;
    private String food;
    private Short numOfLegs;
    private boolean isWild;
    private String picture;
    private boolean isFed;

    Animal(){
        this.name = "";
        this.tipe = "";
        this.color = "";
        this.gender = "";
        this.age = 0;
        this.food = "";
        this.numOfLegs = 0;
        this.isWild = false;
        this.picture = "";
        this.isFed = false;
    }

    Animal(String name, String kind, String color, String gender, int age, String food, Short numOfLegs, boolean isWild, String picture){
        this.name = name;
        this.tipe = kind;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.food = food;
        this.numOfLegs = numOfLegs;
        this.isWild = isWild;
        this.picture = picture;
        this.isFed = false;
    }

    public  void feed(){
        isFed = true;
        System.out.println("");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Short getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(Short numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }
}
