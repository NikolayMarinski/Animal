public class Fish extends Animal{

    private int sizeInSm;

    Fish(){
        this.sizeInSm = 0;
    }

    Fish(int sizeInSm){
        this.sizeInSm = sizeInSm;
    }

    public void swim(){
        System.out.println();
    }

    public int getSizeInSm() {
        return sizeInSm;
    }

    public void setSizeInSm(int sizeInSm) {
        this.sizeInSm = sizeInSm;
    }
}
